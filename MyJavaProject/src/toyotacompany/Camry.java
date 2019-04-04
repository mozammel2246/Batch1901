package toyotacompany;

public class Camry{
    public void switchONHeadLight(){
        System.out.println("Switch on head light when car starts moving");
    }
    public static void main(String[] args) {
        Car basicCamry = new Car();
        basicCamry.startBackCamera();
        basicCamry.brakeCar();
        basicCamry.startSideCamera();
        Camry xeModel = new Camry();
        xeModel.switchONHeadLight();
    }
}