public class Fruta {
    private String nome;
    private double preco;

    public Fruta(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        String validade = "11/09/2025";
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getValidade(){
        return getValidade();
    }

    
    @Override
    public String toString() {
        return "Fruta: " + nome + ", Preço: R$" + String.format("%.2f", preco);
    }
}


