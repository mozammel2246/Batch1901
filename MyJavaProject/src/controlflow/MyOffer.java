package controlflow;

public class MyOffer {
    public static void main(String[] args) {
        int offerAmount = 25000;
        while (offerAmount < 40000){
            offerAmount = offerAmount + 3740;
            System.out.println("My final offer: " + offerAmount + " usd");
        }
        do {
            offerAmount = offerAmount - 3000;
            System.out.println("My offer: " + offerAmount + " usd");
        }
        while (offerAmount > 10000);
    }
}
