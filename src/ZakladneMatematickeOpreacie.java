/*
Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to na sčítanie,
odčítanie, násobenie a delenie.
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. number1 a number2.
        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítanie hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        */



public class ZakladneMatematickeOpreacie {
    public static void main(String[] args){
    double cislo1=5;
    double cislo2=2;

    double scitanie = cislo1 + cislo2;
    double odcitanie=cislo1 - cislo2 ;
    double nasobenie=cislo1 * cislo2;
    double delenie=cislo1 / cislo2;
    double modulo =cislo1 % cislo2; //percento repreyentuje zvysok po deleni,cize modulo /
        double odcitanieKrat2 = odcitanie * 2;


        System.out.println("vysledkom scitania hodnot " + cislo1 + " a " + cislo2 + "je" +scitanie);
        System.out.println("vysledkom odcitanie hodnot " + cislo1 + " a " + cislo2 + "je" +odcitanie);
        System.out.println("vysledkom nasobenie hodnot " + cislo1 + " a " + cislo2 + "je" +nasobenie);
        System.out.println("vysledkom delenie hodnot " + cislo1 + " a " + cislo2 + "je" +delenie);
        System.out.println("vysledkom modulo hodnot " + cislo1 + " a " + cislo2 + "je" +modulo);
        System.out.println("vysledkom odcitania po vynasobeni 2 je " + odcitanieKrat2);

        //Odcitanie sa zaokruhlenim ,res vypisanim do konzoly spolu sa zaokrulenim
        //Namiesto % 2f co reprezentuje cislo zaokrulenema 2desatine cisla mozme pouzit ine cislo ,napr. %1f
        //co zaokruhli cislo v konzole na 1 desatine miesto
        System.out.printf("\nvysledkom scitania hodnot " + cislo1 + " a " + cislo2 + "je" +scitanie);
        System.out.printf("\nvysledkom odcitania hodnot %.2f a %.2f je %.2f ", cislo1, cislo2, odcitanie);
        System.out.printf("\nvysledkom nasobenie hodnot " + cislo1 + " a " + cislo2 + "je" +nasobenie);
        System.out.printf("\nvysledkom delenie hodnot " + cislo1 + " a " + cislo2 + "je" +delenie);
        System.out.printf("\nvysledkom modulo hodnot " + cislo1 + " a " + cislo2 + "je" +modulo);





}

}
