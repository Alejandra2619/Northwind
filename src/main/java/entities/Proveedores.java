package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String empresa_nombre;
    private String nombre_contacto;
    private String telefono_contacto;
    private String direccion_contacto;
    private String email_contacto;

    public Proveedores() {
    }

    public Proveedores(String empresa_nombre, String nombre_contacto, String telefono_contacto, String direccion_contacto,
            String email_contacto) {
                super();
                this.empresa_nombre = empresa_nombre;
                this.nombre_contacto = nombre_contacto;
                this.telefono_contacto = telefono_contacto;
                this.direccion_contacto = direccion_contacto;
                this.email_contacto = email_contacto;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmpresa_nombre() {
        return empresa_nombre;
    }
    public void setEmpresa_nombre(String empresa_nombre) {
        this.empresa_nombre = empresa_nombre;
    }
    public String getNombre_contacto() {
        return nombre_contacto;
    }
    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }
    public String getTelefono_contacto() {
        return telefono_contacto;
    }
    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }
    public String getDireccion_contacto() {
        return direccion_contacto;
    }
    public void setDireccion_contacto(String direccion_contacto) {
        this.direccion_contacto = direccion_contacto;
    }
    public String getEmail_contacto() {
        return email_contacto;
    }
    public void setEmail_contacto(String email_contacto) {
        this.email_contacto = email_contacto;
    }
    
}
