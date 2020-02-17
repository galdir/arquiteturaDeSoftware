package calculaIMC3;

public class CalculaIMC {
	
	double peso=0;
	double altura=0;
	
	public CalculaIMC(double altura, double peso) {
		this.altura=altura;
		this.peso=peso;
		
	}
	
	public double getIMC() {
		double imc=0;		
		imc=peso/(Math.pow(altura, 2));
		return imc;
	}

}
