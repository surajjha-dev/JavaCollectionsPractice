package Map;

import java.util.WeakHashMap;

public class WeakHashMapCreation {
    public static void main(String[] args) throws InterruptedException {

        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(20);
        Integer integer3 = new Integer(30);
        Integer integer4 = null;

        WeakHashMap weakHashMap = new WeakHashMap();

        weakHashMap.put(integer1, "Suraj");
        weakHashMap.put(integer2, "Kumar");
        weakHashMap.put(integer3, "Jha");
        weakHashMap.put(integer4, "Jarvis");

        System.out.println(weakHashMap);

        integer3 = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("After Garbage Collection");

        System.out.println(weakHashMap);
    }
}
