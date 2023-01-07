package study.designpattern.싱글턴_패턴;

public class UserMultiThread extends Thread {

    @Override
    public void run() {
        MultiThreadPrinter printer = MultiThreadPrinter.getPrinter();
        System.out.println(Thread.currentThread().getName() + " " + printer + " " + printer.plusCounter());
    }

}
