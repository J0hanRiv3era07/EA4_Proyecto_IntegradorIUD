package ProyectoDescuentos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();
    private ReglaDescuento regla;

    public Pedido(ReglaDescuento regla) {
        this.regla = regla;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public double calcularTotalConDescuento() {
        return regla.aplicarDescuento(calcularTotal());
    }
}