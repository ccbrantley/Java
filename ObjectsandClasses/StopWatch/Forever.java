import java.util.Arrays;
import java.util.Random;
public class Forever {
public static void main(String[] args) throws InterruptedException {
    StopWatch stopwatch = new StopWatch();
    int[] integerList = new int [100000];
    Random rand = new Random(1000);
    for (int i = 0; i < 100000; i++){
        integerList[i] = rand.nextInt(1000);
    }
    stopwatch.start();
    Arrays.sort(integerList);
    stopwatch.stop();
    System.out.println("Time to Sort: " + stopwatch.getElapsedTime() + " milliSeconds");
    for(int a: integerList){
        System.out.println(a);
    }
}
}
