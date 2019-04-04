package operator;

public class PatientStatus {
    public static void main(String[] args) {
        double presentTemp = 103;
        double normalTemp = 98.5;
        int highTemp = 105;
        if (presentTemp == normalTemp)
        System.out.println("Body Temperature is normal, take some rest");
        if (presentTemp != normalTemp)
        System.out.println("Report the change to doctor");
        if (presentTemp > normalTemp)
        System.out.println("Start taking medicine written in the prescription");
        if (presentTemp > highTemp)
        System.out.println("Go to Emergency");
        if (presentTemp <= normalTemp)
            System.out.println("Stop taking medicine");


    }
}
