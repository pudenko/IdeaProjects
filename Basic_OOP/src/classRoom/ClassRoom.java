package classRoom;

public class ClassRoom {
     String className;
    Pupil student1,student2,student3,student4;

    public ClassRoom(String className, Pupil student1, Pupil student2, Pupil student3, Pupil student4) {
        this.className = className;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
    }

    public ClassRoom(String className, Pupil student1, Pupil student2) {
        this.className = className;
        this.student1 = student1;
        this.student2 = student2;
    }

    public ClassRoom(String className, Pupil student1, Pupil student2, Pupil student3) {
        this.className = className;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
    }

}
