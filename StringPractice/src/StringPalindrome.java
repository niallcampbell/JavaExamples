import java.util.Scanner;

public class StringPalindrome {
    
    public static boolean checkIfPalindrome(String word){

        int i = 0;
        int j = word.length() -1;

        while(i < j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter a word to see if it is a palindrome: ");
            String word = scan.nextLine();
            if(checkIfPalindrome(word)){
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        } finally {
            scan.close();
        } 
    }
}
