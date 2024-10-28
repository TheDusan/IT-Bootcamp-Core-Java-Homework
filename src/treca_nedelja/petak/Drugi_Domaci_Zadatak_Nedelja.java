package treca_nedelja.petak;

import java.util.Scanner;

public class Drugi_Domaci_Zadatak_Nedelja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // inicijalizujem ovde skener da bih ga imao u svim zadacima


        // 1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)

        System.out.print("Unesite poluprecnik vaseg kruga: ");
        double r = Double.parseDouble(scanner.nextLine());
        double povrsina = Math.pow(r, 2) * Math.PI;
        double obim = 2 * r * Math.PI;
        System.out.printf("Povrsina kruga za uneti poluprecnik iznosi %f, a obim iznosi %f\n", povrsina, obim);

        /*
        2. Napisati progam koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu (6, 7, 8, 9, 10)
        prema sledecem ranigiranju
        51-60
        61-70
        71-80
        81-90
        91-100
         */

        System.out.print("Unesite broj poena od 51 - 100 ");
        int points = scanner.nextInt();

        if (points < 0 || points > 100) {
            System.out.println("Neispravan unos. Broj poena mora biti u opsegu od 0 do 100.");
        } else if (points < 51) {
            System.out.println("Student je pao na ispitu.");
        } else if (points <= 60) {
            System.out.println("Student je uspesno polozio ispit sa ocenom 6.");
        } else if (points <= 70) {
            System.out.println("Student je uspesno polozio ispit sa ocenom 7.");
        } else if (points <= 80) {
            System.out.println("Student je uspesno polozio ispit sa ocenom 8.");
        } else if (points <= 90) {
            System.out.println("Student je uspesno polozio ispit sa ocenom 9.");
        } else {
            System.out.println("Student je uspesno polozio ispit sa ocenom 10. Cestitamo!");
        }

        /*
      3. Napisi jednostavan kalkulator koji trazi od korisnika da unese dva broja i operaciju (+ ili -).
      Na osnovu izbora korisnika, program treba da izvrsi odgovarajucu operaciju.
         */

        System.out.print("Unesite prvi broj: ");
        int a = scanner.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = scanner.nextInt();
        System.out.println("Unesite + ili - da biste obavili prigodnu racunsku operaciju");
        char operation = scanner.next().charAt(0);

        if (operation != '+' && operation != '-') {
            System.out.println("Neispravan unos oznake racunske operacije.");
        } else if (operation == '+') {
            System.out.printf("Izabrali ste sabiranje. Zbir unetih brojeva iznosi %d\n", a + b);
        } else {
            System.out.printf("Izabrali ste oduzimanje. Razlika unetih brojeva iznosi %d\n", a - b);
        }

    }

}
