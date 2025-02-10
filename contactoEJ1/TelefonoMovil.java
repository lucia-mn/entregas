package contactoEJ1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TelefonoMovil {

    //atributos
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    //constructor
    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    //metodos
    public boolean addNewContact(Contacto contacto) {
        if (findContact(contacto.getName()) == -1 && validarNombre(contacto.getName()) && validarNumero(contacto.getPhoneNumber())) {
            myContacts.add(contacto);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contacto contactoExistente, Contacto nuevoContacto) {
        int pos = findContact(contactoExistente);
        if (pos >= 0 && findContact(nuevoContacto.getName()) == -1 && validarNombre(nuevoContacto.getName()) && validarNumero(nuevoContacto.getPhoneNumber())) {
            myContacts.set(pos, nuevoContacto);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contacto contacto) {
        int pos = findContact(contacto);
        if (pos >= 0) {
            myContacts.remove(pos);
            return true;
        }
        return false;
    }

    public void borrarContactos() {
        myContacts.clear();
    }

    public int findContact(Contacto contacto) {
        return myContacts.indexOf(contacto);
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contacto queryContact(String name) {
        int pos = findContact(name);
        if (pos >= 0) {
            return myContacts.get(pos);
        }
        return null;
    }

    public Contacto contactoPorNumero(String phoneNumber) {
        for (Contacto contacto : myContacts) {
            if (contacto.getPhoneNumber().equals(phoneNumber)) {
                return contacto;
            }
        }
        return null;
    }

    public int totalContactos() {
        return myContacts.size();
    }

    public void printContacts() {
        if (myContacts.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
            return;
        }
        System.out.println("Lista de contactos:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " " + myContacts.get(i).getPhoneNumber());
        }
    }

    //validaciones
    public static boolean validarNumero(String phone) {
        return phone.matches("\\d{9}");
    }

    public static boolean validarNombre(String name) {
        return name.matches("[a-zA-Z][a-zA-Z ]*");
    }
}
