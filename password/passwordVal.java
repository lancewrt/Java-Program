import java.util.*;

class Password
{
    public Password()
    {
        super();
    }

    public static void main(String[] args)
    {
        System.out.println("----Direction to Create a Password----");
        System.out.println("1. The Password must be at least 8 characters long.");
        System.out.println("2. The Password must contain at least one uppercase character.");
        System.out.println("3. The Password must contain at least one lowercase character.");
        System.out.println("4. The Password must contain at least one digit (0-9).");
        System.out.println("5. The Password must contain at least one special characters.");
        System.out.println("6. The Password must not contain < or >.");


        Password passwordValidator = new Password();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String userName = obj.nextLine();
        System.out.println("Enter Password: ");
        String passWord = obj.nextLine();
        System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);

        passwordValidator.passwordValidation(userName,passWord);

    }


    public void passwordValidation(String userName, String password)
    {
        boolean valid = true;
        if (password.length() > 15 || password.length() < 8)
        {
            System.out.println("Password should be less than 15 and more than 8 characters in length.");
            valid = false;
        }
        if (password.indexOf(userName) > -1)
        {
            System.out.println("Password Should not be same as user name");
            valid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password should contain atleast one upper case alphabet");
            valid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            System.out.println("Password should contain atleast one lower case alphabet");
            valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password should contain atleast one number.");
            valid = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,/,?,>,<].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Password should contain atleast one special character");
            valid = false;
        }
        if (valid)
        {
            int length = password.length();
            System.out.println("The password length is: " +length);
            System.out.println("The substring: "+password.substring(2,8));
            System.out.println("Password is valid.");
            passwordCracker(length, password, userName);
        }
    }

    public void passwordCracker(int length, String passWord, String userName){
        int passwordLength=8, upChars=0, lowChars=0;
        int special=0, digits=0;
        char ch;

        if(length < passwordLength)
        {
            System.out.println("\nThe Password's Length has to be of 8 characters or more.");
            return;
        }
        else
        {
            for(int i=0; i<length; i++)
            {
                ch = passWord.charAt(i);
                if(Character.isUpperCase(ch))
                    upChars++;
                else if(Character.isLowerCase(ch))
                    lowChars++;
                else if(Character.isDigit(ch))
                    digits++;
                else
                {
                    if(ch=='<' || ch=='>')
                    {
                        System.out.println("\nThe Password is Malicious!");
                        return;
                    }
                    else
                        special++;
                }
            }
        }
        if(upChars!=0 && lowChars!=0 && digits!=0 && special!=0)
        {
            if(length>=12)
            {
                System.out.println("\nThe Strength of Password is Strong.");
            }
            else
            {
                System.out.println("\nThe Strength of Password is Medium.");
            }
            System.out.println("\n----The Password Contains----");
            System.out.println("UpperCase Character: " +upChars);
            System.out.println("LowerCase Character: " +lowChars);
            System.out.println("Digit: " +digits);
            System.out.println("Special Character: " +special);
            passwordConfirmation(userName, passWord);
        }
    }

    public void passwordConfirmation(String username, String password){
        Scanner obj = new Scanner(System.in);
        System.out.println("Confirm Username: ");
        String userName = obj.nextLine();
        System.out.println("Confirm Password: ");
        String passWord = obj.nextLine();

        if(userName.equals(username) && password.equals(passWord))
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
}