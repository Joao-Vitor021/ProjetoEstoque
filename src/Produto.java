import java.util.ArrayList;

public class Produto {

    public static int idconta = 1;
    private int id;
    private String nome;
    private double preco;
    private int quant;


    public Produto(String nome, double preco, int quant) {


        this.setNome(nome);
        this.setPreco(preco);
        this.setQuant(quant);
        this.id = idconta;
        idconta++;


    }

    public String toString() {
        return String.format("Id: %d\nNome: %s\nPreço: R$%.2f\nQuantidade: %d", id, nome, preco, quant);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {

            throw new IllegalArgumentException("Erro: NÃO E PERMITIDO NOME VAZIO ");
        }

        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Erro: PREÇO INVÁLIDO!");
        } else {
            this.preco = preco;
        }
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if (quant < 0) {
            throw new IllegalArgumentException("Erro: QUANTIDADE INVÁLIDA!");
        } else if (quant == 0) {
            System.out.println("Estoque zerado!");
        }

        this.quant = quant;

    }

    public int getId() {
        return id;
    }
}
