import java.util.Random;
public class second {


    public static void main(String[] args) {

        int[] numbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        // Виведення початкового масиву
        System.out.println("Початковий масив:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }


        System.out.println("Оновлений масив:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}

