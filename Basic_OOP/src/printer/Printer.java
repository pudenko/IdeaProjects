package printer;

public class Printer {
    void print(String value) {
        System.out.println((char) 27 + "[33m" + value);
    }
}
