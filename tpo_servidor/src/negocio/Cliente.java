package negocio;

import java.util.ArrayList;

import dto.ClienteDTO;
import dto.PedidoClienteDTO;

public class Cliente {
	private int numeroCliente;
	private Factura factura;
	private String direccion;
	private String cuit;
	private CuentaCorriente cuentaCorriente;
	private String nombre;
	private String categoria;
	private String informacionAdicional;
	private Sucursal sucursal;
	private ArrayList<PedidoCliente> pedidosCliente;

	public Cliente(ClienteDTO cliDTO) {
		this.numeroCliente = cliDTO.getNumeroCliente();
		this.factura = new Factura (cliDTO.getFactura());
		this.direccion = cliDTO.getDireccion();
		this.cuit = cliDTO.getCuit();
		this.cuentaCorriente = new CuentaCorriente(cliDTO.getCuentaCorriente());
		this.nombre = cliDTO.getNombre();
		this.categoria = cliDTO.getCategoria();		
		this.informacionAdicional = cliDTO.getInformacionAdicional();
		this.sucursal = new Sucursal(cliDTO.getSucursal());
		//this.pedidosCliente = cliDTO.getPedidosCliente().stream().map(PedidoCliente::new).collect(Collectors.toCollection(ArrayList::new));
		this.pedidosCliente = new ArrayList<>();
		for (PedidoClienteDTO p : cliDTO.getPedidosCliente()){			
			this.pedidosCliente.add(new PedidoCliente (p));
		}
		
	}

	public void agregarPedido(PedidoCliente pedidoCliente) {

	}

	public boolean sosElCliente(int numero) {
		return false;// ----

	}

	public void modificarLimiteCredito(float limite) {
		this.cuentaCorriente.setLimite(limite);
	}	
	
	// TODOS LOS GETTERS Y SETTERS 
	
	
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getInformacionAdicional() {
		return informacionAdicional;
	}

	public void setInformacionAdicional(String informacionAdicional) {
		this.informacionAdicional = informacionAdicional;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public ArrayList<PedidoCliente> getPedidosCliente() {
		return pedidosCliente;
	}

	public void setPedidosCliente(ArrayList<PedidoCliente> pedidosCliente) {
		this.pedidosCliente = pedidosCliente;
	}

	
	
	
}
