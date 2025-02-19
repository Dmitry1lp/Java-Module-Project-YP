import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Racing race = new Racing();


        final int n = 3; //max число автомобилей
        String[] cars = new String[n];
        int[] speed = new int[n];


        for(int i = 0; i < n; i++){

        System.out.println("Введите название автомобиля №" + (i+1) + ":");
        cars[i] = scanner.nextLine();


        while (true) {
            System.out.println("Введите скорость автомобиля.(от 0 до 250)");
            if (scanner.hasNextInt()) {
                speed[i] = scanner.nextInt();

                if (speed[i] >= 0 && speed[i] <= 250) {
                    scanner.nextLine();
                    break;

                } else {
                    System.out.println("Неверный ввод.(Требуемое значение - от 0 до 250)");
                    scanner.nextLine();
                }

            } else {
                System.out.println("Неверный ввод.Введите числовое значение.(от 0 до 250)");
                scanner.nextLine();
                }
            }
        }
        race.getLeader(cars, speed);
    }
}