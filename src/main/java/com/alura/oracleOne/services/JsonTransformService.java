package com.alura.oracleOne.services;

public interface JsonTransformService {
    <T> T deserialization(String json, Class<T> typeClass);
}
