package com.itheima.hashset;

import java.util.HashSet;

public class HashSetDemo3 {
    /*
        桶下标(索引)的计算
     */
    public static void main(String[] args) {
        int aHash = "a".hashCode() ^ ("a".hashCode() >>> 16);
        System.out.println(aHash % 16);
        System.out.println((16 - 1) & aHash);//效率比（aHash % 16）高

        int bHash = "b".hashCode() ^ ("b".hashCode() >>> 16);
        System.out.println(bHash % 16);
        System.out.println((16 - 1) & bHash);

        int cHash = "c".hashCode() ^ ("c".hashCode() >>> 16);
        System.out.println(cHash % 16);
        System.out.println((16 - 1) & cHash);

        int pHash = "p".hashCode() ^ ("p".hashCode() >>> 16);
        System.out.println(pHash % 16);
        System.out.println((16 - 1) & pHash);

        int qHash = "q".hashCode() ^ ("q".hashCode() >>> 16);
        System.out.println(qHash % 16);
        System.out.println((16 - 1) & qHash);

        HashSet<String> hs = new HashSet<>();
        hs.add("b");
        hs.add("a");
        hs.add("c");
        hs.add("p");
        hs.add("q");

        System.out.println(hs);
    }
}
