import javax.swing.JOptionPane;

public class CALCULADORA {

	private int valor1;
	private int valor2;


	public CALCULADORA(){

	}

	public CALCULADORA(int valor1, int valor2) {

		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public void somar (){
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor1"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor2"));
		System.out.println("a soma eh: " + (valor1 + valor2));
	}

	public void subtrair (){

		System.out.println("a subtração eh: " + (valor1 - valor2));

	}
	public void dividir(){

		System.out.println("a divisão eh: " + (valor1 / valor2));
	}

	public void multiplicar(){

		System.out.println("a multiplicação eh: " + (valor1 * valor2));

	}

}





