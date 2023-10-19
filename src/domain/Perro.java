package domain;

public class Perro extends Animal {

    private String perrito;
    public Perro(String animal, String accion, String perrito) {
        super(animal, accion);
        this.perrito = perrito;
    }

    //sobre escritura de metodo comer y polimorfismo

    @Override
    public void comen(){
        System.out.println("El perro esta comiendo");
    }

    @Override
    public void caminan() {
        super.caminan();
    }

    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }

    public void oler(){
        System.out.println("El perro esta oliendo");
    }

    public String getPerrito() {
        return perrito;
    }

    public void setPerrito(String perrito) {
        this.perrito = perrito;
    }
}
