package handler;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("DOC Open");
    }

    @Override
    public void create() {
        System.out.println("DOC create");
    }

    @Override
    public void change() {
        System.out.println("DOC change");
    }

    @Override
    public void save() {
        System.out.println("DOC save");
    }
}
