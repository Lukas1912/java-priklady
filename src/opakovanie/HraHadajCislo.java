package opakovanie;

/*Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ musí uhádnuť číslo. Ak uhádne menšie, tak
mu Java vypíše Neuhádol si, moje číslo je väčšie, analogicky Neuhádol si, moje číslo je menšie a pri úspešnom uhádnutí
 BINGO! Uhádol si!
Bonusová úloha:
Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.


*/
import java.util.Random;
import java.util.Scanner;

public class HraHadajCislo {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner scn=new Scanner(System.in);

        int maximalnaHodnota =10;
        int minimalnaHodnota =1;
        int NahodneCisloGenerovaneJavou  = r.nextInt(maximalnaHodnota - minimalnaHodnota + 1) + minimalnaHodnota;

        System.out.println("ChetNahodneCisloGenerovaneJavou");
        int zadaneCisloPouzivatelom = 0;
          //Zaciatok opakovanie
        while(NahodneCisloGenerovaneJavou!=zadaneCisloPouzivatelom ) {
        System.out.println("Zadaj cislo od 1 do 10");
        zadaneCisloPouzivatelom = scn.nextInt();

        if (NahodneCisloGenerovaneJavou==zadaneCisloPouzivatelom){
            System.out.println("Ano,uhadol si!");
        } else if (NahodneCisloGenerovaneJavou>zadaneCisloPouzivatelom) {
            System.out.println("Nie,neuhadol si moje vygeneropvane cislo je vacsie ");

        }else {
            System.out.println("Nie,neuhadol si moje vygeneropvane cislo je mensie !");
        }


    } }}

