package Quarto.Model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Willem Kuijpers
 * @version 1.0 27-2-2021 17:39
 */
public class BlokkenBox {
    private final Set<Blok> blokkenSet;

    public BlokkenBox() {
        this.blokkenSet = new HashSet<>();
        maakBlokken();
    }

    // nog sorteren met Collections.sort
    // equals en hashcode methodes aanmaken

    public void maakBlokken() {
        for (Blok.Grootte grootte : Blok.Grootte.values()) {
            for (Blok.Kleur kleur : Blok.Kleur.values()) {
                for (Blok.Vorm vorm : Blok.Vorm.values()) {
                    for (Blok.Vulling vulling : Blok.Vulling.values()) {
                        Blok blok  = new Blok(grootte,kleur,vorm,vulling);
                        blokkenSet.add(blok);

                    }
                }
            }
        }
    }

    public Blok neemBlok(Blok blok) throws QuartoException {
        if (blokkenSet.contains(blok.hashCode()) == false) {
            throw new QuartoException("De index is incorrect");
        } else {
            blokkenSet.remove(blok);
            return blok;
        }
    } //nog eens testen, weet niet of het werkt

    public int aantalBlokken(BlokkenBox blokkenBox) {return (blokkenBox.blokkenSet.size());}

    public boolean isLeeg() {return blokkenSet.isEmpty();}

    public Set<Blok> getBlokkenSet() {
        return BlokkenBox.this.blokkenSet;
    }

    @Override
    public String toString() {
        String resultaat = "";
        int i = 0;
        for (Blok blok:
             this.blokkenSet) {
            resultaat = resultaat + "\n" + (i++) + blok;
        }
        return resultaat;
    }
}