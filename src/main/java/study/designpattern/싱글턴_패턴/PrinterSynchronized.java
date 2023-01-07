package study.designpattern.싱글턴_패턴;

public class PrinterSynchronized {
    private static PrinterSynchronized printer = null;
    private int counter = 0;

    private PrinterSynchronized() {
    }

    // 메서드 동기화
    public synchronized static PrinterSynchronized getPrinter() {
        if (printer == null) {
            printer = new PrinterSynchronized();
        }

        return printer;
    }

    public int plusCounter() {
        synchronized (this) {  // counter 동기화
            counter++;
        }
        return counter;
    }
}
