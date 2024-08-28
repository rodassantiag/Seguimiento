package co.edu.uniquindio.gimnasio.model;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class Gimnasio {

    private ArrayList<Cliente> clientes;
    private ArrayList<Clase> clases;
    private ArrayList<Entrenador> entrenadores;

    public void registroEntrenador(String id, String nombre, String especialidad) throws Exception{

        if (id == null || nombre == null || especialidad == null){
            throw new Exception("no puede haber campos vacios");
        }

        Entrenador entrenador = new Entrenador(id, nombre, especialidad);
        entrenadores.add(entrenador);
    }

    public void registroCliente(String id, String nombre, String direccion, String telefono, String correo, String contrasena) throws Exception{

        if (id.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || contrasena.isEmpty()){
            throw new Exception("no puede haber campos vacios");
        }

        Cliente cliente = new Cliente(id, nombre, direccion, telefono, correo, contrasena);
        clientes.add(cliente);
    }

    public void actualizarCliente(String id, String nombre, String direccion, String telefono, String correo, String contrasena ) throws Exception {

        Cliente cliente = obtenerUsuario(id);
        if (cliente != null){
            cliente.setNombre(nombre);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            cliente.setCorreo(correo);
            cliente.setContrasena(contrasena);

        }else {
            throw new Exception("el usuario no existe");
        }


    }

    public void eliminarUsuario(String id) throws Exception{
        Cliente cliente = obtenerUsuario(id);
        if (cliente != null){
            clientes.remove(cliente);
        }else {
            throw new  Exception("El cliente no existe");
        }
    }

    public Cliente obtenerUsuario(String id){
        for (Cliente cliente : clientes){
            if (cliente.getId().equals(id)){
                return cliente;
            }
        }
        return null;
    }





}
