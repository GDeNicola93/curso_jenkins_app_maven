package com.curso_jenkins.prueba_app_maven.generador_codigo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("codigo")
@AllArgsConstructor
public class CodigoController {

    private final GeneradorCodigo generadorCodigo;

    @GetMapping
    public String generarCodigo(){
        return generadorCodigo.generarCodigo();
    }
}
