package paquete_caja_de_ahorro;

public class CajaDeAhorro {
	private double monto;
	private double interes_actual;
	
	public CajaDeAhorro(double monto_ingresado,double interes_ingresado) {
		this.monto = monto_ingresado;
		this.interes_actual = interes_ingresado;
	}

	public double getMonto() {
		return monto;
	}

	public double getInteres_actual() {
		return interes_actual;
	}
	
	public double obtenerSaldo(int meses) {
		return (this.calcularSaldo(meses));
	}
	
	
	public void depositar(double monto) {
		this.monto += monto;
	}
	
	public void retirar(double monto_ingresado) {
		if (monto_ingresado <= this.monto) {
			this.monto -= monto_ingresado;
		} else {
			System.out.println("No hay suficiente dinero en la cuenta");
		}
	}
	
	private double calcularSaldo(int meses) {
		/*La formula para el cálculo de interes compuesto se realiza de la siguiente forma:
		 * Cf = Ci(1+i)^n
		 * Donde cada variable es:
		 * Cf = capital final
		 * Ci = Capital inicial
		 * i = Tasa de interés
		 * n = Período del ahorro (Tiempo)
		 * Para este caso, la historia sería así:
		 * Saldo Acumulado = Saldo Inicial * (1 + Interés)^Meses
		 */
		return (this.monto*Math.pow(1+this.interes_actual, meses));
	}
}
