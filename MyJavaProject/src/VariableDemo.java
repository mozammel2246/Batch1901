public class VariableDemo {
    int yourSalary = 4000;
    int nutBucket = 100;
    static int boltBucket = 50;
    static String myName = "mozammel";

    public void totalIncome(){
        int mySalary;
        int otherIncome = 2000;
        mySalary = 3000;
        int total = mySalary + otherIncome;
        System.out.println("My total income per month: " + total);
    }
    public void totalIncomeOfSaif(int salary, int other){
        int totalIncome = salary + other;
        System.out.println("Total income of Saif: " + totalIncome);
    }



    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.totalIncome();
        System.out.println(boltBucket);
        obj.totalIncomeOfSaif(5000,3000);
        System.out.println(myName.toUpperCase() + " salary is: " + obj.yourSalary);


    }



}
