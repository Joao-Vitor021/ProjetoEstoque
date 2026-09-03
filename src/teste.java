import java.util.Scanner;

public class teste {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        Estoque e1 = new Estoque();

        e1.adicionaProduto("iphone 16e", 3540, 13);
        e1.adicionaProduto("Samsung Galaxy A17", 1299, 8);
        e1.adicionaProduto("PlayStation 5", 3599, 5);
        e1.adicionaProduto("Notebook Lenovo", 2890, 6);
        e1.adicionaProduto("Mouse Logitech", 150, 20);

        for(int i = 0; i < 3; i++){

            e1.listarEstoque();
            System.out.println("Qual produto vc quer remover pelo id? ");
            int r = entrada.nextInt();

            System.out.println("Qual produto vc quer buscar pelo id? ");
            int b = entrada.nextInt();
            e1.removerId(r);
            e1.buscarId(b);


        }


    }
}
