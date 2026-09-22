import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    ArrayList<Produto> estoque;
    Scanner entrada = new Scanner(System.in);

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

    public Produto buscarId(int id) {

        for (Produto buscar : estoque) {
            if (id == buscar.getId()) {
                System.out.println(buscar + "\n");
                return buscar;
            }

        }
        System.out.println("Produto não encontrado");
        return null;
    }

    public void removerId(int id) {
        for (int i = 0; i <estoque.size(); i++){
            if (estoque.get(i).getId() == id) {
                System.out.printf("%s removido com sucesso\n",estoque.get(i).getNome());
                estoque.remove(i);

                return;

            }
        }
        System.out.println("Produto não encontrado");
    }

    public void atualizarProduto(int id) {

        Produto p1 = buscarId(id);
        boolean rodando = true;
        while (rodando) {
            System.out.println("1- Atualizar nome \n2- Atualizar preço \n3- Atualizar quantidade \n4- Finalizar atualizações ");
            int opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome novo: ");
                    String nome = entrada.nextLine();
                    p1.setNome(nome);
                    break;
                }
                case 2: {
                    System.out.println("Digite o preço novo: ");
                    double preco = entrada.nextDouble();
                    p1.setPreco(preco);
                    break;
                }
                case 3: {
                    System.out.println("Digite a quantidade nova: ");
                    int quant = entrada.nextInt();
                    p1.setQuant(quant);
                    break;
                }
                case 4: {
                    System.out.println("Atualizações finalizadas ");
                    rodando = false;
                    break;
                }

                default:
                    System.out.println("Opção inválida! ");
            }
        }

    }

    public ArrayList<Produto> getEstoque() {
        return estoque;
    }
}




