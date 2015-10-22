package profilershowcase;

public class ProfilerShowcaseReallyLong {
    static int dummy = 0;

    public static void main(String[] args) throws Exception {
        long acc = 0L;
        for(int i=0;i<30000;i++) {
            acc += inc(i);
        }
        System.out.println("=== warm up ready");
        System.in.read();
        
        long x = System.nanoTime();
        for(int j=1;j<=4000;j++) {
            acc = 0;

            for(int i=0;i<10000000;i++) {
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
        System.in.read();
    }

    public static int inc(int i) {
        return i + 1;
    }

}
