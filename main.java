/**
Funkcja psvm : Funkcja która wpisuje dane klienta.
Funkcja glowna : Umożliwia wybranie kategorii w naszej wypożyczalni.
Funkcja promocje : Informuje klienta na co i kiedy jest promocja.
Funkcja marki_samochodow : Funkcja umożliwia zakup wyporzyczenia dla danej marki samochodu.
Funkcja wypożyczenie : Informuje na ile i za ile są wypożyczenia oraz wyświetla jakie auto kto wyporzyczył oraz na ile.

@autorzy
Dawid Świderski, Rafał Skarżyński
**/

import java.util.Scanner;

public class main extends klienci {
    public main(String adres, int kod_pocztowy, String imie, String nazwisko, int wiek) {
        super(adres, kod_pocztowy, imie, nazwisko, wiek);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzupełnij swoje dane");
        klienci.imie = scanner.next();
        klienci.nazwisko = scanner.next();
        klienci.adres = scanner.next();
        klienci.wiek = scanner.nextInt();
        klienci.kod_pocztowy = scanner.nextInt();

        klienci obiekt = new klienci(klienci.adres, klienci.kod_pocztowy, klienci.imie, klienci.nazwisko, klienci.wiek);


        glowna();



    }
    public static void glowna(){
        System.out.println("Witamy w wypożyczalni sportowych samochodów");
        System.out.println("1.Promocje");
        System.out.println("2.Marki samochodów");
        System.out.println("3. Polecane produkty");
        System.out.println("4. Wyjdź ze strony");
        int opcje;
        Scanner scanner =  new Scanner(System.in);
        opcje = scanner.nextInt();

        switch(opcje){
            case 1:
                promocje();

            case 2:
                marki_samochodow();
            case 3:

            case 4:

                break;

        }

    }
    public static void promocje(){
        System.out.println("wypożycz BMW M2 na dobe za jedyne 1000 zł");
        System.out.println("taniej dla firm o 10% na miesieczne wypożyczanie samochodów");
        System.out.println("każdego 7 dnia miesiaca rabat na każdy samochód o 3%");
        glowna();
    }
    public static void marki_samochodow(){
        System.out.println("BMW");
        System.out.println("AUDI");
        System.out.println("PORSHE");
        System.out.println("LAMBORGHINI");
        System.out.println("MERCEDES-BENZ");
        System.out.println("FERRARI");
        int opcje;
        Scanner scanner= new Scanner(System.in);
        String nazwa;
        opcje = scanner.nextInt();
        switch(opcje){
            case 1:
                System.out.println("BMW M2 competition");
                System.out.println("BMW M3 competition");
                System.out.println("BMW M5 competiotion");
                opcje = scanner.nextInt();
                switch (opcje){
                    case 1:
                        nazwa = "BMW M2 competition";
                        wypozyczenie("BMW M2 competition");
                    case 2:
                        nazwa = "BMW M3 competition";
                        wypozyczenie("BMW M3 competition");
                    case 3:
                        nazwa = "BMW M5 competiotion";
                        wypozyczenie("BMW M5 competition");
                }
            case 2:
                System.out.println("Audi RS7");
                System.out.println("Audi A7");
                System.out.println("Audi A3 sportback");
                opcje = scanner.nextInt();
                switch (opcje){
                    case 1:
                        nazwa = "Audi RS7";
                        wypozyczenie("Audi RS7");
                    case 2:
                        nazwa = "Audi A7";
                        wypozyczenie("Audi A7");
                    case 3:
                        nazwa = "Audi A3 sportback";
                        wypozyczenie("Audi A3 sportback");
                }
            case 3:
                System.out.println("Porshe 911");
                System.out.println("Porshe Panamera");
                System.out.println("Porshe Cayman");
                opcje = scanner.nextInt();
                switch (opcje){
                    case 1:
                        nazwa = "Porshe 911";
                        wypozyczenie("Porshe 911");
                    case 2:
                        nazwa = "Porshe Panamera";
                        wypozyczenie("Porshe Panamera");

                    case 3:
                        nazwa = "Porshe Cayman";
                        wypozyczenie("Porshe Cayman");
                }
            case 4:
                System.out.println("Lamborghini Aventador");
                System.out.println("Lamborghini Huraccana");
                System.out.println("Lamborghini Ursus");
                opcje = scanner.nextInt();
                switch (opcje){
                    case 1:
                        nazwa = "Lamborghini Aventador";
                        wypozyczenie("Lamborghini Aventador");
                    case 2:
                        nazwa = "Lamborghini Huraccana";
                        wypozyczenie("Lamborghini Huraccana");
                    case 3:
                        nazwa = "Lamborghini Ursus";
                        wypozyczenie("Lamborghini Ursus");
                }
            case 5:
                System.out.println("Mercedes S 500");
                System.out.println("Mercedes G class Brabus");
                opcje = scanner.nextInt();
                switch (opcje){
                    case 1:
                        nazwa = "Mercedes S 500";
                        wypozyczenie("Mercedes S 500");
                    case 2:
                        nazwa = "Mercedes G class Brabus";
                        wypozyczenie("Mercedes G class Brabus");

                }
            case 6:
                System.out.println("Ferarri sf90");
                System.out.println("Ferarri testarossa");
                opcje = scanner.nextInt();
                switch (opcje){
                    case 1:
                        nazwa = "Ferarri sf90";
                        wypozyczenie("Ferarri sf90");
                    case 2:
                        nazwa= "Ferarri testarossa";
                        wypozyczenie("Ferarri testarossa");
                }
        }



        glowna();
    }

    public static void wypozyczenie(String input){
        System.out.println("wypożycz na dobę za 1150 zł");
        System.out.println("Wypożycz na tydzień za 7500 zł");
        System.out.println("Wypożycz na miesiąc za 26000 zł");
        Scanner scanner = new Scanner(System.in);
        int opcje;
        opcje=scanner.nextInt();
        switch (opcje){
            case 1:
                System.out.println("wypożyczyłes samochod marki "+ input+ " na dobre");
                glowna();
                break;
            case 2:
                System.out.println("wypożyczyłes samochod marki "+ input+" na tydzien");
                glowna();
                break;
            case 3:System.out.println("wypożyczyłes samochod marki "+ input+" na miesiac");
                glowna();
                break;
        }


    }


}
