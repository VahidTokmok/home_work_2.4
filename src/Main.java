import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Заполнение списка А
        ArrayList<String> listA = new  ArrayList<>();
        System.out.println("Введите 5 слов: ");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }
        System.out.println(listA);

        // Заполнение списка В
        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите 5 слов: ");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }
        System.out.println(listB);

        // Переворачиваем список В
        Collections.reverse(listB);

        // Соединяем поочереди элементы списков А и В в список С
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);

        // Сортируем список С в порядке увеличения длинны строрки
        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println(listC);

    }
}
