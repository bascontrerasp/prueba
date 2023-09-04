/**
 *
 * @author bastian
 */
public class Plan {
    private int numero;
    private String descripcion, duración;
    private int precio, minutos;
    private Cliente cliente;

    public Plan() {
    }

    public Plan(int numero, String descripcion, String duración, int precio, int minutos, Cliente cliente) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.duración = duración;
        this.precio = precio;
        this.minutos = minutos;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Plan{" + "numero=" + numero + ", descripcion=" + descripcion + ", duraci\u00f3n=" + duración + ", precio=" + precio + ", minutos=" + minutos + ", cliente=" + cliente + '}';
    }
    
    public void  ochoDigitos() {
        if (this.numero < 10000000 || (this.numero > 99999999)) {
        System.out.println("El numero debe tener 8 digitos.");
        }}
        
    public void seisMil() {
        if (this.precio < 6990) {
            System.out.println("El precio debe ser mayor a $6990");
        }

    }}
    
    

