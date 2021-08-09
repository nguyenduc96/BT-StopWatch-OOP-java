import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        LocalTime start = LocalTime.now();
        array = selectionSort(array);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start, end);
        System.out.println("Start : " + sw.getStartTime());
        System.out.println("End : " + sw.getEndTime());
        System.out.println("Run time : " + sw.getElapsedTime() + " miliseconds");
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tempt = array[i];
                    array[i] = array[j];
                    array[j] = tempt;
                }
            }
        }
        return array;
    }
}
