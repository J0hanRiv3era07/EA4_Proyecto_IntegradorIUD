package ProyectoDescuentos;

public class Bebida extends Producto {
    private String tamano;

    public Bebida(String nombre, double precio, String tamano) {
        super(nombre, precio);
        this.tamano = tamano;
    }

    @Override
    public String getTipo() {
        return "Bebida " + tamano;
    }
}