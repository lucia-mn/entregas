class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hablar() {
        System.out.println( nombre+ " dice: ....");
    }

}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hablar() {
        System.out.println( nombre+ " dice: Miaaauuuuuu....");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hablar() {
        System.out.println( nombre+ " dice: Guuuaaaaaaauuuuu.....");
    }
}

class Persona extends Animal {
    public Persona(String nombre) {
        super(nombre);
    }

    @Override
    public void hablar() {
        System.out.println( nombre+ " dice: Blablablabla....");
    }
}
