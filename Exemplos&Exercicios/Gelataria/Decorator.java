package Gelataria;

public abstract class Decorator implements Gelado{
    protected Gelado g;

    Decorator(Gelado g) {
        this.g = g;
    }
}
