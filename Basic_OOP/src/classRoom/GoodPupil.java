package classRoom;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Study ");
    }

    @Override
    void read() {
        System.out.println("read ertsert");
    }

    @Override
    void write() {
        System.out.println("write wertwert");
    }

    @Override
    void relax() {
        super.relax();
    }
}
