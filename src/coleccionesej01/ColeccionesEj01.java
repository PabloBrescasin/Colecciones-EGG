/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 *programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 *después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 *salir, se mostrará todos los perros guardados en el ArrayList.
 */
package coleccionesej01;

import Service.ServiceRaza;

/**
 *
 * @author pablo
 */
public class ColeccionesEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceRaza r = new ServiceRaza();
        
        r.generaRaza();
        r.mostrarRaza();
        r.eliminarRaza();
        r.mostrarRaza();
    }
    
}
