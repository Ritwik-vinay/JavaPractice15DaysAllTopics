package basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetAndViseVersa {
    static void main() {
        List addNames = new ArrayList();
        addNames.add("Amit");
        addNames.add(1);
        addNames.add("Ram");
        addNames.add(2);
        addNames.add("Ram");
        addNames.add(3);
        addNames.add("Bhanu");
        addNames.add(4);
        //LIST ADDING THE VALUES
        System.out.println("Original List : \n" + addNames);
        //LIST TO SET
        Set uniqueName =new HashSet(addNames);

        System.out.println("Adding unique names to SET: \n" + uniqueName);
        // SET TO LIST
        List uniqueNameList = new ArrayList(uniqueName);
        System.out.println("Unique Name List : \n" + uniqueNameList);
    }
}
