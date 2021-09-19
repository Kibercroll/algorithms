public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort meth = new BubbleSort();
        int mass[] = {1,10,2,22,33,3,44,5,8976,12312432,12};
        meth.showMassive(meth.sort(mass));
    }

    public int[] sort(int mass[]){
        int count = 0;
        int result[];
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
        result = mass;
        return result;
    }
    public void showMassive(int massive[]){
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
    }
}
