package handler;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XML Open");
    }

    @Override
    public void create() {
        System.out.println("XML create");
    }

    @Override
    public void change() {
        System.out.println("XML change");
    }

    @Override
    public void save() {
        System.out.println("XML save");
    }
}
