package classRoom;

public class BadPupil extends Pupil{
    @Override
    void study() {
        System.out.println("Study bad");
    }

    @Override
    void relax() {
        System.out.println("relax every day and every minute");
    }

    @Override
    void read() {
        System.out.println("Read bad");
    }

    @Override
    void write() {
        System.out.println("Write bad");
    }
}
