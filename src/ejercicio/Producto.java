package ejercicio;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto p) {
        if (this.precio < p.precio) {
            return -1;
        } else if (this.precio > p.precio) {
            return 1;
        } else {
            return 0;
        }
    }

}
