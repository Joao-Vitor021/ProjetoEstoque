public class Estoque {
    public static void main(String[] args) {
        try {
            Produto p = new Produto("NOTEBOOK", 4560.0, -20);
            System.out.println(p);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }


    }
}
