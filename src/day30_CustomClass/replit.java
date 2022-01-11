package day30_CustomClass;
import java.util.Scanner;
public class replit {

        public static String clean (String text , String badWord) {

            String result = "";


            for(int i = 0; i < text.length(); i++){

                if(i>text.length()-badWord.length()){
                    break;
                }

             System.out.println(text.substring(i, (i+badWord.length())));
                System.out.println(badWord);


                boolean toRf = (text.substring(i, (i + badWord.length())).equals(badWord.substring(0)));

                System.out.println(toRf);

       if(text.substring(i, (i+badWord.length())).equals(badWord)){
          i =  i + badWord.length()-1;
          continue;
       }else{
          result += "" + text.charAt(i);
        }

            }
            return result;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(clean(in.nextLine(), in.nextLine()));
        }

    }

