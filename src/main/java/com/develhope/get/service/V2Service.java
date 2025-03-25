package com.develhope.get.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class V2Service {

    public Map<String, String> saluta(String nome, String provincia) {
        Map<String, String> map = new HashMap<>();

        StringBuilder stringBuilder = new StringBuilder("Ciao ");
        stringBuilder.append(nome);
        stringBuilder.append(", com'è il tempo in ");
        stringBuilder.append(provincia);
        stringBuilder.append("?");

        map.put("nome", nome);
        map.put("provincia", provincia);
        map.put("saluto", stringBuilder.toString());

        return map;
    }
}
