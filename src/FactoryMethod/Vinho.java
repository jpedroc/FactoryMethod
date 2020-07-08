package FactoryMethod;

public abstract class Vinho {
    private String nome;
    private Integer ano;
    private String tipo;

    public void exibirInfo(){
        System.out.println("O vinho " + nome + " foi produzido no ano de " + ano.toString() + ", e é um vinho " + tipo + ".");
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
