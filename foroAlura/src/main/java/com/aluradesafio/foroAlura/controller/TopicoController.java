package com.aluradesafio.foroAlura.controller;

import com.aluradesafio.foroAlura.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @Transactional
    @PostMapping
    public ResponseEntity registrar(@RequestBody @Valid DatosRegistroTopico datos,UriComponentsBuilder uriComponentsBuilder){
       var topico = new Topico(datos);
        repository.save(topico);

        var uri= uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(new DatosDetalleTopico(topico));

    }

    @GetMapping
    public ResponseEntity<Page<DatosDetalleTopico>> listado(@PageableDefault(size=10,sort={"curso"}) Pageable paginacion){
        var topico = repository.findAll(paginacion).map(DatosDetalleTopico::new);
        return ResponseEntity.ok(topico);
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id){
      var topico = repository.getReferenceById(id);
        return ResponseEntity.ok(new DatosDetalleTopico(topico));
    }

    @Transactional
    @PutMapping("/{id}")
    public ResponseEntity actualizar(@PathVariable Long id,@RequestBody @Valid DatosActualizacionTopico datos){
        var topico = repository.getReferenceById(id);
        topico.actualizarTopicos(datos);
        return ResponseEntity.ok(new DatosDetalleTopico(topico));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity eliminar(@PathVariable Long id){
        var topico= repository.getReferenceById(id);
        topico.eliminarTopico();
        return  ResponseEntity.noContent().build();
    }

}
