package com.lessons.igor.ex009;

class WithException {
    public void trowInner() throws Exception {
        throw new Exception("Test");
    }

    public void catchInner() throws Exception {
        try {
            this.trowInner();
        } catch (Exception e) {
            throw new Exception("внешнее исключение", e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        WithException pudenko = new WithException();
//        pudenko.catchInner();
        try {
            pudenko.catchInner();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }
}
