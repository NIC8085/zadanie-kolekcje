import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ParyImion {
    private static ArrayList<String> pary = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);
    public void paryImionWprowadzanie(){
        System.out.println("Podaj imiona (\"-\" przerywa wprowadzanie )");

        String imie;
        int i=0;
        while(true){
            i++;
            System.out.println("Podaj piewsze imie z "+i+" pary:");
            imie=in.nextLine();
            if(Objects.equals(imie, "-")){
                break;
            }
            pary.add(imie.trim());
            System.out.println("Podaj drugie imie z "+i+" pary:");
            imie=in.nextLine();
            if(Objects.equals(imie, "-")){
                break;
            }
            pary.add(imie.trim());
        }
    }
    private String sprawdzaniePary(){
        String imie1;
        int index;
        System.out.println("Podaj imie osoby do ktorej szukasz pary:");
        imie1=in.nextLine();

        if(!pary.contains(imie1)){
            return "nie ma takiej osoby";
        }
        index=pary.indexOf(imie1);
        if(index%2==1){
            //try {
            return pary.get(index - 1);
        }
        else {
            try{
                return pary.get(index + 1);
            }
            catch(IndexOutOfBoundsException exception){
                return "brak";
            }
        }
    }
    public void wyswietlanie(){
        paryImionWprowadzanie();
        System.out.println("Para tej osoby to: "+sprawdzaniePary());
    }
    //{}
}
