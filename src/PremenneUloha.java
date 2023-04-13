// *Student Jozef Mrkvicka sa narodil 03.04.2000, z maturitnej skusky ma znamku 1.5 a od septembra 2000 nastúpi do
//nového zamestnania ako Java programátor.
// V Bratislave dňa 26.03.202*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class PremenneUloha {
    public static void main(String[] args) {
        String meno = "Jožko Mrkvička ";
        String mesiac= "septembra";

       String  datumNarodenia = "03.04.2000";
        Date aktualnyDatum = new Date ();
        SimpleDateFormat formatDatumu = new SimpleDateFormat ("dd.MM.yyyy"); // A my ten anglicky format musime preklopit na Slovesnky

        //
        double znamka = 1.5;
        String znamkaSDesatinouCiarkou = String.format(" %.1f ", znamka );
        // TODO Moznost zmeny znamky prostrednictvom premenej
        int rok = 2022;
        //String aktualnyDatum="18.06.2022";

        System.out.println("Student " +meno+" sa narodil " + datumNarodenia + ",z maturitnej skusky ma znamku " + znamkaSDesatinouCiarkou + " a od " +
                mesiac + " " + rok + " nastúpi do nového zamestnania ako Java programátor. \n" +
                "\tV Bratislave dňa " + formatDatumu.format(aktualnyDatum));





    }


}