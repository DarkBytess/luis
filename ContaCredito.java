public class ContaCredito extends ContaBancaria{
    public void sacar(double valor){
        if (valor > 0){
            double saldoAtual = this.getSaldo();
            saldoAtual -= valor;
            this.setSaldo(saldoAtual);
            System.out.println("Valor " +  valor + " foi sacado. Saldo total atual: " + this.getSaldo());
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
}
