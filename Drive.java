import java.util.*;
public class Drive
{
    public static void main(String[]arg)
    {
        Scanner read=new Scanner(System.in);
        
        CredentialService cs=new CredentialService();
        
        System.out.println("Enter your First Name");
        String fname=read.nextLine().trim();
        System.out.println("Enter your Last Name");
        String lname=read.nextLine().trim();
        Employee ep=new Employee(fname,lname);

        System.out.println("Please Enter the Department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int i=read.nextInt();

        System.out.println("Dear "+ep.firstName+" your generated credentials are as follows");
        if(i==1)
        {
            ep.email=cs.generateEmailAddress(ep.firstName,ep.lastName,"tech");
            ep.pwd=cs.generatePassword();
            cs.showCredentials();

        }

        if(i==2)
        {

            ep.email=cs.generateEmailAddress(ep.firstName,ep.lastName,"admin");
            ep.pwd=cs.generatePassword();
            cs.showCredentials();
            
        }

        if(i==3)
        {

            ep.email=cs.generateEmailAddress(ep.firstName,ep.lastName,"hr");
            ep.pwd=cs.generatePassword();
            cs.showCredentials();
            
        }

        if(i==4)
        {

            ep.email=cs.generateEmailAddress(ep.firstName,ep.lastName,"legal");
            ep.pwd=cs.generatePassword();
            cs.showCredentials();
            
        }


    }
}