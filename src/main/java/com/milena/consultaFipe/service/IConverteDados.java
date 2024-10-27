package com.milena.consultaFipe.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface IConverteDados {
    public <T> T obterDados(String json,Class<T> classe) throws JsonProcessingException;
    public <T> List<T> obterLista(String json, Class<T> classe);
}

