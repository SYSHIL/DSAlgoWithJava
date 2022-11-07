package DynamicArray;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> array = new DynamicArray<String>();
        array.add("ilhan");
        array.add("nishadh");
        array.add("shoie");
        array.add("rifadh");
        array.add("thanveer");
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
