import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name,password, balance to create an account");
        //create user
        String name =sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
//        SBIUser user=new SBIUser(name,balance,password);
//
//        //add amount
//        String msg=user.addMoney(100000);
//        System.out.println(msg);
//
//        //withdraw money
//        System.out.println("enter amount you want to withdraw");
//        int  money=sc.nextInt();
//        System.out.println("enter your password");
//        String pass=sc.next();
//        System.out.println(user.withdrawMoney(money,pass));
//
//        //rate of interest
//        System.out.println(user.calculateInterest(10));

        HDFCUser user=new HDFCUser(name,password,balance);

        //aadding the amount
        System.out.println("Enter the amount of money which you want to add");
        int amount=sc.nextInt();
        String msg= user.addMoney(amount);
        System.out.println(msg);

        //checking balance
        System.out.println(user.checkBalance());

        //to withdraw money;
        System.out.println("Enter the amount which you want to withdram");
         amount=sc.nextInt();
        System.out.println(user.withdrawMoney(amount,password));

        //calculating total balance with interest;
        System.out.println(user.calculateInterest(10));








    }
}