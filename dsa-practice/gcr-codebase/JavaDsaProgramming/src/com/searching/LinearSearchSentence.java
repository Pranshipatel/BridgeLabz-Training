package com.searching;

public class LinearSearchSentence {

    public static String searchSentence(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {

            if (sentences[i].contains(word)) {
                return sentences[i];   // First matching sentence
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful language",
            "Data structures are important",
            "Linear search is simple",
            "Algorithms help solve problems"
        };

        String wordToSearch = "search";

        String result = searchSentence(sentences, wordToSearch);

        System.out.println(result);
    }
}
