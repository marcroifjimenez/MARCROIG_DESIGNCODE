package marcroig.designcode;

public class Pedidos {
	private String NumPedido;
	private String FechaPedido;
	private String Productos;
	private int Cantidad;
	private Float PrecioFinal;
	
	private float CalcularPrecio() {
		return PrecioFinal;
	}
}
