import java.util.Scanner;

public class  pracownicy extends klienci{

    private int nr_ID;


    public void setNr_ID(int nr_ID) {
        this.nr_ID = nr_ID;
    }

    public static void Log_in(){
        pracownicy object = new pracownicy();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr ID pracownika");
        object.setNr_ID(scanner.nextInt());
        System.out.println("Podaj email pracownika");
        object.setEmail(scanner.next());
        System.out.println("Haslo");
        object.setHaslo(scanner.next());
        System.out.println("zalogowano pomyślnie");
    }

}





