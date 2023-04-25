package classes;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho() {
        System.out.println("Fazendo ninho.");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'locomover'");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alimentar'");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitirSom'");
    }

    
}
