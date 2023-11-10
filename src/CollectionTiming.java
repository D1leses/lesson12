package P1;

import java.util.*;

public class CollectionTiming {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();


        long startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long DOBAL = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long DOBLL = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long DOBHS = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        long DOBTS = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            arrayList.contains(i);
        }
        endTime = System.nanoTime();
        long POISKAL = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            linkedList.contains(i);
        }
        endTime = System.nanoTime();
        long POISKLL = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long POISKHS = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        long POISKTS = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 49999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        long DELAL = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 49999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        long DELLL = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 49999; i >= 0; i--) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long DELHS = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 49999; i >= 0; i--) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        long DELTS = endTime - startTime;

        // Вывод результатов
        System.out.println("ArrayList добавление: " + DOBAL + " наносекунд");
        System.out.println("LinkedList добавление: " + DOBLL + " наносекунд");
        System.out.println("HashSet добавление: " + DOBHS + " наносекунд");
        System.out.println("TreeSet добавление: " + DOBTS + " наносекунд");
        System.out.println("ArrayList поиск: " + POISKAL + " наносекунд");
        System.out.println("LinkedList поиск: " + POISKLL + " наносекунд");
        System.out.println("HashSet поиск: " + POISKHS + " наносекунд");
        System.out.println("TreeSet поиск: " + POISKTS + " наносекунд");
        System.out.println("ArrayList удаление: " + DELAL + " наносекунд");
        System.out.println("LinkedList удаление: " + DELLL + " наносекунд");
        System.out.println("HashSet удаление: " + DELHS+ " наносекунд");
        System.out.println("TreeSet удаление: " + DELTS+ " наносекунд");
    }
}