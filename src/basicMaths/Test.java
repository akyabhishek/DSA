package basicMaths;

import java.util.*;

public class Test {
    public static void main(String args[]) {


        hs();

    }

    private static void hs() {
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(23);
        set.add(44);
        set.add(44);
        set.add(44);
        System.out.println(set);

    }

    static void pq() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(4);
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.peek());
        System.out.println(Arrays.toString(queue.toArray()));
    }

    void map() {
        Map<String, Integer> map = new HashMap();
        map.put("Abhishek", 234);
        map.put("Raj", 2343);
        map.put("Dev", 23423);

        System.out.println();
    }

    static void arraylist() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(0, 6);
        System.out.println(list.getFirst());

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
