package inheritance;

public class Nokia5510 extends Nokia1100 {

    /**
     * Make necessary changes to inherite Nokia1100 properties
     * Crete a method to add colorful display named colorFulDisplay()
     * Crete a method to play games named games()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     * */
    String nameOfTheClass = "Nokia5510";
    String v = super.s;

    public void addColorFullDispaly(){
        System.out.println("This will add colorfull display");
    }
    public void playGames(){
        System.out.println("Now I can play games as well");
    }
    public static void main(String[] args) {
        /**
         * Try to get values of the nameOfClass
         * */
        Nokia5510 obj = new Nokia5510();
        System.out.println(obj.nameOfTheClass);
        Nokia1100 myPhone = new Nokia1100();
        String t = myPhone.nameOfTheClass;
        System.out.println(t);

        System.out.println(obj.v);


    }

}
