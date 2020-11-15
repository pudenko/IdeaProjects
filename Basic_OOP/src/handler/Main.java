/*Создайте класс AbstractHandler.
В теле класса создать методы void open(),
void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler,
DOCHandler от базового класса AbstractHandler.
Написать программу, которая будет выполнять
определение документа и для каждого формата должны
быть методы открытия, создания, редактирования,
сохранения определенного формата документа.*/

package handler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "*.xml";
        AbstractHandler in = getObjByExt(fileName);
        if(in == null){
            return;
        }
        in.create();
        in.open();
        in.change();
        in.save();



//        System.out.println(fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()));
    }

    public static AbstractHandler getObjByExt(String fileName) {
        String input = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());

        if (input.equals("txt")) {
            return new TXTHandler();
        } else if (input.equals("xml")) {
            return new XMLHandler();
        } else if (input.equals("doc")) {
            return new DOCHandler();
        } else {
            System.out.println("Не изв., давай doc, xml и txt");
            return null;
        }
    }
}
