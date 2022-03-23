public class Stock{


     private String  Symbol;
     private String  name;
     private double prePrice;
     private double currentPrice;
   
    public Stock(String name,String Symbol,double prePrice,double currentPrice)
    {
        this.currentPrice=currentPrice;
        this.prePrice=prePrice;
         this.name=name;
         this.Symbol=Symbol;
    }

    public double GetChangePrice(double currentPrice)
   {
       double d=currentPrice-prePrice;
       return  (d/prePrice)*100;
   }    
    


     





}