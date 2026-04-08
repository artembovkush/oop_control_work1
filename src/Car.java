public class Car {

    String brand; //бренд автомобіля
    short year; // рік його вироботку
    double speed; // максимальна швинкість

   public void startEngine() {
        System.out.println("Двигун запускаеться");
    }

    public void accelerate() {
        speed += 10.5;
        System.out.println("машина набирае швидкість" + speed);
    }
}