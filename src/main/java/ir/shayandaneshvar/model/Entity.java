package ir.shayandaneshvar.model;

import java.io.Serializable;

public abstract class Entity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public Entity setId(Long id) {
        this.id = id;
        return this;
    }
}
