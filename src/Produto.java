import java.util.ArrayList;

public class Produto {
    ArrayList<Integer> lista = new ArrayList<>();
    private int id;
    private String nome;
    private double preco;
    private int quant;


    public Produto(String nome, double preco, int quant) {
        do {
            this.id = (int) (Math.random() * 10000 + 1);
        } while (lista.contains(id));
        lista.add(id);

        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String toString() {
        return String.format("Id: %d\nNome: %s\nPreço: R$%.2f\nQuantidade: %d", id, nome, preco, quant);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}
