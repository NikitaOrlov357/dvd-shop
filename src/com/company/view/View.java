package com.company.view;

import com.company.service.DvdService;

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
                case "2" -> pass();
                case "3" -> pass();
                case "4" -> pass();
                case "5" -> pass();
                case "6" -> pass();
                case "7" -> pass();
            }
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

}
