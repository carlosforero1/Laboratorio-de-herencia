package domain;

public class Gato extends Animal {

    private String gatito;
    public Gato(String animal, String accion, String gatito) {
        super(animal, accion);
        this.gatito=gatito;
    }
    //sobre escritra del metodo comer y polimorfismo

    //polimorfismo:
    @Override
    public void comen(){
        System.out.println("El gato esta comiendo");   }
    //sobre escritura metodos
    @Override
    public void caminan() {
        super.caminan();
    }
    public void duermen(){
        System.out.println("El animal esta duermiendo");
    }

    public void limpian(){
        System.out.println("El animal se esta limpiando");
    }

    public String getGatito() {
        return gatito;
    }

    public void setGatito(String gatito) {
        this.gatito = gatito;
    }
}
