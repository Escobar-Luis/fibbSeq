package com.fibbSeq;

public class Main {
    public static void main(String[] args) {

        System.out.println(fibbSeq(6));


    }
    HashMap<String, Integer> fruitInventory = new HashMap<>();
    public static int fibbSeq(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        cache.add(n)

        int res = fibbSeq(n-1) + fibbSeq(n-2);
        return res;
    }
}