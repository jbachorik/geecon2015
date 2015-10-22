package profilershowcase;

public class SimpleCase {
    public static void main(String[] args) {
        long accDur = 0L;
        long acc = 0L;
        for(int i=0;i<30000;i++) {
            acc += inc(i);
        }

        long a = System.nanoTime();
        for(int j=1;j<=20;j++) {
            acc = 0;
            long x = System.nanoTime();
            for(int i=0;i<100000;i++) {
                acc += inc(i);
            }
            long dur = System.nanoTime() - x;

            if (j == 11) {
                accDur = 0;
            } else {
                accDur += dur;
            }
        }
        long totalDur = System.nanoTime() - a;
        System.out.println("=== acc: " + acc);
        System.out.println("=== acc dur: " + (accDur / 1000000d) + "ms");
        System.out.println("=== total dur: " + (totalDur / 1000000d) + "ms");
        System.out.println("=== inc dur: " + (accDur / 9000d) + "us");
    }

    public static int inc(int i) {
        return i + 1;
    }
}
