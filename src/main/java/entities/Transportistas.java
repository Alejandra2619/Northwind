package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transportistas")
public class Transportistas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre_empresa;
    private String nombre_transportista;
    private String telefono;

    public Transportistas() {
    }

    public Transportistas(String nombre_empresa, String nombre_transportista, String telefono) {
        super();
        this.nombre_empresa = nombre_empresa;
        this.nombre_transportista = nombre_transportista;
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre_empresa() {
        return nombre_empresa;
    }
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
    public String getNombre_transportista() {
        return nombre_transportista;
    }
    public void setNombre_transportista(String nombre_transportista) {
        this.nombre_transportista = nombre_transportista;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
