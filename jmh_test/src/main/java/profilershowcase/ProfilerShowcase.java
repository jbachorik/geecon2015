package profilershowcase;

public class ProfilerShowcase {
    static int dummy = 0;

    public static void main(String[] args) {
        long acc = 0L;
        for(int i=0;i<30000;i++) {
            acc += inc(i);
        }
        long x = System.nanoTime();
        for(int j=1;j<=20;j++) {
            acc = 0;

            for(int i=0;i<100000;i++) {
                acc += inc(i);
            }

            if (j == 11) {
                dummy += j;
            }
        }
        long dur = System.nanoTime() - x;
        System.out.println("=== acc: " + acc);
        System.out.println("=== dur: " + (dur / 1000000d) + "ms");
        System.out.println("== done");
    }

    public static int inc(int i) {
        return i + 1;
    }

}
