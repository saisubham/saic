package com.sudosai.saic;

public class RuntimeError extends Throwable {
    final Token token;

    public RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
