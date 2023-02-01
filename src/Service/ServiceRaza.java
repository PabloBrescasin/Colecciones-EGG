/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ServiceRaza {
    
    Scanner sc = new Scanner(System.in, "UTF-8").useDelimiter("\n");
    Raza r = new Raza();

    List <Raza> raza = new ArrayList<Raza>();
    
    public Raza ingresarRaza(){
        
        System.out.println("Escriba la raza: ");
        String aux = sc.next();
        
        return new Raza(aux);
    }
    
    public void generaRaza(){
        System.out.println("Cantidad a ingresar de razas: ");
        
        int n=sc.nextInt(), i;
       
        
        for (i = 0; i < n; i++) {
            raza.add(ingresarRaza());
            
        }
    }
            
    public void mostrarRaza(){
        for (Raza aux : raza){
            System.out.println(aux.getRaza());
        }
            
        
    }   
        
    public void eliminarRaza(){
        System.out.println("Ingresar la raza a eliminar");
        Raza r1 = new Raza();
        r1.setRaza(sc.next());
        Raza razaEncontrada=null;
        Iterator<Raza> it = this.raza.iterator();
        while(it.hasNext() && razaEncontrada==null){
            Raza r = it.next();
            if (r.getRaza().equalsIgnoreCase(r1.getRaza())){ 
                razaEncontrada=r;
                raza.remove(r);
            }
        }
    }
}
