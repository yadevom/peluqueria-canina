package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String observaciones, String alergico, String atenEsp, 
            String nombreDueno, String celDueno) {
        
        // Creamos el dueño y asignamos sus valores
        Dueno dueno = new Dueno();
        
        dueno.setNombre(nombreDueno);
        dueno.setCelDueno(celDueno);
        
        // Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        
        masco.setUnDueno(dueno);
        
        // Invocar a la persistencia para que estos datos obtenidos los guarde en BD
        controlPersis.guardar(dueno, masco);
    }
    
}
