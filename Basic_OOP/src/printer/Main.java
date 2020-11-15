//System.out.println((char) 27 + "[31mWarning! " + (char)27 + "[0m");
//Если хочешь другой цвет, то измени "[31mWarning!". Например, на "[35mWarning!". Текст будет пурпурным.
//        30 - черный. 31 - красный. 32 - зеленый. 33 - желтый. 34 - синий. 35 - пурпурный. 36 - голубой. 37 - белый.
package printer;

public class Main {
    public static void main(String[] args) {
        Printer red = new PrintAndRed();
        Printer green = new PrintGreen();
        red.print("Red");
        green.print("Green");
    }
}
