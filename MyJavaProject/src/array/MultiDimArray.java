package array;

public class MultiDimArray {
    public static void main(String[] args) {
        String[][] names ={{"Mr. ","Mrs. ","Ms. "},{"Jason","Briana","Lucy","Robert"}};
        int[] monthlySalary = {2500,3280,4500,6000};
        System.out.println(names[0][0] + names[1][0] + "'s monthly salary is " + monthlySalary[0] + " usd");
        System.out.println(names[0][2] + names[1][2] + "'s monthly salary is " + monthlySalary[1] + " usd");
        System.out.println(names[0][1] + names[1][1] + "'s monthly salary is " + monthlySalary[2] + " usd");
        System.out.println(names[0][0] + names[1][3] + "'s monthly salary is " + monthlySalary[3] + " usd");
    }
}
