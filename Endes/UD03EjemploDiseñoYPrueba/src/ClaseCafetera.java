public class ClaseCafetera {
	private int capacidadMaxima;
	private int cantidadActual;

	// Constructor sin parámetros (capacidad máxima de 1000, cantidad inicial 0)
	public ClaseCafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}

	// Constructor con capacidad máxima especificada
	public ClaseCafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
	}

	// Constructor con capacidad máxima y cantidad actual
	public ClaseCafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
	}

	// Getters
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	// Setters
	public void setCapacidadMaxima(int capacidadMaxima) {
		if (capacidadMaxima < this.cantidadActual) {
			this.cantidadActual = capacidadMaxima;
		}
		this.capacidadMaxima = capacidadMaxima;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
	}

	// Método para llenar la cafetera
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}

	// Método para vaciar la cafetera
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}

	// Método para servir una taza
	public void servirTaza(int capacidadTaza) {
		if (cantidadActual < capacidadTaza) {
			cantidadActual = 0;
		} else {
			cantidadActual -= capacidadTaza;
		}
	}
}

//	public void agregarCafe() {
//		
//	}
//	public void llenarCafetera() {
//		
//	}
//	public void vaciarCafetera() {
//		
//	}
