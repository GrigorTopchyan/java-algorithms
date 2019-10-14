package hashtable;
 /**
 * @author AnkitMittal, JavaMadeSoEasy.com
 * Copyright (c), AnkitMittal . All Contents are copyrighted and must not be
 * reproduced in any form.
 * This class provides custom implementation of HashMap(without using java api's)-
 * which allows us to store data in key-value pair form.
 * insertion order of key-value pairs is not maintained.
 * @param <K>
 * @param <V>
 */

/**
 * Main class- to test HashMap functionality.
 */
public class HashMapCustomApp {
     
    public static void main(String[] args) {
           HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
           hashMapCustom.put(21, 12);
           hashMapCustom.put(25, 121);
           hashMapCustom.put(30, 151);
           hashMapCustom.put(33, 15);
           hashMapCustom.put(35, 89);
 
           System.out.println("value corresponding to key 21="
                        + hashMapCustom.get(21));
           System.out.println("value corresponding to key 51="
                        + hashMapCustom.get(51));
 
           System.out.print("Displaying : ");
           hashMapCustom.display();
 
           System.out.println("\n\nvalue corresponding to key 21 removed: "
                        + hashMapCustom.remove(21));
           System.out.println("value corresponding to key 51 removed: "
                        + hashMapCustom.remove(51));
 
           System.out.print("Displaying : ");
           hashMapCustom.display();
 
    }
}
 
/*Output
 
value corresponding to key 21=12
value corresponding to key 51=null
Displaying : {21=12} {25=121} {33=15} {30=151} {35=89}
 
value corresponding to key 21 removed: true
value corresponding to key 51 removed: false
Displaying : {25=121} {33=15} {30=151} {35=89} 
 
*/