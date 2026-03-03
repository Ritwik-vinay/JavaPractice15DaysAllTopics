package basics;

import java.util.HashMap;
import java.util.Map;

public class countFrequencyString {
    static void main() {
        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Banana",
                "Orange", "Orange", "Apple", "Orange", "Grape"};
        Map<String, Integer> frequency = frequencyChecker(fruits);
        System.out.println("Frquency of Element");
        for (Map.Entry<String,Integer> entry: frequency.entrySet()){
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }
    }


    static Map<String, Integer> frequencyChecker(String[] input ){
        Map<String, Integer> map = new HashMap<>();

        for (String in: input){
            map.put(in, map.getOrDefault(in,0)+1);
        }
        return map;
    }
}
