import Interface.IConta;

public abstract class Conta implements IConta {
    protected Cliente titular;
    protected int numeroConta;
    protected double saldo;

    public Conta(Cliente titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public int getNumeroConta() {
        return numeroConta;
    }

    @Override
    public String getTitularNome() {
        return titular.getNome();
    }
}