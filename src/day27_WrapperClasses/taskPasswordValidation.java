package day27_WrapperClasses;

public class taskPasswordValidation {

    public static void main(String[] args) {

        String password = "Qwerty123!";


        for (int i = 0; i < password.length(); i++) {

            if(password.length()<=8){
                System.err.println("Password must be at least have 8 characters long!\nRe-enter your password correctly!");
                break;
            }

            if(password.contains(" ")){
                System.err.println("Your password can't contain space!\nRe-enter your password correctly!");
                break;
            }


            int digitCount = 0;
            int letterCount = 0;
            int specialCount = 0;
            int lowCaseCount = 0;
            int upCaseCount = 0;


            for (int j = 0; j < password.length(); j++) {
                char ch = password.charAt(j);
                if(Character.isDigit(ch)){
                    digitCount++;
                }
                if(Character.isLetter(ch)){
                    letterCount++;
                }
                if(!Character.isLetterOrDigit(ch)){
                    specialCount++;
                }
                if(Character.isLowerCase(ch)){
                    lowCaseCount++;
                }
                if(Character.isUpperCase(ch)){
                    upCaseCount++;
                }
            }


            if(digitCount == 0){
                System.err.println("Your password must contain at least one digit!\nRe-Enter password:");
                break;
            }
            else if(letterCount == 0){
                System.err.println("Your password must contain at least one letter!\nRe-Enter password:");
                break;
            }
            else if(specialCount == 0){
                System.err.println("Your password must contain at least one special character!\nRe-Enter password:");
                break;
            }
            else if(lowCaseCount == 0){
                System.err.println("Your password must contain at least one lower letter!\nRe-Enter password:");
                break;
            }
            else if(upCaseCount == 0){
                System.err.println("Your password must contain at least one upper letter!\nRe-Enter password:");
                break;
            }else {
                System.out.println("Your password created!");
                break;
            }
        }



    }

}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */