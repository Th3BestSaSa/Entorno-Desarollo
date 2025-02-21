

public class TestTienda {
    public static void main(String[] args) {
        caso1();
        caso2();
        caso3();
        caso4();
        caso5();
        caso6();
        caso7();
        caso8();
        caso9();
        caso10();
    }

    public static void caso1() {
        int cantidad = 5;
        double precioUnitario = 100.0;
        boolean tieneCupon = false;
        double esperado = 500.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 1: Éxito");
        } else {
            System.out.println("Caso 1: Fallo");
        }
    }

    public static void caso2() {
        int cantidad = 20;
        double precioUnitario = 300.0;
        boolean tieneCupon = false;
        double esperado = 5400.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 2: Éxito");
        } else {
            System.out.println("Caso 2: Fallo");
        }
    }

    public static void caso3() {
        int cantidad = 15;
        double precioUnitario = 200.0;
        boolean tieneCupon = true;
        double esperado = 2550.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 3: Éxito");
        } else {
            System.out.println("Caso 3: Fallo");
        }
    }

    public static void caso4() {
        int cantidad = 1;
        double precioUnitario = 50.0;
        boolean tieneCupon = true;
        double esperado = 47.5;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 4: Éxito");
        } else {
            System.out.println("Caso 4: Fallo");
        }
    }

    public static void caso5() {
        int cantidad = 15;
        double precioUnitario = 200.0;
        boolean tieneCupon = true;
        double esperado = 2550.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 5: Éxito");
        } else {
            System.out.println("Caso 5: Fallo");
        }
    }

    public static void caso6() {
        int cantidad = 6;
        double precioUnitario = 150.0;
        boolean tieneCupon = false;
        double esperado = 900.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 6: Éxito");
        } else {
            System.out.println("Caso 6: Fallo");
        }
    }

    public static void caso7() {
        int cantidad = 10;
        double precioUnitario = 20.0;
        boolean tieneCupon = false;
        double esperado = 285.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 7: Éxito");
        } else {
            System.out.println("Caso 7: Fallo");
        }
    }

    public static void caso8() {
        int cantidad = 10;
        double precioUnitario = 200.0;
        boolean tieneCupon = true;
        double esperado = 1710.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 8: Éxito");
        } else {
            System.out.println("Caso 8: Fallo");
        }
    }

    public static void caso9() {
        int cantidad = 1;
        double precioUnitario = 50.0;
        boolean tieneCupon = true;
        double esperado = 47.5;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 9: Éxito");
        } else {
            System.out.println("Caso 9: Fallo");
        }
    }

    public static void caso10() {
        int cantidad = 15;
        double precioUnitario = 200.0;
        boolean tieneCupon = true;
        double esperado = 2550.0;

        double resultado = Tienda.calcularPrecio(cantidad, precioUnitario, tieneCupon);
        if (Math.abs(resultado - esperado) < 0.01) {
            System.out.println("Caso 10: Éxito");
        } else {
            System.out.println("Caso 10: Fallo");
        }
    }
}
