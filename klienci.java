import java.util.Scanner;

public class klienci {
    private String email;
    private String imie;
    private String haslo;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public static void Log_in(){
        pracownicy object = new pracownicy();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        object.setNr_ID(scanner.nextInt());
        System.out.println("Podaj email klienta");
        object.setEmail(scanner.next());
        System.out.println("Podaj haslo");
        object.setHaslo(scanner.next());
        System.out.println("zalogowano pomyślnie");
    }

}
