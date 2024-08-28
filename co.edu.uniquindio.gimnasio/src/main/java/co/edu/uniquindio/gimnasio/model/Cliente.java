package co.edu.uniquindio.gimnasio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Cliente extends Usuario {

    private String direccion, telefono, correo, contrasena;

    private List<Entrenamiento> entrenamientos;

    public Cliente(String id, String nombre, String direccion, String telefono, String correo, String contrasena) {
        super(id, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

}
