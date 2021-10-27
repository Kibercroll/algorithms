namespace Chapter1
{
    public class QuickSort
    {
        private static int[] quickSort(int[] mass, int left, int right)
        {
            int swap, i = left, j = right, middle = mass[(left + right) / 2];
            while (i <= j)
            {
                while (mass[i] < middle) i++;
                while (mass[j] > middle) j--;

                if (i <= j)
                {
                    if (mass[i] > mass[j])
                    {
                        swap = mass[i];
                        mass[i] = mass[j];
                        mass[j] = swap;
                    }
                    i++; j--;
                }
            }

            if (left < j) quickSort(mass, left, j);
            if (i < right) quickSort(mass, i, right);
            return mass;
        }

        public static int[] Sort(int[] mass)
        {
            return quickSort(mass, 0, mass.Length - 1);
        }
    }
}