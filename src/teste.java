import java.util.Scanner;

public class teste {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        Estoque e1 = new Estoque();

        e1.adicionaProduto("iphone 16e", 3540, 13);
        e1.adicionaProduto("Samsung Galaxy A17", 1299, 8);


        for (int i = 0; i < 3; i++) {

            e1.listarEstoque();
            System.out.println("Qual produto vc quer atualizar ");
            int a = entrada.nextInt();

            e1.atualizarProduto(a);


        }


    }
}
