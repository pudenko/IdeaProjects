package documentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pro = "1111";
        String exp = "2222";
        DocumentWorker dw;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите ключ для разблокировки Pro или Exp Версии или введите Esc для продолжения: ");
        String key = scanner.nextLine();
        if (key.equals(pro)) {
            System.out.println("Используется версия Pro");
            dw = new ProDocumentWorker();
        } else if (key.equals(exp)) {
            System.out.println("Используется версия Exp");
            dw = new ExpertDocumentWorker();
        } else {
            System.out.println("Используется версия Free");
            dw = new DocumentWorker();
        }
        dw.openDocument();
        dw.editDocument();
        dw.saveDocument();
    }
}
