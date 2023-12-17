package com.ecommerce.backend.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JSONConvert {
    public static String convert(Object object) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            return null;
        }
    }

}
