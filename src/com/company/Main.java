package com.company;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Цикл номер 1");
        String Diavolo1 = scanner.next();
        System.out.println("Цикл номер 2");
        String Diavolo2 = scanner.next();
        System.out.println("Цикл номер 3");
        String Diavolo3 = scanner.next();
        System.out.println("Цикл номер 4");
        String Diavolo4 = scanner.next();
        System.out.println("Цикл номер 5");
        String Diavolo5 = scanner.next();

        ArrayList<String> Diavolo = new ArrayList<>();
        Diavolo.add(Diavolo1);
        Diavolo.add(Diavolo2);
        Diavolo.add(Diavolo3);
        Diavolo.add(Diavolo4);
        Diavolo.add(Diavolo5);

        System.out.println(Diavolo);

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введите имя владельца станда 1");
        String Giorno1 = scanner2.next();
        System.out.println("Введите имя владельца станда 2");
        String Giorno2 = scanner2.next();
        System.out.println("Введите имя владельца станда 3");
        String Giorno3 = scanner2.next();
        System.out.println("Введите имя владельца станда 4");
        String Giorno4 = scanner2.next();
        System.out.println("Введите имя владельца станда 5");
        String Giorno5 = scanner2.next();

        ArrayList<String> Giorno = new ArrayList<>();
        Giorno.add(Giorno1);
        Giorno.add(Giorno2);
        Giorno.add(Giorno3);
        Giorno.add(Giorno4);
        Giorno.add(Giorno5);

        Collections.reverse(Giorno);

        Diavolo.addAll(Giorno);

        ArrayList<String> people = new ArrayList<>();
        int countDiavolo = 0;
        int countGiorno = 0;

        for (int i = 0; i < (Diavolo.size()); i++) {
            if ((i % 2) == 0){
                people.add(Diavolo.get(countDiavolo));
                countDiavolo++;
            }else {
                people.add(Giorno.get(countGiorno));
                countGiorno++;
            }
        }
        System.out.println("List: " + people);

        people.sort(Comparator.comparing(String::length));
        System.out.println("Sorted list: " + people);


    }
}
