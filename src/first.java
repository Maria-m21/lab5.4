public class first {
    public static void main(String[] args) {

        int size = (99 - 1) / 2 + 1;


        int[] oddNumbers = new int[size];
        for (int i = 0, num = 1; num <= 99; num += 2, i++) {
            oddNumbers[i] = num;
        }


        for (int num : oddNumbers) {
            System.out.println(num);
        }
    }
}
