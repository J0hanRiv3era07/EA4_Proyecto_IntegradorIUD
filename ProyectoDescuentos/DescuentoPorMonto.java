package ProyectoDescuentos;

public class DescuentoPorMonto implements ReglaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        if (total > 10) {
            return total * 0.85; // 15% de descuento
        }
        return total;
    }
}