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

    public int[] sort(int mass[]){
        return quickSort(mass, 0, mass.length - 1);
    }
}
