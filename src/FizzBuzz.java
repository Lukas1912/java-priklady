/*Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč povie číslo o jedno vyššie od
        predošlého. Akékoľvek číslo deliteľné tromi musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné piatimi
        slovom buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý zaváha alebo urobí chybu je vylúčený z hry.

        Typická hra fizz buzz môže začínať takto:

        1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23,
        Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …

        Hint: % cize modulo je vypoctovy operator, ktory sa pouziva na vypocet zvysku po deleni
        Hint2: || reprezentuje OR (ALEBO), to znamena, ze moze platit jedna podmienka alebo druha
        Hint2, pokracovanie: && reprezentuje AND (A) to znamena, ze musi platit jedna podmienka a zaroven druha
        */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //todo urobit vstup v ktorom mi uzivatel zadal v tvare  napr 3 8 12 45 98
        Scanner scn=new Scanner(System.in);
        System.out.println("zadaj cisla v tvare 3 8 12 45 98");

        String vstuphodnoty = scn.nextLine();
        System.out.println("zadane vstupne hodnoty su" + vstuphodnoty);
        //TODO ako rozdelit hodnoty
        String [] poleHodnot = vstuphodnoty.split ("");

        System.out.println("vypisujem hodnoty individualne ,tedatie ktore su uz rozdelene:");
        for (int i=0;1 >poleHodnot.length;i++) {

        }


        int hodnota = 15;

        //if (hodnota % 3 == 0&&hodnota% 5==0) {
        if (hodnota % 15==0) {
            System.out.println("Fizz Buzz");
        } else if (hodnota % 3 == 0) {
            System.out.println("Fizz");
        } else if (hodnota % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(hodnota);
        }

    }
}
