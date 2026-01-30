package com.json.basics;

import java.io.InputStream;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class EmailValidation {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Load JSON schema from resources
        InputStream schemaStream = EmailValidation.class
                .getClassLoader()
                .getResourceAsStream("docs/json/userschema.json");

        if (schemaStream == null) {
            throw new RuntimeException("userschema.json not found in resources");
        }

        JsonSchema schema = JsonSchemaFactory
                .getInstance(SpecVersion.VersionFlag.V202012)
                .getSchema(schemaStream);

        // Sample JSON to validate
        JsonNode jsonData = mapper.readTree(
                "{\"email\":\"pranshi@example.com\"}"
        );

        Set<ValidationMessage> errors = schema.validate(jsonData);

        if (errors.isEmpty()) {
            System.out.println("✅ Email is valid");
        } else {
            errors.forEach(e -> System.out.println("❌ " + e.getMessage()));
        }
    }
}
