import java.util.Random;
public class fourth {



        public static void main(String[] args) {
            int[] array1 = generateRandomArray(10);
            int[] array2 = generateRandomArray(10);
            int[] array3 = new int[10];

            for (int i = 0; i < 10; i++) {
                array3[i] = array1[i] + array2[i];
            }

            printArray(array1);
            printArray(array2);
            printArray(array3);
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
    

}
