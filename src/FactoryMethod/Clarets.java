package FactoryMethod;

public class Clarets implements Importador{
    @Override
    public Vinho importarVinho() {
        return new Almaviva();
    }
}
