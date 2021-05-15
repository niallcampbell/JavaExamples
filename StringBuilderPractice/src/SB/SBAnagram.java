package SB;

import java.util.Arrays;

public class SBAnagram {
    
    public static void main(String ... args){

        StringBuilder sb1 = new StringBuilder("fired");
        StringBuilder sb2 = new StringBuilder("fried");
        System.out.println(isAnagram(sb1, sb2));

    }


    public static boolean isAnagram(StringBuilder sb1, StringBuilder sb2){

        if(sb1.length() != sb2.length()){
            return false;
        }

        final char [] c1 = sb1.toString().toCharArray();
        final char [] c2 = sb2.toString().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++){
            if(c1[i] != c2[i]) return false;
        }

        return true;
    }
}
