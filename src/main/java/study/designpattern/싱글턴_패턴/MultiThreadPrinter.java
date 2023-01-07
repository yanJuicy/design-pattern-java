package study.designpattern.싱글턴_패턴;

public class MultiThreadPrinter {
    private static MultiThreadPrinter printer = null;
    private int counter = 0;

    private MultiThreadPrinter() {
    }

    public static MultiThreadPrinter getPrinter() {
        if (printer == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            printer = new MultiThreadPrinter();
        }

        return printer;
    }

    public int plusCounter() {
        counter++;
        return counter;
    }
}
