package Unidad5.Genericidad;

public class Stack<Tipo> {
    private int tope;
    private Tipo [] info;
    
    public Stack(){
        this.tope = -1;
        info = (Tipo[]) new Object[5];
    }
    
    public boolean isEmpty(){
        return tope == -1;
    }
    
    public boolean isFull(){
        return tope == info.length-1;
    }
    
    public void push(Tipo s){
        if(isFull()){
            System.out.println("Pila llena, no se pudo guardar " + s);
        } else {
            info[++tope] = s;
        }
    }
    
    public Tipo pop(){
        if(isEmpty()){
            System.out.println("Pila Vacía");
            return null;
        } else {
            return info[tope--];
        }
    }
    
}
