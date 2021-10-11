package src;

public class FuncAlg {
    public int[] generateMassive(int[] mass, int begin, int end){
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(begin + (Math.random()) * end);
        }
        return mass;
    }
    public void showMassive(int[] mass){
        for(int x: mass){
            System.out.print(x + " ");
        }
    }
}
