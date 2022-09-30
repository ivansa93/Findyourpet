package com.utp.Findyourpet.Data;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioData {
    
    // Acá van los campos de la tabla Usuarios (los creados en Usuario.java)
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    private Date fecha_registro;
        
}
