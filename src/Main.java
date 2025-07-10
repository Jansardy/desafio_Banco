public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        // Criar clientes
        Cliente cliente1 = new Cliente("Jansen Alexandre", "00009000708", "21000461095");
        Cliente cliente2 = new Cliente("Maria Silva", "12000678900", "21987650021");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Criar contas para os clientes
        ContaBancaria conta1 = new ContaBancaria(cliente1, 1001);
        Poupanca poupanca1 = new Poupanca(cliente2, 2001, 0.01); // 1% juros

        banco.abrirConta(conta1);
        banco.abrirConta(poupanca1);

        // Operações nas contas
        conta1.depositar(500.0);
        conta1.sacar(100.0);

        poupanca1.depositar(1000.0);
        poupanca1.aplicarJuros();

        // Listar todas as contas do banco
        banco.listarContas();
    }
}
