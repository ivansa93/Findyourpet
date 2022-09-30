/*package com.utp.Findyourpet.Repositories;

public class MascotaRepository {
    
}
*/

package com.utp.Findyourpet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.utp.Findyourpet.Entities.Mascota; // Abajo (en <Usuario, Integer>) le estoy diciendo que voy a heredar, pero no le estoy diciendo de dónde lo voy a heredar. Por eso busco la ruta e importo el paquete de User

@Repository // Utilizar esta anotación por ser un repository

// Necesito crear unas listas, así que le añado el "interface" y "extends JpaRepository"
public interface MascotaRepository extends JpaRepository <Mascota , Integer> {
    
}
