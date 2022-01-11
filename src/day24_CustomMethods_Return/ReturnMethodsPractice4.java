package day24_CustomMethods_Return;

public class ReturnMethodsPractice4 {

    public static void main(String[] args) {

        String result = removeDuplicates("qqwwweeee");
        System.out.println(result);

    }

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

           char each = str.charAt(i);

           if(!result.contains("" + each)){
               result+= each;
           }

        }
        return result;
    }

}
