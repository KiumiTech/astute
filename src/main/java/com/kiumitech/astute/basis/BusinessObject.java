package com.kiumitech.astute.basis;

public abstract class BusinessObject<K> {

    public abstract K getId();

    public boolean isTransient() {
        return this.getId() == null;
    }
}
