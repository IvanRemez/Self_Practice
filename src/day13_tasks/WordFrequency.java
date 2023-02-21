package day13_tasks;

public class WordFrequency {

    public static int frequencyOfWord(String sentence, String word){

        int sentenceLength = sentence.length();  //11
        int length = word.length();  //4
        sentence =  sentence.toLowerCase().replace(word.toLowerCase(),"");
        int result = sentenceLength-sentence.length();
        result = result/length;
        return result;

    }

    public static void main(String[] args) {

        System.out.println(frequencyOfWord("I love Java", "java"));

    }
}
/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */