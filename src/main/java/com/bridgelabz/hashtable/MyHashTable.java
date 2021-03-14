package com.bridgelabz.hashtable;

public class MyHashTable<K extends Comparable <K>, V extends Comparable <V> > {
    public MyMapNode<K, V> head;
    public V defValue;
    public MyHashTable() {
        this.head = null;
    }

    public MyHashTable(V defValue) {
        this();
        this.defValue = defValue;
    }

    public V get(K key){
        MyMapNode<K, V> temp = head;
        while(temp != null ){
            if(temp.key.compareTo(key) == 0){
                return temp.value;
            }
            temp = temp.link;
        }
        return defValue;
    }

    public void put(K key, V value){
        if(head == null){
            head = new MyMapNode<>(key, value);
            return;
        }
        MyMapNode<K, V> temp = head;
        while(temp.link != null ){
            if(temp.key.compareTo(key) == 0){
                temp.value = value;
                return;
            }
            temp = temp.link;
        }
        if(temp.key.compareTo(key) == 0) {
            temp.value = value;
            return;
        }
        temp.link = new MyMapNode<>(key, value);
    }
}
