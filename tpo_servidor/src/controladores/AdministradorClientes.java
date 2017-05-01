package controladores;

import java.util.ArrayList;

import dto.ClienteDTO;
import negocio.Cliente;
import negocio.CuentaCorriente;
import negocio.Factura;

public class AdministradorClientes {
	private ArrayList<Cliente> clientes;

	public void agregarCliente(ClienteDTO cliDTO) {
		Cliente cli = new Cliente(cliDTO);
		clientes.add(cli);
	}

	public void bajaCliente(int numero) {	
		for (Cliente c : clientes){
			if (c.sosElCliente(numero)) {
				clientes.remove(c);
				return; //revisar si esta bien poner estos return aca...
			}
		}
	}

	public void modificarCliente(int numeroCliente, float limite) { 
		for (Cliente c: clientes){
			if (c.sosElCliente(numeroCliente)){
				c.modificarLimiteCredito (limite);
				return;
			}	
		}

	}

	private Cliente buscarCliente(int numeroCliente) {
		for (Cliente c: clientes){
			if (c.sosElCliente(numeroCliente)){
				return c;
			}	
		}
		return null;

	}
}
