package proizvolniy;

public class DocumentWorker extends Document {
    @Override
    public void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    public void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    @Override
    public void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }

}
