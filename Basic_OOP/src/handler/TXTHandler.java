package handler;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("TXT Open");
    }

    @Override
    public void create() {
        System.out.println("TXT create");
    }

    @Override
    public void change() {
        System.out.println("TXT change");
    }

    @Override
    public void save() {
        System.out.println("TXT save");
    }
}
