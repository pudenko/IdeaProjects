       /* Используя IntelliJ IDEA, создайте проект.Требуется:
        Создайте 2 интерфейса Playable и Recodable.
        В каждом из интерфейсов создайте по 3 метода
        void play() / void pause() / void stop() и void record()
        / void pause() / void stop() соответственно.
        Создайте производный класс Player
        от базовых интерфейсов Playable и Recodable.
        Написать программу, которая выполняет проигрывание и запись*/

package interface1;

public class Main {
    public static void main(String[] args) {
        Playable play;
        Recodable recodable;
        play = new Player();
        recodable = new Player();
        recodable.record();
        play.play();
    }
}
