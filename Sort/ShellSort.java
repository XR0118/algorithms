import com.sun.org.apache.bcel.internal.generic.SWAP;

public class ShellSort{

    public static void sort(Comparable[] a){
        int[] hTable = {8, 4, 2, 1};
        for (int h: hTable){
            for (int i = h; i < a.length; i++){
                for (int j = i; j >= h; j-= h){
                    if (less(a[j], a[j - h]))
                        exch(a, j, j - h);
                    else
                        break;
                }
            }
        }
    }

    private static boolean less(Comparable a, Comparable b){
        return (a.compareTo(b) < 0);
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}