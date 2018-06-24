package Sort;

public class Insertion{

    // In each iteration i, swap a[i] with each larger entry to its left
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            for (int j = i; j > 0; j--){
                if (less(a[j], a[j-1]))
                    exch(a, j, j - 1);
                else
                    break;
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