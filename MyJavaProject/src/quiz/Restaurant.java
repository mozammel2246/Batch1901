package quiz;

public class Restaurant {

    static String restaurantName = "Red Lobster";
    static int numberOfPeople = 2;
    int x = 4;

    public Restaurant(){
    System.out.println("This is my default constructor");
    }

    public static void totalBill(){
        double salmonPrice = 35.75;
        double breadPrice = 11.54;
        double soupPrice = 31.47;
        double total = salmonPrice+breadPrice+soupPrice;
        System.out.println("Total Bill : " + total);
    }
    public static void main(String[] args) {
        Restaurant myBill = new Restaurant();
        System.out.println("Restaurant Name: " + myBill.restaurantName);
        System.out.println("Number of People: " + myBill.numberOfPeople);
        myBill.totalBill();
        int x = myBill.numberOfPeople;
        String name = Restaurant.restaurantName;
            }
}
