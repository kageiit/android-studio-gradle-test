package com.studio.limitary;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Value {

    static public Value create(String name, int age) {
        return new AutoValue_Value(name, age);
    }

    public abstract String name();
    public abstract int age();
}
