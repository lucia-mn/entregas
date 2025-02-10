package contactoEJ1;

public class Contacto {

    //atributos
    private String name;
    private String phoneNumber;

    //constructor
    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //metodos
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

