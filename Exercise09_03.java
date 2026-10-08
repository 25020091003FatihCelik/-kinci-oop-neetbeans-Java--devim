import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        long time = 10000;
        for (int i = 0; i < 8; i++) {
            Date date = new Date(time);
            System.out.println("Elapsed time " + time + " ms: " + date.toString());
            time *= 10;
        }
    }
}
