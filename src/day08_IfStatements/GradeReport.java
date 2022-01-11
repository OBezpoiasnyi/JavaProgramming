package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85;

        if(score>=90){
            System.out.println("Excellent");
        }

        if(score==89){
            System.out.println("Great");
        }

        if(score>=80 && score<=89){
            System.out.println("Good");
        }

        if(score>=60 && score <=69){
            System.out.println("Passed");
        }

        if(score >=0 && score <=59){
            System.out.println("Failed");
        }

    }

}
/*
    score: 85
        A = 90~100 ==> Excellent
        b = 89 ==> great
        c = 80~89 ==> good
        d = 60~69 ==> passed
        0~59 ==> failed
 */
