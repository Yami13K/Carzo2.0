package com.example.carticketing;

public class ViolationType {

    private final int id;
    private final String type;
    private final String description;

    public ViolationType(int id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
