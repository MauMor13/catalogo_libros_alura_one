package com.alura.oracleOne.services.impls;
import com.alura.oracleOne.services.JsonTransformService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class JsonTransformImpl implements JsonTransformService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T deserialization(String json, Class<T> typeClass) {
        try {
            return this.objectMapper.readValue(json,typeClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
