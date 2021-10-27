namespace Chapter1
{
    public class BubbleSort
    {
        public static int[] Sort(int[] mass)
        {
            int middle;
            for (int i = 0; i < mass.Length; i++)
            {
                for (int x = 0; x < mass.Length - 1; x++)
                {
                    if (mass[x] > mass[x + 1])
                    {
                        middle = mass[x];
                        mass[x] = mass[x + 1];
                        mass[x + 1] = middle;
                    }
                }
            }
            return mass;
        }
    }
}