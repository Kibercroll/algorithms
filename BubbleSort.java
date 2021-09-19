public class BubbleSort {
    public static void main(String[] args) {
        int mass[] = {1,10,2,22,33,3,44,5,8976,12312432,12};
        int count = 0;
        while (count < mass.length) {
            int swap;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    swap = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = swap;
                }
            }
            count++;
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
