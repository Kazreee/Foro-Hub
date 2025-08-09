package com.foroAlura.Foro.domain.topico;

import java.time.LocalDateTime;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        Boolean status,
        String curso,
        LocalDateTime fecha_creacion
) {

    public DatosDetalleTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getAutor(),
                topico.getStatus(),
                topico.getCurso(),
                topico.getFecha_creacion()
        );
    }
}
