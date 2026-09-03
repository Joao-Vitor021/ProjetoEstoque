public class Estoque {
    public static void main(String[] args) {
        try {
            Produto p = new Produto("IPHONE", 4000, 0);
            System.out.println(p);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }


    }
}
