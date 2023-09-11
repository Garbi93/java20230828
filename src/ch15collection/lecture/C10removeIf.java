package ch15collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("jsp");
        set.add("spring");
        System.out.println("set = " + set);

        // 아래의 for문과 같은값을 출력한다.
        set.removeIf(e-> e.equals("css"));

        /*
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
            if(item.equals("css")){
                iterator.remove();
                //set.remove(item);
            }
        }
        */
        System.out.println("set = " + set);
    }
}
