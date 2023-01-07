package study.designpattern.싱글턴_패턴;

public class UserPrinterSynchronized extends Thread {

    @Override
    public void run() {
        PrinterSynchronized printer = PrinterSynchronized.getPrinter();
        System.out.println(Thread.currentThread().getName() + " " + printer + " " + printer.plusCounter());
    }

}
