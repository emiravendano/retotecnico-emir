package model;

public abstract class AnimalBase implements Animal {
    protected String nombre;
    protected TipoAnimal tipo;
    protected String sonido;

    public AnimalBase(String nombre, TipoAnimal tipo, String sonido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sonido = sonido;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public TipoAnimal getTipo() {
        return tipo;
    }

    @Override
    public String hacerSonido() {
        return sonido;
    }

    @Override
    public String toString() {
        return nombre + " - " + tipo + " - Sonido: " + hacerSonido();
    }


}
