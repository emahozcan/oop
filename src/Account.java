import java.time.LocalDate;
import java.util.Random;

public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate DateCreated;
  

    public Account()
    {

     id=new Random().nextInt(100);
     balance=0;
     annualInterestRate=0;
     DateCreated=LocalDate.now();  
     
    }
    public Account(int id,double balance)
    {
        this.id=id;
        DateCreated=LocalDate.now();
        this.balance=balance;
    }

    public int getId()
    {
        return id;
    }

    public double getAnnualInterest()
    {
        return annualInterestRate;
    }

    public double getBalance()
    {
     return balance;
    }

    public void  Setid(int id)
    {
        this.id=id;
    }

    public void SetBalance(double balance)
    {
        this.balance=balance;
    }

   public void SetAnnualInterest(double annualInterestRate)
   {
       this.annualInterestRate=annualInterestRate;  
   }


    public double MontlyInterest()
    {
        return balance*(annualInterestRate/12);
    }

    public void WithDraw(double mount)
    {
        balance=balance-mount;
    }
    public LocalDate getCreateDate()
    {
         return DateCreated;

    }

    




    




 


    
}
