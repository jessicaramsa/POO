package Unidad3.Monstruos.Polimorfismo;

public class Dragón implements MonstruoPeligroso {
    @Override
    public void amenazar(){
        System.out.println("Grarrr");
    }
    
    @Override
    public void destruye(){
        System.out.println("Hit");
    }
    
    public static void main(String[] args){
        Dragón uno = new Dragón();
        
        uno.amenazar();
    }
}
