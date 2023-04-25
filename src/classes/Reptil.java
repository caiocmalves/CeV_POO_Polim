package classes;

public class Reptil extends Animal{
    private String corEscama;



    @Override
    public void locomover() {
        System.out.println("Arrastando");
    }

    @Override
    public void alimentar() {
       System.out.println("Mastigando");
    }

    @Override
    public void emitirSom() {
        System.out.println("xxxxxxxxxxxx");
    }


}
