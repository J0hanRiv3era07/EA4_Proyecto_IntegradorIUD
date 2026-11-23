package ProyectoDescuentos;

public class DescuentoVip implements ReglaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        return total * 0.80; // 20% de descuento
    }
}