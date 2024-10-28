package cetvrta_nedelja.petak;

import java.util.Scanner;

public class Drugi_Domaci_Zadatak_Nedelja {
    public static void main(String[] args) {

        // 3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.

        Scanner scanner = new Scanner(System.in); // skener za sve zadatke
        double num;

        do {
            System.out.print("Unesite neki pozitivan broj: ");
            num = Double.parseDouble(scanner.nextLine()); // nije naglaseno da li su iskljucivo celi brojevi u pitanju
            if (num <= 0) {
                System.out.println("Uneti broj mora biti veci od 0, pokusajte ponovo!");
            }
        } while (num <= 0);


        printSquared(num);
        printRoot(num);

        // 4. Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.

        int number;

        do {
            System.out.print("Unesite neki pozitivan ceo broj: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Uneti broj mora biti veci od 0!");
            }

        } while (number < 0);

        System.out.printf("Faktorijel broja %d iznosi %d", number, fact(number));


    }


    public static void printSquared(double number) {
        System.out.printf("Kvadrat broja %.2f iznosi %.2f\n", number, Math.pow(number, 2)); // format zbog lepseg ispisa
    }

    public static void printRoot(double number) {
        System.out.printf("Koren broja %.2f iznosi %.2f\n", number, Math.sqrt(number)); // isto sto i gore
    }

    public static long fact(int number) { // ako neko hoce da ga pokvari, moze ga pokvariti, ali neka stoji da vraca long
        if (number == 0) {                // da se ne bavimo sada tim stvarima
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }

}
