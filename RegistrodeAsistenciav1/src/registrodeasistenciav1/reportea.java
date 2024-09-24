
package registrodeasistenciav1;


public class reportea {
    private String id;
    private String nombre;
    private String cargo;
    private String area;
    private String entrada;
    private String salida;
    private String fecha;

    public reportea(String id, String nombre, String cargo, String area, String entrada, String salida, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.area = area;
        this.entrada = entrada;
        this.salida = salida;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
              
}
