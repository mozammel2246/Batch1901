package controlflow;

public class WhileDemo {
        public static void main(String[] args){
            int count = 1;
            while (count < 3) {
                System.out.println("Count is: " + count);
                count++;
            }
            /*do {
                System.out.println("Count is: " + count);
                count++;
            } while (count < 3);*/
        }
    }
