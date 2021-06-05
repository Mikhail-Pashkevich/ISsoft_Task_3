package entities.carriages;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
public abstract class Carriage {
    private final String id;
    @Setter
    private Carriage next;

    public Carriage() {
        id = UUID.randomUUID().toString();
        next = null;
    }
}
