package com.utp.Findyourpet.Data;

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

public class MascotaData {
    
    private int id;
    private String nombre;
    private String raza;
    private String tamaño;
    private String genero;
    private String edad;

    // Pendiente lo de la imagen

    private UsuarioData usuario; // Acá lo que va en mayúscula, lleva el "Data"


}
