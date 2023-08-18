package paquete_caja_de_ahorro;
import java.util.List;
import java.util.ArrayList;

public class Banco {
	private List<CajaDeAhorro> lista_cuentas;
	
	public Banco() {
		this.lista_cuentas = new ArrayList<CajaDeAhorro>();
	}
	
	public void agregarCuenta(CajaDeAhorro cuenta_ingresada)
	{
		this.lista_cuentas.add(cuenta_ingresada);
	}
	
	public void transferir(CajaDeAhorro cuenta_origen,CajaDeAhorro cuenta_destino,float monto_transferido) {
		if ((this.lista_cuentas.contains(cuenta_origen)) && (this.lista_cuentas.contains(cuenta_destino))) {
			cuenta_origen.retirar(monto_transferido);
			cuenta_destino.depositar(monto_transferido);
		}
		else
			System.out.println("Una o ambas cuentas no existen en el sistema");
	}
}
