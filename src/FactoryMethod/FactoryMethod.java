package FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args){
        Importador importador = new WorldWine();
        Vinho vinho = importador.importarVinho();
        vinho.exibirInfo();
        System.out.println();

        importador = new VCT();
        vinho = importador.importarVinho();
        vinho.exibirInfo();
        System.out.println();

        importador = new Clarets();
        vinho = importador.importarVinho();
        vinho.exibirInfo();
        System.out.println();
    }
}
