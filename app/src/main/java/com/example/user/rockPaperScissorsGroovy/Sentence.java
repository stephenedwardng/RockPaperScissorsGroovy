package com.example.user.rockPaperScissorsGroovy;

/**
 * Created by user on 03/07/2017.
 */

public class Sentence {

    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;

    }

    public int countWords() {
        int wordCount = 1;

        for(int count = 0; count < sentence.length(); count++)
        {
            if(sentence.charAt(count)==' ')
                wordCount++;
        }

        return wordCount;
    }

    public String prettyCountWords() {
        return String.format("There are %s words in your sentence", countWords());
    }

}
