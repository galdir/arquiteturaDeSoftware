package calculaIMC3;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		double altura = 0;
		double peso = 0;
		
		String alturaString=JOptionPane.showInputDialog("Entre com a altura");
		String pesoString=JOptionPane.showInputDialog("Entre com o peso");
		
		JOptionPane.showMessageDialog(null, "A altura é "+alturaString+"e o peso é "+pesoString);
		
		altura=Double.parseDouble(alturaString);
		peso=Double.parseDouble(pesoString);
		 
		CalculaIMC calculadora=new CalculaIMC(altura, peso);
		
		double imc=calculadora.getIMC();
		
		JOptionPane.showMessageDialog(null, "O IMC é "+imc);
		
	}

}
