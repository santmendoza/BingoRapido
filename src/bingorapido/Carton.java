package bingorapido;

import java.util.LinkedList;

public class Carton {
    private int numCart;
    private final LinkedList<Integer> num;
    
    
    public Carton(LinkedList<Integer> n) {
        this.num = new LinkedList<>(n);
    }
    public LinkedList<Integer> getnum() { 
        return new LinkedList<>(this.num); 
    }   
    
        public int getnumC() { 
        return this.numCart; 
    }
        
    public int getTam() {
        return this.num.size(); 
    }

    
    public Carton(int numeroCarton) { 
        this.num = new LinkedList<>();
        this.numCart = numeroCarton;
    }
 
    
}
