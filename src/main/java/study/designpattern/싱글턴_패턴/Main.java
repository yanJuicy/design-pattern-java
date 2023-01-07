package study.designpattern.싱글턴_패턴;

public class Main {

    public static void main(String[] args) {
        usePrinter();
        System.out.println();

        useMultiThreadPrinter();
        System.out.println();

        usePrinterStaticInit();
        System.out.println();

        usePrinterSynchronized();
        System.out.println();
    }

    private static void usePrinter() {
        for (int i = 0; i < 5; i++) {
            Printer printer = Printer.getPrinter();
            System.out.println(printer);
        }
    }

    private static void useMultiThreadPrinter() {
        for (int i = 0; i < 5; i++) {
            new UserMultiThread().start();
        }
    }

    private static void usePrinterStaticInit() {
        for (int i = 0; i < 5; i++) {
            new UserPrinterStaticInit().start();
        }
    }

    private static void usePrinterSynchronized() {
        for (int i = 0; i < 5; i++) {
            new UserPrinterSynchronized().start();
        }
    }

}
