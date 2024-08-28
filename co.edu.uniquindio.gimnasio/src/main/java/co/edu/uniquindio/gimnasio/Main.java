package co.edu.uniquindio.gimnasio;

import co.edu.uniquindio.gimnasio.model.Gimnasio;

public class Main {
    public static void main(String[] args) {
        Gimnasio gimnasio =  new Gimnasio();

        , String nombre, String direccion, String telefono, String correo, String contrasena

        if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
            throw new Exception("no puede haber campos vacíos");
        }
    }
}
