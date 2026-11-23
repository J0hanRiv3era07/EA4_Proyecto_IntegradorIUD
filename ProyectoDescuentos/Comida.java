package ProyectoDescuentos;

public class Comida extends Producto {
    private int porciones;

    public Comida(String nombre, double precio, int porciones) {
        super(nombre, precio);
        this.porciones = porciones;
    }

    @Override
    public String getTipo() {
        return "Comida de " + porciones + " porciones";
    }
}
