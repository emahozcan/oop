

public class App {
    public static void main(String[] args) throws Exception {
       
 
    Account hesap=new Account(1122,20000);

    hesap.SetAnnualInterest(4.5);


    System.out.println(hesap.getBalance());

    hesap.WithDraw(2500);

    System.out.println(hesap.getBalance());
    System.out.println(hesap.getAnnualInterest());
    System.out.println(hesap.getCreateDate());


  

          
        

          
             
           
    }
}

