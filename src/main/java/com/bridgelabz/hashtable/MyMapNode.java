package com.bridgelabz.hashtable;

public class MyMapNode<K extends Comparable <K>, V extends Comparable <V> >{
    public MyMapNode<K, V> link;
    public V value;
    public K key;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.link = null;
    }

}

