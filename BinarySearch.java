package src;

public class BinarySearch {
    public int find(int searchKey, int[] mass){
        int lowerBound = 0;
        int upperBound = mass.length - 1;
        int find;
        while(true){
            find = ((lowerBound + upperBound) / 2);
            if (mass[find] == searchKey){
                return mass[find];
            } else if (lowerBound > upperBound){
                return 0;
            } else {
                if (mass[find] < searchKey)
                    lowerBound = find + 1;
                else upperBound = find - 1;
            }
        }
    }
}
