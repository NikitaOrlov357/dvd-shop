package com.company.view;

import com.company.dto.Dvd;
import com.company.dto.Fields;
import com.company.service.DvdService;
import com.company.service.exceptions.DvdWasNotFoundException;

import java.util.Scanner;

public class View {
    static Scanner in = new Scanner(System.in);
    static DvdService dvdService = new DvdService();

    public static void mainLoop () {
        for (;;) {
            printMainMenu();
            String choice = in.nextLine();
            cls();
            switch (choice){
                case "1" -> printAddDvdMenu();
                case "2" -> remove();
                case "3" -> editDvdByName();
                case "4" -> printDvdByName();
                case "5" -> printAllDvd();
                case "6" -> pass();
                case "7" -> pass();
            }
            System.out.print("Введите любое число >> ");
            in.nextLine();
            cls();
        }
    }

    public static void cls(){
        for (int i = 0 ; i < 100; i++ ) {
            System.out.println();
        }
    }

    public static void pass() {

    }

    private static void printMainMenu (){
        String menu = """
                   Выберите пунтк меню
                1) Добавить DVD
                2) Удалить DVD
                3) Изменить DVD
                4) Вывести DVD по названию
                5) Вывести все DVD
                6) Сохранить
                7) Загрузить
                ↓
                """;
        System.out.print(menu);
    }

    public static void printAddDvdMenu(){
        System.out.print("Введите название >> ");
        String title = in.nextLine();
        System.out.print("Введите дату >> ");
        String date = in.nextLine();
        System.out.print("Введите mpaaRating >> ");
        int mpaaRating = Integer.parseInt(in.nextLine());
        System.out.print("Введите имя директора >> ");
        String nameOfDirector = in.nextLine();
        System.out.print("Введите студию >> ");
        String studio = in.nextLine();
        System.out.print("Введите заметку >> ");
        String note = in.nextLine();
        dvdService.addDvd(title, date, mpaaRating, nameOfDirector, studio, note);
    }

    public static void remove (){
        System.out.println("Введите название диска, который хотите удалить >>");
        String title = in.nextLine();
        dvdService.removeDvd(title);
    }

    public static void editDvdByName () {
        System.out.print("Введите название диска, который хотите изменить >> ");
        String title = in.nextLine();
        try {
            System.out.println(dvdService.getDvdByName(title) + "\n");
        }
        catch (DvdWasNotFoundException exception){
            System.out.println("ДИСК НЕ НАЙДЕТ, ПОПРОБУЙТЕ СНОВА");
            return;
        }

        System.out.print("Введите поле диска, которое хотите изменить >> ");
        String dvdField = in.nextLine();
        Fields field = switch (dvdField){
            case "1" -> Fields.TITLE;
            case "2" -> Fields.DATE;
            case "3" -> Fields.MPAA_RATING;
            case "4" -> Fields.NAME_OF_DIRECTOR;
            case "5" -> Fields.STUDIO;
            case "6" -> Fields.NOTE;
            default -> null;
        };

        System.out.print("Введите новое значение для поля >> ");
        String value = in.nextLine();
        try {
             dvdService.editDvd(title, field, value);
        }
        catch (DvdWasNotFoundException exception){
            System.out.println("ДИСК НЕ НАЙДЕТ, ПОПРОБУЙТЕ СНОВА");
        }
    }

    public static void printDvdByName (){
        System.out.println("Введите название диска");
        String title = in.nextLine();
        try {
            System.out.println(dvdService.getDvdByName(title));

        }
        catch (DvdWasNotFoundException exception){
            System.out.println("ДИСК НЕ НАЙДЕТ, ПОПРОБУЙТЕ СНОВА");
        }
    }

    public static void printAllDvd (){
        for (Dvd dvd:dvdService.getDvdArrayList()) {
            System.out.println(dvd + "---------------------------------------------------------------\n");
        }
    }

}
