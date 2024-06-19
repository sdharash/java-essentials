package hashmapimplementation;

public class MyHashMap<K, V> {
    Node<K, V>[] buckets;

    public MyHashMap(int capacity) {
        this.buckets = new Node[capacity];
    }

    //method to get bucket index where the key is stored
    public int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    //method to fetch the value for given input key
    public V get(K key) {
        int index = getBucketIndex(key);
//        Node<K, V> newNode = new Node<>()
        Node<K, V> currentNode = buckets[index];

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        //returning null when key is not present in hashmap
        return null;
    }

    //method to put new <key, value> pair in hashmap
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Node<K, V> currentNode = buckets[index];

        if (currentNode == null) {
            buckets[index] = new Node<>(key, value);
        } else {
            Node<K, V> prevNode = null;
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = new Node<>(key, value);
        }
    }

    //method to remove <key, value> pair from the hashmap
    public void remove(K key) {
        int index = getBucketIndex(key);
        Node<K, V> currentNode = buckets[index];
        Node<K, V> prevNode = null;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                if (prevNode == null) {
                    buckets[index] = currentNode.next;
                    return;
                }
                prevNode.next = currentNode.next;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

}
