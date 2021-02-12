package com.company;

public class IllegalPackageException extends RuntimeException{
    IllegalPackageException(){
        super();
    }

    IllegalPackageException(String message) {
        super(message);
    }
}
