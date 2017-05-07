package negocio;

public class Bulto {
	private int codigoBulto;
	private Prenda prenda;
	private int cantidad;
	private Lote lote;

	public void descontarStock(int cantidad) {
		this.cantidad = this.cantidad - cantidad;
		if (this.cantidad < 0){//q no sea negativo...
			cantidad = 0;
			System.out.println("Estas restando mas stock de lo que hay");
		}
	}

	public boolean sosElBulto(int codigo) {
		return this.codigoBulto == codigo;
	}
}
