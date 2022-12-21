public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CarClass car= new CarClass();
        car.color="red";
        car.doors=4;
        car.engine=5677;
        car.model="XXL";

        RegularCar car3= new RegularCar();
        car3.wheels=4;
        car3.color="grey";
        car3.model="BV";
    }
}