package sk.tmconsulting.pozdravy;

import sk.tmconsulting.pozdravy.anglicky.PozdravujemAnglicky;
import sk.tmconsulting.pozdravy.madarsky.PozdravujeMadarsky;
import sk.tmconsulting.pozdravy.nemecky.PozdravujemNemecky;
import sk.tmconsulting.pozdravy.slovensky.PozdravujemSlovensky;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        PozdravujeMadarsky.vypis();
        PozdravujemAnglicky.vypis();
        PozdravujemNemecky.vypis();
        PozdravujemSlovensky.vypis();
    }
}
