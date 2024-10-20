package com.team8.team_management_service.exception;

import jakarta.persistence.EntityNotFoundException;

public class EntityNotFoundByNameException extends EntityNotFoundException {

    private final Class<?> entityClass;
    private final String name;

    public EntityNotFoundByNameException(Class<?> tClass, String name) {
        super("Could not find " + tClass.getSimpleName() + " with name \"" + name + "\"");
        this.entityClass = tClass;
        this.name = name;
    }

    public Class<?> getEntityClass() {
        return entityClass;
    }

    public String getName() {
        return name;
    }
}