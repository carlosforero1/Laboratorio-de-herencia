package domain;

public class Animal {

    private String animal;
    private String accion;

    public Animal(String animal, String accion){
        this.animal = animal;
        this.accion = accion;
    }
    public void respiran(){
        System.out.println("El animal esta respirando");
    }


    public void comen(){
        System.out.println("El animal esta comiendo");
    }

    public void caminan(){
        System.out.println("El animal camina");
    }

    public String num(String animal){
        return animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

}
