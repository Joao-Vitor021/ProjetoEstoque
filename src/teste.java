import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque e1 = new Estoque();
        boolean rodando = true;

        while (rodando) {
            System.out.println("---CONTROLE DE ESTOQUE---\n");
            System.out.println("1- Adicionar produto \n2- Listar produtos \n3- Buscar produto \n4- Remover produto \n5- Atualizar produto \n6- Finalizar programa ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.println("Informe essas informações: \nNome: ");
                    String nome = entrada.nextLine();

                    System.out.println("Preço: ");

                    double preco = entrada.nextDouble();

                    System.out.println("Quantidade: ");
                    int qtd = entrada.nextInt();

                    e1.adicionaProduto(nome, preco, qtd);
                    break;

                }

                case 2:
                    e1.listarEstoque();
                    break;

                case 3: {
                    System.out.println("Produtos disponiveis");
                    for (Produto mostrar : e1.getEstoque()) {

                        System.out.printf("Nome: %s ID: %d\n", mostrar.getNome(), mostrar.getId());
                    }

                    System.out.println("Digite o id do produto: ");
                    int id = entrada.nextInt();
                    e1.buscarId(id);
                    break;
                }

                case 4: {
                    System.out.println("Produtos disponiveis");
                    for (Produto mostrar : e1.getEstoque()) {

                        System.out.printf("Nome: %s ID: %d\n", mostrar.getNome(), mostrar.getId());

                    }

                    System.out.println("Digite o id do produto que você deseja remover: ");
                    int id = entrada.nextInt();
                    e1.removerId(id);
                    break;
                }
                case 5: {
                    System.out.println("Produtos disponiveis");
                    for (Produto mostrar : e1.getEstoque()) {

                        System.out.printf("Nome: %s ID: %d\n", mostrar.getNome(), mostrar.getId());
                    }
                    System.out.println("Digite o id do produto que você deseja atualizar: ");
                    int id = entrada.nextInt();

                    e1.atualizarProduto(id);
                    break;

                }
                case 6: {
                    System.out.println("Sistema finalizado");
                    rodando = false;
                }
                break;
                default:
                    System.out.println("Opção inválida ");

            }
        }
    }
}