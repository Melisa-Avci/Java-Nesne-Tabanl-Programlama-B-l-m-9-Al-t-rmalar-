package teststopwatch;

import stopwatch.stopwatch; 

public class TestStopWatch {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100000);
        }

        stopwatch stopwatch = new stopwatch();
        stopwatch.start();

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        stopwatch.stop();

        System.out.println("Elapsed time for sorting 100,000 numbers: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}