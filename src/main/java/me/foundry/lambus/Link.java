package me.foundry.lambus;

import java.io.Serializable;

/**
 * Created by Mark on 1/24/2016.
 */
@FunctionalInterface
public interface Link<T extends Event> extends Serializable {
    void invoke(T event);
}
