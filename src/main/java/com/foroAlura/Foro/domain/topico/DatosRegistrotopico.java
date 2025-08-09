package com.foroAlura.Foro.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistrotopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotBlank String curso
) {
}
