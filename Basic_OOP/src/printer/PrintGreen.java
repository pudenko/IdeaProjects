package printer;

public class PrintGreen extends Printer{
    @Override
    void print(String value) {
        System.out.println((char) 27 + "[32m" + value);
//        System.out.println((char) 27 + "[33m" + value);
    }
}
