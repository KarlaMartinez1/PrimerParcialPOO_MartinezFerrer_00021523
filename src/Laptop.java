public class Laptop extends Articulo{
    double RAM;
    String fabricante;

    public Laptop(){}
    public Laptop(double RAM, String fabricante,String nombre,String modelo, String descripcion, double precio){
        super(nombre, modelo, descripcion, precio);
        this.RAM = RAM;
        this.fabricante = fabricante;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public class ObtenerPrecio(int Precio){

    }
}
