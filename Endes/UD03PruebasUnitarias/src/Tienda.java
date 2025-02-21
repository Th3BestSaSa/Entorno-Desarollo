

public class Tienda {
    public static double calcularPrecio(int cantidad, double precioUnitario, boolean tieneCupon) {
        double descuento = 0;
        if (cantidad >= 10) {
            descuento = 0.10;
        }
        if (tieneCupon) {
            descuento += 0.05;
        }
        double precioFinal = cantidad * precioUnitario * (1 - descuento);
        return precioFinal;
    }
}