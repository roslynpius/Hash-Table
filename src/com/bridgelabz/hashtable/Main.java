package com.bridgelabz.hashtable;

//Main class
public class Main {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but "
                + "because they keep putting themselves deliberately into paranoid avoidable situations";
        // Remove the word "avoidable"
        String wordToRemove = "avoidable";

        String[] words = paragraph.split(" ");

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

        // Display the word frequencies before removal
        System.out.println("Word frequencies before removal:");
        for (String word : wordFrequencyMap.getKeys()) {
            System.out.println(word + ": " + wordFrequencyMap.get(word));
        }

        // Remove the specified word
        wordFrequencyMap.remove(wordToRemove);

        // Display the word frequencies after removal
        System.out.println("\nWord frequencies after removal:");
        for (String word : wordFrequencyMap.getKeys()) {
            System.out.println(word + ": " + wordFrequencyMap.get(word));
        }
    }
}
