package com.bridgelabz.hashtable;

public class FrequencyTable< K extends Comparable <K>> extends MyHashTable<K  , Integer>{
    public FrequencyTable(Integer defValue) {
        super(defValue);
    }

    public void add(K key){
        int preVal = get(key);
        put(key,preVal+1 );
    }
}
