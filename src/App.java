import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        String nimi = "";
        int arvaus = 0;

        do {
        System.out.println("Arvaa nimeni. (Jos haluat lopettaa, kirjoita loppu!)");
        nimi = in.nextLine();
        arvaus++;
        } while (!nimi.equals( "loppu!") && !nimi.equals("Meeri"));
        
        if (nimi.equals("Meri")) {
            System.out.println("Onnittelut!");
            System.out.println("Arvasit " + arvaus + " kertaa.");
        }
        else {
            System.out.println("Arvasit " + (arvaus -1) + " kertaa.");
        }
        
    }
}