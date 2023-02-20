/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacioncola;

import java.util.Arrays;

/**
 *
 * @author K02-11
 */
public class colas {

    private int end, cap, size;
    private Object[] arregloCola;

    public colas(int cap) {
        this.cap = cap;
        this.arregloCola = new Object[cap];
        end = -1;
    }

    public void agregarCola(Object dato) {
        end++;
        arregloCola[end] = dato;
        size++;
    }
    public String oferta(Object dato){
        if (Tamaño()>=cap) {
            return null;
        }
        else{
            end++;
            arregloCola[end]=dato;
            size++;
            
        }
        return null;
    }

    public Object sacarCola() {
            Object cola = arregloCola[0];
            for (int i = 0; i < end; i++) {
                arregloCola[i] = arregloCola[i + 1];
            }
            size--;
            end--;
            return cola;             
    }

    public int Tamaño() {
        return size;
    }

    public boolean vaciaCola() {
        return size==0;
    }

    public Object mostrar() {
        return arregloCola[end];
    }
    public boolean contiene(Object dato){
        boolean xd=false;
        for (int i = 0; i < end+1; i++) {
            if(arregloCola[i]==dato){              
                return true;
            }
            else {
                xd= false;
            }
        }
        return xd;
    }
}
