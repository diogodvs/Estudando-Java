package estudocaso;

public class Conta {
    
	private String cliente;
	private String numeroConta;
	private double saldo;
	private double limiteSaque;
	

	public Conta(String cliente, String numeroConta, double limiteSaque) {
		
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.limiteSaque = limiteSaque;
			
	}
	
	public void Sacar(double valor) {
		
		validarSaque(valor);
		
		saldo -= valor;
	
	}
	
	private void validarSaque(double valor) {
		
		if(getSaldo() - valor < 0) {
			throw new RuntimeException("Saldo Insuficiente");
		}
		
		if(valor > getlimiteSaque()) {
			throw new RuntimeException("A quantia excede o limite de Saque!! ");}
		
		;
	} 	
			
	public void Depositar(double valor) {
		
		saldo += valor;
		
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public double getlimiteSaque() {
		
		return this.limiteSaque;
	}
	
	@Override
	public String toString() {
		return String.format("CLIENTE: %s | CONTA: %s | LIMITE DE SAQUE: R$ %.2f | SALDO R$ %.2f"
				, cliente, numeroConta, limiteSaque, saldo );
		 
	}
	
	
	
}
