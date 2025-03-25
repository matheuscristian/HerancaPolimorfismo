package q04;

import java.util.Vector;

import q04.Sistema.*;

public class Main {
    public static void main(String[] args) {
        Vector<Pagamento> pagamentos = new Vector<>();

        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoDinheiro());
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoDinheiro());
        pagamentos.add(new PagamentoDinheiro());
        pagamentos.add(new PagamentoDinheiro());

        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }
}
