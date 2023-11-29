package com.bridgelabz.hashtable;

import java.util.*;

/**
 *
 * @desc This class represents the HashMap.
 * @param <K> key representing the word
 * @param <V> value representing the frequency of word
 */
public class MyHashMap<K, V> {
    private LinkedList<MyMapNode<K, V>>[] buckets;
    private int size;

    /**
     *
     * @desc Constructor to initialize size and buckets of the hashmap.
     * @param size key representing the word
     */
    public MyHashMap(int size) {
        this.size = size;
        this.buckets = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    /**
     *
     * @desc Adding to HashMap
     * @param key key representing the word
     * @param value frequency of the word
     */
    public void add(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> bucket = buckets[index];
        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);

        // Check if the key already exists in the bucket
        for (MyMapNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // Update the value if key exists
                return;
            }
        }

        bucket.add(newNode); // Add a new node if the key doesn't exist
    }


    /**
     * @desc Checking if key exists and returns frequency
     * @param key Input key which is the word
     * @return frequency of the key if it exists or else null
     */
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> bucket = buckets[index];

        // Check if the key exists in the bucket
        for (MyMapNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null; // Return null if key not found
    }

    /**
     *
     * @desc Retrieves all keys stored in the hash map
     * @return A list containing all keys in the hash map.
     */
    public List<K> getKeys() {
        List<K> keys = new ArrayList<>();
        for (LinkedList<MyMapNode<K, V>> bucket : buckets) {
            for (MyMapNode<K, V> node : bucket) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    /**
     * @desc Calculates the index of the bucket in the hash map for a given key.
     * @param key The key for which the bucket index is calculated.
     * @return The index of the bucket in the hash map.
     */
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % size);
    }
}
