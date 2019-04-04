package toyotacompany;


public class Corolla {


    public static void main(String[] args) {
        Car basicModel = new Car();
        basicModel.brakeCar();
        basicModel.startBackCamera();
        basicModel.addTotalPriceCorolla();
        Camry sportModel = new Camry();
        sportModel.switchONHeadLight();
    }
}
