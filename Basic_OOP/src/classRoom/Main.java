package classRoom;

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new BadPupil();
        Pupil pupil2 = new ExcelentPupil();
        Pupil pupil3 = new GoodPupil();
        Pupil pupil4 = new BadPupil();

        ClassRoom class1 = new ClassRoom("2A", pupil1, pupil2);
        ClassRoom class2 = new ClassRoom("4A", pupil2, pupil3, pupil4);

        showStudents(class1);
        showStudents(class2);

    }

    public static void students(ClassRoom classRoom, int studentNr) {

        Pupil pupil = null;
        switch (studentNr) {
            case 1: {
                pupil = classRoom.student1;
                break;
            }
            case 2: {
                pupil = classRoom.student2;
                break;
            }
            case 3: {
                pupil = classRoom.student3;
                break;
            }
            case 4: {
                pupil = classRoom.student4;
                break;
            }
        }

        if (pupil != null) {
            System.out.printf("#%d \n", studentNr);
            pupil.study();
            pupil.write();
            pupil.relax();
            pupil.read();

        }
    }

    public static void showStudents(ClassRoom classRoom) {
        System.out.println("--Class " + classRoom.className);
        for (int i = 1; i <= 4; i++) {
            students(classRoom, i);
        }
    }
}
