package study.designpattern.싱글턴_패턴;

public class PrinterStaticInit {
    private static PrinterStaticInit printer = new PrinterStaticInit(); // 정적 변수에서 초기화
    private int counter = 0;

    private PrinterStaticInit() {
    }

    public static PrinterStaticInit getPrinter() {
        return printer;
    }

    public int plusCounter() {
        counter++;
        return counter;
    }
}
