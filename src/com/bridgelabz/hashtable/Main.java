package com.bridgelabz.hashtable;

//Main class
public class Main {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");

        MyHashMap<String, Integer> wordFrequencyMap = new MyHashMap<>(10);

        // Count the frequency of each word
        for (String word : words) {
            Integer frequency = wordFrequencyMap.get(word);
            if (frequency == null) {
                wordFrequencyMap.add(word, 1);
            } else {
                wordFrequencyMap.add(word, frequency + 1);
            }
        }

        // Display the word frequencies
        System.out.println("Word frequencies:");
        for (String word : wordFrequencyMap.getKeys()) {
            System.out.println(word + ": " + wordFrequencyMap.get(word));
        }
    }
}
