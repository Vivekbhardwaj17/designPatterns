package org.example.singelton.requirement;

public class CacheClass {
    private static String meHuChache;
    private CacheClass(String meHuChache){
        this.meHuChache = meHuChache;
    }
    public static String getCatche(){
        return this.meHuChache;
    }
    public static void initializeCache(){
        if(this.meHuChache == null){
            this.meHuChache = "Cache";
        }
    }
}
