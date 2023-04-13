/*
ZADANIE:
Úloha na opakovanie: Vypíš maticu s údajmi od 1 do 25
       Vytvorte (vypíšte) maticu údajov do konzoly, ktoré budú vyzerať nasledovne:
       1 2 3 4 5
       6 7 8 9 10
       11 12 13 14 15
       16 17 18 19 20
       21 22 23 24 25
*/
package opakovanie;

public class Uloha2 {
    public static void main(String[] args) {

        final int MAX = 25;
        for(int i = 1; i <= MAX; i++){
            if(i%5 == 0){
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int j = 1;
        for(int i = 1; i <= MAX; i++){
            if(i%5 == 0){
                System.out.println(j);
            } else {
                System.out.print(j + " ");
            }
            j = j * 2;
        }


    }
}
