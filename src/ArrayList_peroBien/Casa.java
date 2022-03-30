package ArrayList_peroBien;

public class Casa {

    //atributos

    private int numHabs;
    private int metros2;
    private double precio;
    private String nombreUrb;
    private String propietario;

    //constructores

    public Casa(){}

    public Casa(int numHabs, int metros2, double precio, String nombreUrb, String propietario) {
        this.numHabs = numHabs;
        this.metros2 = metros2;
        this.precio = precio;
        this.nombreUrb = nombreUrb;
        this.propietario = propietario;
    }

    //getter y setter
    public int getNumHabs() {
        return numHabs;
    }

    public void setNumHabs(int numHabs) {
        this.numHabs = numHabs;
    }

    public int getMetros2() {
        return metros2;
    }

    public void setMetros2(int metros2) {
        this.metros2 = metros2;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreUrb() {
        return nombreUrb;
    }

    public void setNombreUrb(String nombreUrb) {
        this.nombreUrb = nombreUrb;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * numHabs
     * metros2
     * precio
     * nombreUrb
     * propietario
     */

    @Override
    public String toString() {
        return String.format("""
                La casa tiene %d metros cuadrados y tiene %d habitaciones.
                Cuesta %d.
                Se encuentra en la urbanización %s.
                El propiietario actual de la casa es %s.
                """, metros2, numHabs, precio, nombreUrb, propietario);
    }
}
