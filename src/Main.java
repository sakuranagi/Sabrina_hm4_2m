import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> girlName = new ArrayList<>();
        ArrayList<String> boyName = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите женское имя");
            String list1 = scanner.nextLine();
            girlName.add(list1);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите мужское имя");
            String list2 = scanner.nextLine();
            boyName.add(list2);
        }

        System.out.println("Список А: " + girlName);
        System.out.println("Список Б: " + boyName);

        ArrayList<String> listC = new ArrayList<>();
        int size = Math.min(girlName.size(), boyName.size());
        for (int i = 0; i < size; i++) {
            listC.add(girlName.get(i));
            listC.add(boyName.get(4 - i));
        }
        System.out.println(listC);

        Collections.sort(listC, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Отсортированный список: " + listC);


    }
}