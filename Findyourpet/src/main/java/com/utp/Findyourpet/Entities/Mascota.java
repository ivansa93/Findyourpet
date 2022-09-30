package com.utp.Findyourpet.Entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


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

public class Mascota {

    // Agregar primera columna
    @Id // Anotación para decirle que el Id es la llave primaria en esa tabla
    @Column(nullable = false) // Anotación para que no se permita que el campo sea nulo
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Que sea autoincrementable
    private int id; // Este es el parámetro que le pasé para que el id se vaya a la base de datos

    
    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String raza;
    
    @Column(nullable = false, unique = true)
    private String tamaño;
    
    @Column(nullable = false, unique = true)
    private String genero;

    @Column(nullable = false, unique = true)
    private String edad;

    // Pendiente lo de la imagen

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private Usuario usuario; //Nombre de la tabla en mayúscula y minúscula
    
    
}
