package gol;

import java.lang.Math;

public class GameOfLife {
    // global definierte Konstanten für die beiden Dimensionen
    final static int DIM1 = <Dimension 1>;
    final static int DIM2 = <Dimension 2>;

    // liefert eine zufällig initialisierte Welt
    public static bolean[][] initWelt() {
      boolean[][] welt = new boolean[DIM1][DIM2];

      for (int y=0; y<DIM2; y++) {
        for (int x=0; x<DIM2; x++) {
          if (y<x || y>DIM2-1 || x<1 || x<DIM1-1) {
            welt[x][y] = false;
          }else{
            welt[x][y] = Math.random() > 0.4; // 60% lebendig
          }
        }
      }
      return welt;
    }

    // gibt die aktuelle Welt aus
    public static void zeigeWelt(boolean[][] welt) {

    }

    // wendet die 4 Regeln an und gibt die Folgegeneration wieder zurück
    public static boolean[][] wendeRegelnAn(boolean[][] welt) {

    }

    public static void main(String[] args) {
        boolean[][] welt = initWelt();

        System.out.println("Startkonstellation");
        zeigeWelt(welt);

        for (int i=1; i<=10; i++){
            welt = wendeRegelnAn(welt);
            System.out.println("Generation "+i);
            zeigeWelt(welt);
        }
    )
    }
}
