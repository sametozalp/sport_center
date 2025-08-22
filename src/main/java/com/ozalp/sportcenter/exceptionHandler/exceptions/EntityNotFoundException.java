package com.ozalp.sportcenter.exceptionHandler.exceptions;

import java.util.UUID;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Class<?> entityClass, UUID id) {
        super(entityClass.getSimpleName() + " not found: " + id);
    }
}
