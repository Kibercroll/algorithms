public class BubbleSort {
    public int[] sort(int mass[]){
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
        return mass;
    }
}
