package cetvrta_nedelja.cetvrtak;

import java.util.Arrays;
import java.util.Scanner;

public class Prvi_Domaci_Zadatak_Nedelja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // skener za oba zadatka
        /*

        1. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza

         */

        int n;

        do {
            System.out.print("Unesite duzinu vaseg niza: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 1) {
                System.out.println("Niz mora imati barem jednog clana. Pokusajte ponovo");
            } else if (n == 1) {
                System.out.println("Cudan izbor, ali ok."); // savrseno je legitimno imati i niz od samo jednog clana - ne i uobicajeno
            }
        } while (n < 1);

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Unesite %d. clana niza: ", i + 1); // zelim da na ispisu imam redne brojeve clanova, ne indekse
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum += arr[i];
        }

        System.out.print("Clanovi vaseg niza su sledeci brojevi: ");
        for (int num : arr) { // moze i krace sa Arrays.toString() metodom, ali neka fokus ostane na iteriranju kroz niz
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.printf("Suma svih clanova vaseg niza iznosi %d\n", sum);



        // 2. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca maksimalni element u nizu


        // postavka ista kao u prethodnom zadatku, sta da radim
        int len;

        do {
            System.out.print("Unesite duzinu vaseg niza: ");
            len = Integer.parseInt(scanner.nextLine());
            if (len < 1) {
                System.out.println("Niz mora imati barem jednog clana. Pokusajte ponovo");
            } else if (len == 1) {
                System.out.println("Cudan izbor, ali ok.");
            }
        } while (len < 1);

        int[] array = new int[len];
        int max = Integer.MIN_VALUE; // nadam se da se ovo priznaje

        for (int i = 0; i < len; i++) {
            System.out.printf("Unesite %d. clana niza: ", i + 1);
            array[i] = Integer.parseInt(scanner.nextLine());
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Clanovi vaseg niza su: " + Arrays.toString(array)); // da ne bude isto kao u proslom zadatku
        System.out.printf("Najveci element u vasem nizu je broj %d", max);

    }
}
