package co.unicauca.microkernel.common.entities;

/**
 * Envio
 * @author Libardo, Julio
 */
public class Delivery {

    private Product product;
    private double distance;
    private String direccion;
    private String Ciudad;
    private double costo;
    /**
     * Código del país donde será entregado el producto.
     * */
    private String countryCode;

    public Delivery(Product product, double distance, String countryCode,String varDireccion,String varCiudad,double costo) {
        this.product = product;
        this.distance = distance;
        this.countryCode = countryCode;
        this.direccion = varDireccion;
        this.costo = costo;
        this.Ciudad = varCiudad;
    }
    
    public Delivery(Product product, double distance, String countryCode) {
        this.product = product;
        this.distance = distance;
        this.countryCode = countryCode;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String varCiudad) {
        this.Ciudad = varCiudad;
    }
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
