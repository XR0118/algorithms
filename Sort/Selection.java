public class Selection{

    // in each iteration i, put the a[min] to a[i]
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            int min = i;
            for (int j = i + 1; j < a.length; j++){
                if (less(a[i], a[j]))
                    min = j;
            }
            exch(a, i, min);
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