package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {


                String str = "aabcccdeef";
                String result = ""; //bdf

                for (int j = 0; j < str.length(); j++) {

                    char ch = str.charAt(j); //'a'
                    int count = 0;//represent the frequency of the ch

                    for (int i = 0; i < str.length(); i++) {

                        char each = str.charAt(i); // each characters of this string
                        if(ch==each){
                            count++;
                        }
                    }

                    if(count!=1){
                        continue;
                    }

                    if(result.contains(ch+"")){
                        continue;

                    }
                    result += ch;


                }
                System.out.println(result);
            }
        }
