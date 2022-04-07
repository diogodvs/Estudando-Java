package estudocaso;

import javax.swing.JOptionPane;

public class Programa {
    
    public static void main(String[] args) {
		
		// System.out.println("*** SOLUCAO 05 ***");
		
		String nome = JOptionPane.showInputDialog("Nome do Cliente: ");
	
		String numeroConta = JOptionPane.showInputDialog("Numero da conta: ");
			
		String valorLimite = JOptionPane.showInputDialog("Limite da conta:  ");
		double limite = Double.parseDouble(valorLimite.replace(",", "."));
		
		Conta ct = new Conta(nome, numeroConta, limite);
		
		String valorDeposito = JOptionPane.showInputDialog("Deposito Inicial:  ");
		ct.Depositar(Double.parseDouble(valorDeposito.replace(",", ".")));
		
		JOptionPane.showMessageDialog(null, ct.toString());
		
		String valorSaque = JOptionPane.showInputDialog("Informe o Valor do Saque: ");
		
		try {
			ct.Sacar(Double.parseDouble(valorSaque.replace(",", ".")));
			
			String mensagem = String.format("Saque Realizado com Sucesso!! \nNovo Saldo: R$ %.2f\n"
					, ct.getSaldo());
			
			JOptionPane.showInternalMessageDialog(null, mensagem);
		}
		
		catch (RuntimeException e) {
			JOptionPane.showInternalMessageDialog(null, e.getMessage());
			
		}
		
		JOptionPane.showMessageDialog(null, "FIM DA TRANSAÇÃO");
		
	
		
		
			
		
	}

}
