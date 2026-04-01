public class Car {

    String brand; //
    int year; //
    int speed; //

   public void startEngine() {
        System.out.println("Двигун запускаеться");
    }

    public void accelerate() {
        speed += 10;
        System.out.println("машина набирае швидкість" + speed);
    }
}