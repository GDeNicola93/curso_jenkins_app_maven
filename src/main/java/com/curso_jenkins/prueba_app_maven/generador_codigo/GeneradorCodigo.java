package com.curso_jenkins.prueba_app_maven.generador_codigo;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GeneradorCodigo {

    public String generarCodigo(){
        return UUID.randomUUID().toString();
    }
}
