package com.bluefashion.c2cbluefashionbitirmeprojesi.core.utilites.result;

public class SucessResult extends Result {
    public SucessResult() {
        super(true);
    }

    public SucessResult( String message) {
        super(true, message);
    }
}
