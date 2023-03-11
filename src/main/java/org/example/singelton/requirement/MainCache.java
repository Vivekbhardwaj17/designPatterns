package org.example.singelton.requirement;

public class MainCache {
    public static void main(String[] args) {
        String cache = CacheClass.getCatche();
        if(cache == null){
            CacheClass.initializeCache();
            cache = CacheClass.getCatche();
        }
        System.out.println(cache);
    }
}
