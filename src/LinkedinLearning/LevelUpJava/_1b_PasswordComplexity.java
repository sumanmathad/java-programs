package LinkedinLearning.LevelUpJava;

/*
password must have at least six characters, one uppercase letter, one lowercase letter and one number.
The function will take in a string as input and output a Boolean,
 */


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1b_PasswordComplexity {

    public static void main(String[] args) {
        assertTrue(isPwdComplex("Happy12shdsjvf"));
        assertTrue(isPwdComplex("1arahZ ength"));
        assertTrue(isPwdComplex("Password12"));
        assertTrue(isPwdComplex("2PassW@ord1"));
        assertFalse(isPwdComplex("0tesfgdgfdst"));
        System.out.println("Success");

    }

    public static boolean isPwdComplex(String pwd){
            if(pwd.length()<6) return false;
            else
            {
                boolean hasNumber =false;
                boolean hasUppercaseLetter =false;
                boolean hasLowerCaseLetter =false;
               for(int i=0;i<pwd.length();i++){
                char c= pwd.charAt(i);
                if(Character.isDigit(c)) hasNumber=true;
                else if (Character.isUpperCase(c)) hasUppercaseLetter=true;
                else if (Character.isLowerCase(c)) hasLowerCaseLetter=true;

                if(hasNumber&& hasUppercaseLetter && hasLowerCaseLetter)
                       break;
               }

               return hasNumber&& hasUppercaseLetter && hasLowerCaseLetter;
            }

    }



}
