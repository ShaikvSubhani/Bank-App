import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankInterface{
       private String name;
       private String accountNo;
       private double balance;
       private String password;
       private static double rateOfInterest;

    public HDFCUser(String name, String password,double balance) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest=7;

        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        HDFCUser.rateOfInterest = rateOfInterest;
    }

    @Override

    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "Successfully added";
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(password,enteredPassword))
        {
            if(amount>balance)
                return "paisa nahi h utna, abhi bank m itna h  "+balance;
            else {
                balance = balance - amount;
                return "bahut paisa h, lekin dekhke kharch kar "+ balance;
            }
        }
        else
            return "wrong password";

    }

    @Override
    public double calculateInterest(int years) {
        double interest= (balance * years * rateOfInterest)/100;

        return balance + interest;
    }
}
