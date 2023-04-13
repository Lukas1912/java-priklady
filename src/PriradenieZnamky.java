
//Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
//Ak je percento nad 90, tak vypíše známku A
//Ak je percento nad 75, tak vypíše známku B
//Ak je percento nad 65, tak vypíše známku C
//Použite metódu pre rozhodovanie.

public class PriradenieZnamky {
    public static void main(String[] args) {
        int percento =76;

        if (percento > 90) {
            System.out.println("Mas znamku A");
            System.out.println("Hodnotenie a oznamime aj e-mailom");

        } else if (percento  > 75) {
            System.out.println("Mas znamku B ");
        } else if (percento>65) {
            System.out.println("MasZnamkuC");

        } else {
            System.out.println("Prepadol si");
        }

        }

    }
