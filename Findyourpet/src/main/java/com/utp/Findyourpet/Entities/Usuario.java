package com.utp.Findyourpet.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Importo estas anotaciones
@Entity // Esta anotación la uso porque esto es una entidad
@Getter // Esta anotiación genera los métodos getter que siempre se usan. 
@Setter // Esta anotiación genera los métodos setter que siempre se usan.
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
    
    // Agregar primera columna
    @Id // Anotación para decirle que el Id es la llave primaria en esa tabla
    @Column(nullable = false) // Anotación para que no se permita que el campo sea nulo
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Que sea autoincrementable
    private int id; // Este es el parámetro que le pasé para que el id se vaya a la base de datos

    // Agregar otra columna
    @Column(nullable = false, unique = true)
    private String nombre;

    // Agregar otra columna
    @Column(nullable = false, unique = true)
    private String apellido;

    // Agregar la columna del mail
    @Column(nullable = false, unique = true)
    private String email;

    // Agregar la columna del password
    @Getter(value = AccessLevel.NONE)
    @Column(nullable = false)
    private String contraseña;

    // Para chequear el password
    public boolean checkPassword(String contraseña){
        return this.contraseña.equals(contraseña);
    }

    // Agregar la columna para fecha de registro
    @Column(nullable = false)
    private Date fecha_registro;
}
