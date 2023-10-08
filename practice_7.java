import javax.imageio.stream.ImageInputStream;

public class practice_7 {
    static void table(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.format(  " %d x %d = %d\n"  , n, i, n * i);

        }
       
    }

    public static void main(String[] args) {
        table(6);
    }
}



