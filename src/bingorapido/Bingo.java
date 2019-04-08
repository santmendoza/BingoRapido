package bingorapido;

import tamaño.tamaño;
import java.util.Collections;
import java.util.LinkedList;

public class Bingo {
    
    private LinkedList<Carton> cartones;
    private LinkedList<Carton> cartonesG;
    private LinkedList<Integer> bombo;
    private LinkedList<Integer> bolasExt;
   

    public Bingo() {
        //constructor
        this.bolasExt = new LinkedList<>();
        this.cartones = new LinkedList<>();
        this.cartonesG = new LinkedList<>();
        this.bombo = new LinkedList<>(tamaño.getNumeros());
    }

    public boolean finalizado() {
        boolean aux = false;
        if (this.bombo.isEmpty()) {
            aux = true;
        }
        if (this.cartonesG.size() > 1) {
            aux = true;
        }
        return aux;
    }

    public Carton generarUncarton() {
        LinkedList<Integer> numeros = new LinkedList<>(this.bombo);
        LinkedList<Integer> numerosCarton = new LinkedList<>();
        Collections.shuffle(numeros);
        for (int i = 1; i <= tamaño.TAM_CART; i++) {
            numerosCarton.add(numeros.pop());
        }
        Carton cart = new Carton(numerosCarton);
        this.cartones.add(cart);
        return cart;
    }

    public int extraerBola() {
        Collections.shuffle(this.bombo);
        this.bolasExt.add(this.bombo.peekFirst());
        for (Carton c : this.cartones) {
            if (comprobarCarton(c)) {
                this.cartonesG.add(c);
                break;
            }
        }

        return this.bombo.pop();
    }

    public boolean comprobarCarton(Carton c) {
        return this.bolasExt.containsAll(c.getnum());
    }

}
