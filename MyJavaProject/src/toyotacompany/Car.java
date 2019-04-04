package toyotacompany;
 public class Car {
    public void startBackCamera(){
        System.out.println("Back camera will start automatically when car is backing up");
    }
    public void startSideCamera(){
        System.out.println("Side camera will start automatically when car is changing lane");
    }
    public void brakeCar(){
        System.out.println("Car will brake auto in case of sensing something forward");
    }
    public void addTotalPriceCorolla(){
        int baseValue = 16500;
        double taxValue = 1100.75;
        double registrationValue = 600;

        double totalValue = baseValue + taxValue + registrationValue;
        System.out.println("The total value of corolla is " + totalValue);

    }
     public void addTotalPriceCamry() {
         int baseValue = 18000;
         double taxValue = 1200.75;
         double registrationValue = 600.76;

         double totalValue = baseValue + taxValue + registrationValue;
         System.out.println("The total value of camry is " + totalValue);
     }
}
