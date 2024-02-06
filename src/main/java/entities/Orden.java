package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fecha;
    private String envio;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleados empleado;

    @ManyToOne
    @JoinColumn(name = "id_transportista")
    private Transportistas transportista;

    
    public Orden() {
    }
    
    public Orden(String fecha, String envio, Clientes cliente, Empleados empleado, Transportistas transportista) {
        super();
        this.fecha = fecha;
        this.envio = envio;
        this.cliente = cliente;
        this.empleado = empleado;
        this.transportista = transportista;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getEnvio() {
        return envio;
    }
    public void setEnvio(String envio) {
        this.envio = envio;
    }
    public Clientes getCliente() {
        return cliente;
    }
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    public Empleados getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }
    public Transportistas getTransportista() {
        return transportista;
    }
    public void setTransportista(Transportistas transportista) {
        this.transportista = transportista;
    }
    
    
}
