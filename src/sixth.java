import java.util.Random;
public class sixth {



        public static void main(String[] args) {
            int[][] array = new int[15][];
            Random random = new Random();


            for (int i = 0; i < 15; i++) {
                if (i >= 0 && i <= 3) {
                    array[i] = new int[5];
                } else if (i >= 4 && i <= 7) {
                    array[i] = new int[8];
                } else if (i >= 8 && i <= 11) {
                    array[i] = new int[3];
                } else {
                    array[i] = new int[9];
                }
            }


            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(16);
                }
            }


            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }


}
