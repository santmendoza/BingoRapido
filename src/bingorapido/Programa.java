package bingorapido;

import bingorapido.Bingo;
import bingorapido.Carton;
import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        Bingo bingorapido = new Bingo();
        Carton c1 = new Carton(1), c2 = new Carton(2), c3 = new Carton(3);
        ArrayList<Carton> carton = new ArrayList<>(3);
        carton.add(c1);
        carton.add(c2);
        carton.add(c3);
        
        for (Carton it : carton) {
            System.out.println("Estos son los numeros del carton: " + it.getnumC());
            it = bingorapido.generarUncarton();
            System.out.println(it.getnum().toString());
        }

        
        do {
            int bola = bingorapido.extraerBola();
            System.out.println("Estas son las Bolas extraidas : " + bola);
        } while (!bingorapido.finalizado());

        
        System.out.println("\n ¡¡Juego Finalizado!! !");
        for (Carton it : carton) {
            if (bingorapido.comprobarCarton(it)) {
                System.out.println("El Carton ganador es " + it.getnumC() + " Felicidades, ganador!");
            }
        }
    }

}