package com.develhope.get.controller;

import com.develhope.get.service.V2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v2")
public class V2Controller {

    @Autowired
    private V2Service v2Service;

    @GetMapping("/ciao/{provincia}")
    public ResponseEntity<Map<String, String>> saluta(
                @PathVariable String provincia,
                @RequestParam String nome
    ) {
            Map<String, String> saluto = v2Service.saluta(nome, provincia);
            return ResponseEntity.ok(saluto);
    }
}
