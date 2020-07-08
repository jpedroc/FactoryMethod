package FactoryMethod;

public class VCT implements Importador {
    @Override
    public Vinho importarVinho() {
        return new DonMelchor();
    }
}
