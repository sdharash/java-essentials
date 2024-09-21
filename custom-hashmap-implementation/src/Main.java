public class Main {

    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>(16);

        map.put("TestKey", "TestValue");
        System.out.println(map.get("TestKey"));

        map.remove("TestKey");
        System.out.println(map.get("TestKey"));
    }
}
