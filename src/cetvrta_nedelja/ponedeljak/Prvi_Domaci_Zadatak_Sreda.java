package cetvrta_nedelja.ponedeljak;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Prvi_Domaci_Zadatak_Sreda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // instanca skenera za sve zadatke

        /*
        1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1).
        Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
        Ako je ocena 5, slovna ocena je "Odlican".
        Ako je ocena 4, slovna ocena je "Vrlo dobar".
        Ako je ocena 3, slovna ocena je "Dobar".
        Ako je ocena 2, slovna ocena je "Dovoljan".
        Ako je ocena 1, slovna ocena je "Nedovoljan".
         */

        System.out.println("Unesite ocenu izmedju 1 i 5");
        int ocena = Integer.parseInt(scanner.nextLine());
        String opisOcene;

        switch (ocena) {
            case 1:
                opisOcene = "nedovoljan";
                break;
            case 2:
                opisOcene = "dovoljan";
                break;
            case 3:
                opisOcene = "dobar";
                break;
            case 4:
                opisOcene = "vrlo dobar";
                break;
            case 5:
                opisOcene = "odlican";
                break;
            default:
                opisOcene = "nepostojeca";
                break;
        }

        System.out.printf("Opis unete ocene je: %s\n", opisOcene);

        /*
        2. Napisi program koji koristi for petlju da proveri da li je broj N prost.
        Korisnik treba da unese vrednost N, a program treba da ispita da li je taj broj deljiv samo sa 1 i sa samim sobom.
        Ispiši odgovarajuću poruku.
         */

        System.out.print("Unesite neki broj: ");
        int n = Integer.parseInt(scanner.nextLine());
        boolean prost = true;

        if (n <= 1) {
            prost = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prost = false;
                    break;
                }
            }
        }

        System.out.println(n + (prost ? " je prost broj." : " nije prost broj."));

    }

}
