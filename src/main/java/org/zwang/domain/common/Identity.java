package org.zwang.domain.common;

public class Identity<T> implements IIdentity {

    private final T valor;

    public Identity(T valor) {
        this.valor = valor;
    }

    public T identity() {
        return valor;
    }
}
