package day16_ForLoopPractices;

public class uniqueCharacters {

    public static void main(String[] args) {

      /*  String str = "aaabccc";

        String result = "";

        char ch = 'b';
                  //3      ==       //3
        if(str.indexOf(ch) == str.lastIndexOf(ch)){//if the first and last index number
                                                  // the same then the character is unique
            result += ch;
        }

        System.out.println("ch = " + ch);

       !!! For check all characters automatically we should use LOOP, next example
       */

        String str = "aaabccc";

        String result = "";

        for (int i = 0; i < str.length(); i++) { //i: index number of the string (starting for 0)

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {//if the first and last index number
                                                        // the same then the character is unique
                result += ch;

            }
        }
        System.out.println(result);



    }
}
