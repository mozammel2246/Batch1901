package array;

public class BasicArray {
    public static void main(String[] args) {
        String[] car;
        car = new String[4];

        car[0] = "Toyota";
        car[1] = "Lexus";
        car[2] = "BMW";
        car[3] = "Audi";

        double[] price = {25000.78, 55000.9, 35800.97, 42760};

        System.out.println(car[0] + " price will be " + price[0] + " usd." );
        System.out.println(car[1] + " price will be " + price[1] + " usd." );
        System.out.println(car[2] + " price will be " + price[2] + " usd." );
        System.out.println(car[3] + " price will be " + price[3] + " usd." );
    }


}
