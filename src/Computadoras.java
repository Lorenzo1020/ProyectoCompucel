
public class Computadoras {
	private String marca;
	private float precio;
	private int stock;
	private String so;

	public Computadoras(String marca, float precio, int stock, String so) {
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
		this.so = so;
	}

	@Override
	public String toString() {
		return "Computadoras [marca=" + marca + ", precio=" + precio + ", stock=" + stock + ", so=" + so + "]\n";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

}
