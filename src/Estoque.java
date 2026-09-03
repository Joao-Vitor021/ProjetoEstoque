import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> estoque;

    public Estoque() {
        estoque = new ArrayList<>();

    }

    public void adicionaProduto(String nome, double preco, int quant) {
        estoque.add(new Produto(nome, preco, quant));

    }

    public void listarEstoque() {
        for (Produto mostrar : estoque) {
            System.out.println(mostrar + "\n");
        }
    }

    public void buscarId(int id) {
        for (Produto buscar : estoque) {
            if (id == buscar.getId()) {
                System.out.println(buscar + "\n");
                return;
            }

        }
        System.out.println("Produto não encontrado");
    }

    public void removerId(int id) {
        for (Produto buscar : estoque) {
            if (id == buscar.getId()) {
                estoque.remove(buscar);
                return;
            }

        }
        System.out.println("Produto não encontrado");
    }
}



