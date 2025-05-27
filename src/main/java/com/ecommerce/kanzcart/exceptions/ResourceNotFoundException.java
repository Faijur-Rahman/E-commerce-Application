package com.ecommerce.kanzcart.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    String field;
    String fieldName;
    Long fieldId;
    String resourceName;

    public ResourceNotFoundException() {

    }

    public ResourceNotFoundException(String field, String resourceName, String fieldName) {
        super(String.format("%s not found with %s: %s",resourceName,field,fieldName));
        this.field = field;
        this.resourceName = resourceName;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(String resourceName,String field, Long fieldId) {
        super(String.format("%s not found with %s: %d",resourceName,field,fieldId));
        this.field = field;
        this.fieldId = fieldId;
        this.resourceName = resourceName;
    }
}
