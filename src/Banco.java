import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void abrirConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == numeroConta) {
                return c;
            }
        }
        return null;
    }

    public void listarContas() {
        for (Conta c : contas) {
            System.out.println("Conta Nº " + c.getNumeroConta() +
                    ", Titular: " + c.getTitularNome() +
                    ", Saldo: R$" + c.getSaldo());
        }
    }
}
