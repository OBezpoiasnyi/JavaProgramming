package day16_ForLoopPractices;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        String str = "aabbbcccc";
        
        String result = ""; //abc

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);

            if(!result.contains(ch)) {
                result += ch;
            }
        }

        System.out.println("result = " + result);
        
    }
}
