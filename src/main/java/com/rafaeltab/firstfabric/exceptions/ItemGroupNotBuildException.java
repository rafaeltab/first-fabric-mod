package com.rafaeltab.firstfabric.exceptions;

public class ItemGroupNotBuildException extends RuntimeException {
    public ItemGroupNotBuildException(String errorMessage){
        super(errorMessage);
    }
}