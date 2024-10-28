package cetvrta_nedelja.utorak;

import java.util.Scanner;

public class Drugi_Domaci_Zadatak_Sreda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // skener za oba zadatka

        /*
        1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
        unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
         */

        final String PASSWORD = "nekitamopassword";
        String input;

        do {
            System.out.print("Unesite lozinku: ");
            input = scanner.nextLine();

            if (!input.equals(PASSWORD)) { // password je case-sensitive
                System.out.println("Neispravna lozinka, pokusajte ponovo");
            }
        } while (!PASSWORD.equals(input));

        System.out.println("Lozinka ispravna! Dobro Vi nama dosli!");

        /*
        2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
        treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
        da je drugi broj jednak nuli.
         */


        System.out.println("Unesite dva broja i dobicete njihov kolicnik");

        // posto nije naglaseno da li brojevi mogu biti i decimalni, kupim ih sa ulaza kao double-ove, za svaki slucaj
        // a i zbog deljenja

        while (true) {
            System.out.print("Unesite deljenik: ");
            double deljenik = Double.parseDouble(scanner.nextLine());
            System.out.print("Unesite delilac: ");
            double delilac = Double.parseDouble(scanner.nextLine());

            if (delilac == 0) {
                System.out.println("Ne moze se deliti nulom. Idemo ponovo.");
            } else { // prikaz brojeva formatiram na sve decimale samo estetike radi, ne zaokruzujem rezultat deljenja
                System.out.printf("Rezultat deljenja brojeva %.2f i %.2f iznosi %.2f", deljenik, delilac, deljenik / delilac);
                break;
            }
        }

    }

}
