import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hash Maps ");
//        String name = "Karan";
//        int code = name.hashCode();
//        System.out.println(code); // 72266473
//
//        //Map Implementation
//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put("Karan", 99);
//        map.put("Badhwar", 89);
//        map.put("Karan Badhwar", 100);
//
//        System.out.println(map.get("Karan"));
//
//        System.out.println(map.getOrDefault("BBB", 0));
//
//        System.out.println(map.containsKey("Karan"));
//
//        //Set Implementation
//        HashSet<Integer>  set = new HashSet();
//
//        set.add(556);
//        set.add(556);
//        set.add(987);
//        set.add(345);
//        set.add(420);
//
//        System.out.println(set);
//
//        //TreeMap Implementation
//        TreeMap<String, Integer> treeMap = new TreeMap<>();
//
//        treeMap.put("Karan", 99);
//        treeMap.put("K", 34);
//        treeMap.put("B", 9);
//        treeMap.put("KB", 79);
//
//        System.out.println(treeMap);
//
//        //Custom HashMap Class
//        MapUsingHash mapUsingHash = new MapUsingHash();
//        mapUsingHash.put("Mango", "King of fruits");
//        mapUsingHash.put("Apple", "A Sweet red fruit");
//        mapUsingHash.put("Litchi", "Sweet Tooth");
//
//        System.out.println(mapUsingHash.get("Apple"));
//
//        HashMapUsingLL<String, String> mapUsingLL = new HashMapUsingLL<>();
//        mapUsingLL.put("Mango", "King of fruits");
//        mapUsingLL.put("Apple", "A Sweet red fruit");
//        mapUsingLL.put("Litchi", "Sweet Tooth");
//
//        System.out.println(mapUsingLL.toString());

        HashMapUsingLL<Integer, String> map = new HashMapUsingLL<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, "Value" + i);
        }
        map.analyzeDistribution();

    }
}