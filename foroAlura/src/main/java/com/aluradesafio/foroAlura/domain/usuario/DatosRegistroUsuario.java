package com.aluradesafio.foroAlura.domain.usuario;

import jakarta.validation.constraints.NotBlank;


public record DatosRegistroUsuario(@NotBlank String user,@NotBlank String contrasena) {
}
