package contactoEJ1;

import java.util.Scanner;

public class mainTelefonoMovil {
    private static Scanner scanner = new Scanner(System.in);
    private static TelefonoMovil telefonoMovil = new TelefonoMovil("123456789");

    public static void main(String[] args) {
        boolean continuar = true;
        int opcion;

        imprimirMenu();
        while (continuar) {
            System.out.println("Elige una opción: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Añade un número válido");
                scanner.next();
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    telefonoMovil.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContactoNombre();
                    break;
                case 6:
                    imprimirMenu();
                    break;
                case 7:
                    queryContactoNumero();
                    break;
                case 8:
                    telefonoMovil.borrarContactos();
                    System.out.println("Has borrado todos los contactos");
                    break;
                case 9:
                    System.out.println("Número total de contactos: " + telefonoMovil.totalContactos());
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }



    //menu
    public static void imprimirMenu() {
        System.out.println("Menú: ");
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir contactos");
        System.out.println("2 - Agregar nuevo contacto");
        System.out.println("3 - Actualizar contacto existente");
        System.out.println("4 - Eliminar contacto de la lista");
        System.out.println("5 - Buscar contacto por clave (nombre)");
        System.out.println("6 - Volver a imprimir la lista de opciones");
        System.out.println("7 - Buscar contacto por teléfono");
        System.out.println("8 - Eliminar todos los contactos");
        System.out.println("9 - Mostrar número total de contactos");
    }


    //metodos
    public static void addNewContact() {
        System.out.println("Escribe el nombre: ");
        String name = scanner.nextLine();
        System.out.println("Escribe el número de teléfono: ");
        String phoneNumber = scanner.nextLine();

        if (!TelefonoMovil.validarNumero(phoneNumber) || !TelefonoMovil.validarNombre(name)) {
            System.out.println("El nombre o el número no son válidos");
            return;
        }

        if (telefonoMovil.addNewContact(new Contacto(name, phoneNumber))) {
            System.out.println("Contacto agregado");
        } else {
            System.out.println("El contacto ya existe o está mal");
        }
    }

    public static void updateContact() {
        System.out.println("Nombre del contacto: ");
        String oldName = scanner.nextLine();
        Contacto contactoExistente = telefonoMovil.queryContact(oldName);

        if (contactoExistente == null) {
            System.out.println("No existe");
            return;
        }

        System.out.println("Nuevo nombre: ");
        String newName = scanner.nextLine();
        System.out.println("Nuevo número: ");
        String numTel = scanner.nextLine();

        if (!TelefonoMovil.validarNumero(numTel) || !TelefonoMovil.validarNombre(newName)) {
            System.out.println("El nombre o el número no son válidos");
            return;
        }

        if (telefonoMovil.updateContact(contactoExistente, new Contacto(newName, numTel))) {
            System.out.println("Contacto actualizado");
        } else {
            System.out.println("Error al actualizar");
        }
    }

    public static void removeContact() {
        System.out.println("Nombre del contacto a eliminar: ");
        String name = scanner.nextLine();
        Contacto contactoExistente = telefonoMovil.queryContact(name);

        if (contactoExistente == null) {
            System.out.println("Contacto no encontrado");
            return;
        }

        if (telefonoMovil.removeContact(contactoExistente)) {
            System.out.println("Contacto eliminado");
        } else {
            System.out.println("Error al eliminar el contacto");
        }
    }

    public static void queryContactoNombre() {
        System.out.println("Escribe el nombre del contacto a buscar: ");
        String name = scanner.nextLine();
        Contacto contacto = telefonoMovil.queryContact(name);

        if (contacto != null) {
            System.out.println("Contacto encontrado: " + contacto.getName() + " " + contacto.getPhoneNumber());
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    public static void queryContactoNumero() {
        System.out.println("Escribe el número de teléfono: ");
        String phone = scanner.nextLine();
        Contacto contacto = telefonoMovil.contactoPorNumero(phone);

        if (contacto != null) {
            System.out.println("Contacto encontrado: " + contacto.getName() + " " + contacto.getPhoneNumber());
        } else {
            System.out.println("Contacto no encontrado");
        }
    }
}
