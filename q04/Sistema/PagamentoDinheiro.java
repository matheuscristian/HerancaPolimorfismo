package q04.Sistema;

public class PagamentoDinheiro extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento em dinheiro recebido!");
    }
}
