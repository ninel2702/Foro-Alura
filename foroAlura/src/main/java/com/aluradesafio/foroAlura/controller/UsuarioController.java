package com.aluradesafio.foroAlura.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.aluradesafio.foroAlura.domain.usuario.DatosRegistroUsuario;
import com.aluradesafio.foroAlura.domain.usuario.Usuario;
import com.aluradesafio.foroAlura.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;


    @Transactional
    @PostMapping
    public ResponseEntity crearUsuario(@RequestBody @Valid DatosRegistroUsuario datos, UriComponentsBuilder uriComponentsBuilder){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        // Encripta la contraseña que viene en texto plano
        String contrasenaEncriptada = encoder.encode(datos.contrasena());

        // Crea el usuario con la contraseña encriptada
        var usuario = new Usuario(datos.user(), contrasenaEncriptada);

        repository.save(usuario);

        var uri = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

}
