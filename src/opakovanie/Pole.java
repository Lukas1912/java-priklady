package opakovanie;
// vyvote program ktory nacita z pola ciselne hodnoty  a vypiste ci je hodnota parna alebo neparna
public class Pole {
    public static void main(String[] args) {
        int[] cisla = {0,1, 8, 10, 12, 98,99};//Hranate zatvorky = staticke pole

        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]);
            // TODO Nastavit logigu ci je cislo parne alebo nie
            // Ak je cislo delitelne 2 tak je parne ak nie je neparne .Moze pouzit IF ,Else a modulo

            if (cisla[i] % 2 == 0) {
                System.out.println("je parne");
            } else {
                System.out.println("je neparne");
            }
        }
    }
}
