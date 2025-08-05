package introduction;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapsClass {
    public static void main(String[] args) {

        Map<Integer, String> simpleMap = new HashMap<>();
        simpleMap.put(1, "One");
        simpleMap.put(2, "Two");
        simpleMap.put(3, "Three");

        System.out.println("WITH KEY SET:");
        for(Integer key : simpleMap.keySet()){
            System.out.println(simpleMap.get(key));
        }

        System.out.println("WITH VALUES:");
        for(String values : simpleMap.values()){
            System.out.println(values);
        }

        System.out.println("WITH ENTRY SET:");
        for(Map.Entry<Integer, String> data : simpleMap.entrySet()){
            System.out.println(data.getValue());
        }
    }
}
