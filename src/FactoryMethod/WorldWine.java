package FactoryMethod;

public class WorldWine implements Importador{

    @Override
    public Vinho importarVinho() {
        return new LeClosDeMonsieurNoly();
    }
}
