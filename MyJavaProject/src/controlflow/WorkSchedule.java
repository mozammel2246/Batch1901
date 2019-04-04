package controlflow;

public class WorkSchedule {
    public static void main(String[] args) {
        int hrs = 1600;
        String[] personNames = {"Jason", "Robert", "Natalie", "John", "Jacy"};
        String names;
        /*
        * declaration of case must be a statement
        * */
        switch (hrs){
            case 1200: names = personNames[0];
            break;
            case 1600: names = personNames[2];
            break;
            case 2000: names = personNames[1];
            break;
            case 2400: names = personNames[3];
            break;
            case 0400: names = personNames[4];
            break;
            case 0700: names = personNames[5];
            break;
            default: names = "unavailable!!! Ask Manager";
            break;
        }
        System.out.println("The assigned person for the job is " + names);

    }
}
