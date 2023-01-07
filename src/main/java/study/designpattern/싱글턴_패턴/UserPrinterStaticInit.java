package study.designpattern.싱글턴_패턴;

public class UserPrinterStaticInit extends Thread {

    @Override
    public void run() {
        PrinterStaticInit printer = PrinterStaticInit.getPrinter();
        System.out.println(Thread.currentThread().getName() + " " + printer + " " + printer.plusCounter());
    }

}
