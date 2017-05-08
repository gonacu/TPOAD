package controladores;

public class Sistema {
	private static Sistema instancia;
	private AdministradorClientes admClientes;
	private AdministradorCompras admCompras;
	private AdministradorStock admStock;
	private AdministradorProduccion admProduccion;
	private AdministradorPedidos admPedidos;
	private Despacho despacho;
	private AdministradorSucursales admSucursales;

	public static Sistema getInstancia() {
		return instancia;

	}

	public AdministradorClientes getAdmClientes() {
		return admClientes;
	}

	public AdministradorCompras getAdmCompras() {
		return admCompras;
	}

	public AdministradorStock getAdmStock() {
		return admStock;
	}

	public AdministradorProduccion getAdmProduccion() {
		return admProduccion;
	}

	public AdministradorPedidos getAdmPedidos() {
		return admPedidos;
	}

	public Despacho getDespacho() {
		return despacho;
	}

	public AdministradorSucursales getAdmSucursales() {
		return admSucursales;
	}

}
