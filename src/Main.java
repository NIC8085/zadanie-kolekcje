import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        UnikalneImiona unikalneImiona = new UnikalneImiona();
        ParyImion paryImion = new ParyImion();
        int wybor = 0;
        System.out.println("Wybierz zadanie:");
        System.out.println("1. Unikalne imiona");
        System.out.println("2. Pary imion");
        try {
            wybor=in.nextInt();
        }
        catch (InputMismatchException exception){
            System.out.println("Podano zla wartosc");
            return;
        }
        if(wybor==1){
            unikalneImiona.wyswietlanie();
        }
        else if(wybor==2){
            paryImion.wyswietlanie();
        }
        else{
            System.out.println("Podano zla wartosc");
        }
        //{}
    }
}