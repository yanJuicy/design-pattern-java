package study.designpattern.싱글턴_패턴;

public class Printer {
    private static Printer printer = null;

    private Printer() {
    }

    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }

        return printer;
    }
}
