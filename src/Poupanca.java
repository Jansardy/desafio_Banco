public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(Cliente titular, int numeroConta, double taxaJuros) {
        super(titular, numeroConta);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }
}