public class TelefonoMovil extends Articulo{
    int capacidad;
    int resolucion;

    public TelefonoMovil(){}
    public TelefonoMovil(int capacidad, int procesador, String nombre,String modelo, String descripcion, double precio){
        super(nombre, modelo, descripcion, precio);
        this.capacidad = capacidad;
        this.resolucion = procesador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setResolucion(int resolucion) {
        this.capacidad = resolucion;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucionr(int resolucion) {
        this.resolucion = resolucion;
    }
}
