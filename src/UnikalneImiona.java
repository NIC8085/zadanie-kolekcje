import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UnikalneImiona{
    private static ArrayList<String> imiona = new ArrayList<>();
    private static ArrayList<String> uzyte = new ArrayList<>();
    public ArrayList<String> unikalneImieWprowadzanie(){
        System.out.println("Podaj imiona (\"-\" przerywa wprowadzanie )");
        Scanner in = new Scanner(System.in);
        String imie;
        int i=0;
        while(true){
            i++;
            System.out.println("Podaj "+i+" imie:");
            imie=in.nextLine();
            if(Objects.equals(imie, "-")){
                break;
            }
            imiona.add(imie.toLowerCase().trim());
        }
        return imiona;
    }
    private int unikalne_imiona_sprawdzanie(){
        int liczba_unikalnych_imion=0;
        for(String a:imiona) {
            if (uzyte.contains(a)){
                continue;
            }
            else{
                uzyte.add(a);
                liczba_unikalnych_imion++;
            }
        }
        return liczba_unikalnych_imion;
    }
    public void wyswietlanie(){
        unikalneImieWprowadzanie();
        System.out.println("Liczba unikalnych imion: "+unikalne_imiona_sprawdzanie());
    }


    //{}
}
