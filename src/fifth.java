import java.util.Random;
public class fifth {



        public static void main(String[] args) {
            int[] array = generateRandomArray(15);

            System.out.println("Масив випадкових елементів:");
            printArray(array);

            int evenCount = countEvenElements(array);
            System.out.println("Кількість парних елементів в масиві: " + evenCount);
        }

        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(11);
            }
            return array;
        }

        public static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        public static int countEvenElements(int[] array) {
            int count = 0;
            for (int value : array) {
                if (value % 2 == 0) {
                    count++;
                }
            }
            return count;
        }


}
