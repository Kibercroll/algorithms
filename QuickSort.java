public class QuickSort
{
    private int[] quickSort(int mass[], int left, int right){
        int i = left, j = right;
        int temp, pivot = mass[(left + right) / 2];

        while (i <= j){
            while (mass[i] < pivot) i++;
            while (mass[j] > pivot) j--;

            if (i <=j){
                if (mass[i] > mass[j])
                {
                    temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
                i++; j--;
            }
        }
        if (left < j) quickSort(mass, left, j);
        if (i < right) quickSort(mass, i, right);
        return mass;
    }

    private int[] sort(int mass[]){
        return quickSort(mass, 0, mass.length - 1);
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }

    public static void main(String[] args) {
        int mass[] = new int[100000];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }

        System.out.println("Quick sort");
        measureTime(() -> new QuickSort().sort(mass));
        System.out.println("Bubble sort");
        measureTime(() -> new BubbleSort().sort(mass));
    }
}