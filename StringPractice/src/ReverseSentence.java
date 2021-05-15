package src;

public class ReverseSentence{

    public static String reverseSentence(String sentence){

        String[] words = sentence.split(" ");

        //reverse sentence
        int length = words.length;
        int i = 0;
        int j = length - 1;
        String temp = "";

        while(i < j){
            temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }

        String reversedSentence = String.join(" ", words);

        return reversedSentence;
    }

    public static void main(String[] args) {
        String sentence = "Hello world nice to meet you";
        System.out.println("Sentence: " + sentence);
        System.out.println("Sentence reversed: " + reverseSentence(sentence));
    }

}