package basics;

import java.util.*;

public class ArrayList_HashSet_HashMap_ {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Papaya");
        list.add("Sweet Lime");
        list.add("Orange");
        list.add("Grapes");
        list.add("Grapes");
        System.out.println(list);
        System.out.println("************");
        Set<String> uniqueSet = new HashSet<>(list);
        System.out.println(uniqueSet);
        System.out.println("************");
        Map<Integer, String> map = new HashMap<>();
        for (int i=1;i<list.size();i++){
           map.put(i, list.get(i));
        }
        System.out.println(map);

    }
}
