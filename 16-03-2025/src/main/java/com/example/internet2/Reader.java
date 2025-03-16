package com.example.internet2;

import java.util.concurrent.atomic.AtomicLong;

public class Reader {
    private static final AtomicLong counter = new AtomicLong();
    private final String name;
    private final long id;

    public Reader(String name) {
        this.id = counter.incrementAndGet();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String format() {
        return String.format("Read with id '%d' and name '%s'", id, name);
    }
}
