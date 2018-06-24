import java.util.Random;

public class ShuffleArray{
    public static void shuffle(Object[] a){
        for (int i = 0; i < a.length ; i ++){
            Random r = new Random();
            int idx = r.nextInt(0, i);
            Object temp = a[idx];
            a[idx] = a[i];
            a[i] = temp;
        }
    }
}