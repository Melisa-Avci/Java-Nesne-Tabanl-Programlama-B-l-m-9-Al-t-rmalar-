import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        Date date = new Date();

        long[] elapsedTimes = {
            10000,
            100000,
            1000000,
            10000000,
            100000000,
            1000000000,
            10000000000L,
            100000000000L
        };

        for (long time : elapsedTimes) {
            date.setTime(time);
            System.out.println("Elapsed time: " + time);
            System.out.println(date.toString());
            System.out.println();
        }
    }
}


