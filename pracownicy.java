public class pracownicy {

    private String adres;
    private int kod_pocztowy;
    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko;
    private int wyplata;

    public pracownicy(String adres, int kod_pocztowy, String imie, String nazwisko, int wiek, String stanowisko, int wyplata) {
        this.adres = adres;
        this.kod_pocztowy = kod_pocztowy;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
        this.wyplata = wyplata;
    }
}
