package classes;

public class Peixe extends Animal{
    private String corEscama;


    
    public void soltarBola(){
        System.out.println("Soltando bolhas.....");
    }


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo peixe e algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }
    
}
