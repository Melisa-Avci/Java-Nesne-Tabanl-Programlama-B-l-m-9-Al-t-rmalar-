import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random(1000); 

        for (int i = 1; i <= 50; i++) {
            int number = random.nextInt(100); 
            System.out.print(number + " ");

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
