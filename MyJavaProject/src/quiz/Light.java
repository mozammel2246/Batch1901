package quiz;

public class Light {
    boolean lightSwitchPosition;
    static  String time = "day";
   
    /**
     * 1. Declare a class variable called lightName and assign value to Bed Light
     * 2. Declare and assign value 2 to an int reference variable called number BedLight
     * */
    static String lightName = "Bed Light";
    int numberOfBedLight = 2;
    /**
     * Create default constructor with print statement
     * */
    public Light(){
        System.out.println("This is a default constructor");
    }

    public void turnOnLight(){

        lightSwitchPosition = true;
        System.out.println("Light is turned on");

    }
    /**
     * Create a method turnOffFLight() which will turn off the light
     *
     * */
    public void turnOffLight(){
        lightSwitchPosition = false;
        System.out.println("Light will turn off");
    }

    public static void main(String[] args) {
        /**
         * Create an object called bedLight
         * Use a if else statement to turn on and turn of the light according to
         * the value of the variable time and using two other methods
         *
         * */
        Light bedLight = new Light();
        if (time == "day"){
            bedLight.turnOffLight();
        }
        else {
            bedLight.turnOnLight();
        }

    }

}
