public class Fornecedor {
    private double precoA;
    private double precoB;
    private int qtdA;
    private int qtdB;
    private double troco;

    public Fornecedor(double precoA, double precoB) {
        this.precoA = precoA;
        this.precoB = precoB;
        this.qtdA = 0;
        this.qtdB = 0;
        this.troco = 0;
    }

    public void venda(double valorPago) {
        vendaRecursivo(valorPago);
        System.out.println("Quantidade de produtoA vendidos: " + qtdA);
        System.out.println("Quantidade de produtoB vendidos: " + qtdB);
        System.out.println("Troco: " + troco);
    }

    private void vendaRecursivo(double valorPago) {
        if (valorPago >= precoA) {
            qtdA += (int) (valorPago / precoA);
            valorPago %= precoA;
        }
        if (valorPago >= precoB) {
            qtdB += (int) (valorPago / precoB);
            valorPago %= precoB;
        }
        troco = valorPago;
    }
}