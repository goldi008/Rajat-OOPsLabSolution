import java.util.*;
public class CredentialService
{
    String pwd="",email="";
    public String generatePassword()
    {
        //Generating randam 8 digit password using random function

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String symbols = "!@#$%^&*+-/.?<>)";
        String values = Capital_chars+Small_chars+numbers+symbols;
        Random rndm_method = new Random();
        char[] password = new char[8];
         for (int i=0;i<8; i++)
        {
            password[i] =values.charAt(rndm_method.nextInt(values.length()));
        }
        pwd=password.toString();
        return(pwd);
    }

    public String generateEmailAddress(String firstName, String lastName, String dept)
    {
        email=firstName+lastName+"@"+dept+"."+"abc.com";
        return(email);

        //abc.com is company name in my code
    }

    public void showCredentials()
    {
        System.out.println("Email ---> "+email);
        System.out.println("Password ---> "+pwd);
    }
}