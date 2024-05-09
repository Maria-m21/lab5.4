import java.util.Random;
public class third {



        public static void main(String[] args) {
            int[] array1 = generateRandomArray(5);
            int[] array2 = generateRandomArray(5);
            int[] array3 = generateRandomArray(5);

            printArray(array1);
            printArray(array2);
            printArray(array3);

            double average1 = calculateAverage(array1);
            double average2 = calculateAverage(array2);
            double average3 = calculateAverage(array3);

            if (average1 > average2 && average1 > average3) {
                System.out.println("Average of array1 is greater.");
            } else if (average2 > average1 && average2 > average3) {
                System.out.println("Average of array2 is greater.");
            } else {
                System.out.println("Average of array3 is greater or all averages are equal.");
            }
        }

        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(6);
            }
            return array;
        }

        public static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        public static double calculateAverage(int[] array) {
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return (double) sum / array.length;
        }


}