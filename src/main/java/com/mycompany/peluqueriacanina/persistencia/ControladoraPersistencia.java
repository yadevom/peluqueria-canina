package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Dueno dueno, Mascota masco) {
        
        // Primero dueño se creara en BD para asociar luego a la mascota
        duenoJpa.create(dueno);
        
        // Crear en BD la mascota
        mascoJpa.create(masco);
    }
    
}
