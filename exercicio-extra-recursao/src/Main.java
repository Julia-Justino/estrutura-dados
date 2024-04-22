public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor(100, 10);

        System.out.println("Teste 1:");
        fornecedor.venda(565);
        System.out.println();

        System.out.println("Teste 2:");
        fornecedor.venda(500);
        System.out.println();

        System.out.println("Teste 3:");
        fornecedor.venda(87);
        System.out.println();

        System.out.println("Teste 4:");
        fornecedor.venda(8);
    }
}