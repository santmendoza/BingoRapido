
package tamaño;

import java.util.ArrayList;

public class tamaño {
    public final static int TAM_CART = 9;
    public final static int Bola_M = 30;
   
    public static ArrayList<Integer> getNumeros() {
        
        ArrayList<Integer> aux = new ArrayList<>();
        for(int i = 1; i <= Bola_M; i++) {
            aux.add(i);
        }
        return aux;
    }
}
