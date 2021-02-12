package com.company;

public class StolenPackageException extends RuntimeException{
    StolenPackageException(){
        super();
    }

    StolenPackageException(String message) {
        super(message);
    }
}
