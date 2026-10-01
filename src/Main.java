import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque e1 = new Estoque();
        boolean rodando = true;

        while (rodando) {
            System.out.println("---CONTROLE DE ESTOQUE---\n");
            System.out.println("1- Adicionar produto \n2- Listar produtos \n3- Buscar produto \n4- Remover produto \n5- Atualizar produto \n6- Finalizar programa ");
            int opcao = 0;
            try {
                opcao = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido");
                entrada.nextLine();
                continue;
            }
            entrada.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.println("Informe essas informações: \nNome: ");
                    String nome = entrada.nextLine();

                    System.out.println("Preço: ");

                    try {
                        double preco = entrada.nextDouble();

                        System.out.println("Quantidade: ");
                        int qtd = entrada.nextInt();

                        e1.adicionaProduto(nome, preco, qtd);


                    } catch (IllegalArgumentException e) {
                        System.out.println("Digite informação válida");
                        entrada.nextLine();
                        continue;

                    } catch (InputMismatchException e) {
                        System.out.println("Digite um preço/quantidade válidos");
                        entrada.nextLine();
                        continue;

                    }

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

                    try {
                        System.out.println("Digite o id do produto: ");
                        int id = entrada.nextInt();
                        e1.buscarId(id);

                    } catch (InputMismatchException e) {
                        System.out.println("Digite valor válido");
                        entrada.nextLine();
                        continue;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        entrada.nextLine();
                        continue;
                    }

                    break;
                }

                case 4: {
                    System.out.println("Produtos disponiveis");
                    for (Produto mostrar : e1.getEstoque()) {

                        System.out.printf("Nome: %s ID: %d\n", mostrar.getNome(), mostrar.getId());

                    }

                    System.out.println("Digite o id do produto que você deseja remover: ");
                    try {
                        int id = entrada.nextInt();
                        e1.removerId(id);
                    } catch (InputMismatchException e) {
                        System.out.println("Digite valor válido");
                        entrada.nextLine();
                        continue;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        entrada.nextLine();
                        continue;

                    }

                    break;
                }
                case 5: {
                    System.out.println("Produtos disponiveis");
                    for (Produto mostrar : e1.getEstoque()) {

                        System.out.printf("Nome: %s ID: %d\n", mostrar.getNome(), mostrar.getId());
                    }
                    System.out.println("Digite o id do produto que você deseja atualizar: ");
                    try {
                        int id = entrada.nextInt();
                        e1.atualizarProduto(id);
                    } catch (InputMismatchException e) {
                        System.out.println("Digite valor válido");
                        entrada.nextLine();
                        continue;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        entrada.nextLine();
                        continue;

                    }


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