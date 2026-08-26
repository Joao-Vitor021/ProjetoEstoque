import java.util.ArrayList;

public class Produto {
    ArrayList<Integer> lista = new ArrayList<>();
    private int id;
    private String nome;
    private double preco;
    private int quant;


    public Produto(String nome, double preco, int quant) {

        if (nome.isBlank()) {

            throw new IllegalArgumentException("Erro: NÃO E PERMITIDO ESPAÇO VAZIO ");
        }
        for (int i = 0; i < nome.length(); i++) {
            if (Character.isDigit(nome.charAt(i))) {
                throw new IllegalArgumentException("Erro: NÃO E PERMITIDO NÚMEROS NO NOME");
            }

        }
        this.nome = nome;
        if (preco < 0) {
            throw new IllegalArgumentException("Erro: PREÇO INVÁLIDO!");
        } else {
            this.preco = preco;
        }
        if (quant < 0) {
            throw new IllegalArgumentException("Erro: QUANTIDADE INVÁLIDA!");
        } else {
            this.quant = quant;
        }

        do {
            this.id = (int) (Math.random() * 10000 + 1);
        } while (lista.contains(id));
        lista.add(id);

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
