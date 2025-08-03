package com.aluradesafio.foroAlura.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity (name = "Topico")
@Table (name = "topicos")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDate fecha;
    private Boolean estatus;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datos) {
        this.id = null;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.fecha = LocalDate.now();
        this.estatus = true;
        this.autor = datos.autor();
        this.curso = datos.curso();

    }

    public void actualizarTopicos(@Valid DatosActualizacionTopico datos){
        if (datos.titulo() !=null){
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() !=null){
            this.mensaje = datos.mensaje();
        }
        if (datos.autor() !=null){
            this.autor = datos.autor();
        }
        if (datos.curso() !=null){
            this.curso = datos.curso();
        }
    }

    public void eliminarTopico(){
        this.estatus=false;
    }
}
