package com.aluradesafio.foroAlura.domain.topico;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public record DatosDetalleTopico(Long id, String titulo, String mensaje, LocalDate fecha,
                                 Boolean estatus, String autor, String curso) {

    public DatosDetalleTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(),
                topico.getEstatus(), topico.getAutor(), topico.getCurso());
    }
}
