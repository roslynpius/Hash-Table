package com.bridgelabz.hashtable;

/**
 *
 * @desc This class represents a Node in the LinkedList.
 * @param <K> key representing the word
 * @param <V> value representing the frequency of word
 */
public class MyMapNode<K, V> {
    K key;
    V value;

    /**
     * @desc This constructor to initialize the node
     * @param key key representing the word
     * @param value value representing the frequency of word
     */
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
