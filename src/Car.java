public class Car {

   private String brand; //бренд автомобіля // змінено модифікатор default на модифікатор private . тому що вважаю доцільним максимально обмежити прямий доступ до данних цього классу
    short year; // рік його вироботку
    double speed; // максимальна швинкість

   public void startEngine() {
        System.out.println("Двигун запускаеться до");
    }

    private void accelerate() { // рахую доцільним змінити модифікатор з public на private щоб закрити доступ до данних цього метода
        speed += 10.5;
        System.out.println("машина набирае швидкість" + speed);
    }

    public static void main(String[] args) {
        //ЛР9 варіант 2

        int sum = 0 ;// змінна

        for (int i = 100; i <200; i++) { //перебирємо всі числа від 100 до 200.

            if (i % 15 == 0) { //Якщо остача = 0 число ділиться на 15
                sum += i;

                System.out.println(" число " + i + " ратне 15 ");


                System.out.println("Сума чисел кратних 15 від 100 до 200 = " + sum); // ввиводимо результат


            }

        }

    }

    public void cleanCar (String name) {
        System.out.println("car" + name + "is clean");//просто метод який нічого не повертає
    }

    public int calculateFuel(int distance , int fuelPer100) {//функція яка повертає
        int fuel = distance * fuelPer100/100;
        return fuel;
    }


}

