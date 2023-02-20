/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementacioncola;

/**
 *
 * @author luisi
 */
public class aleatorios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        colas cola=new colas(100);
        for (int i = 0; i < 10; i++) {
            int num=(int)(Math.random()*10+1);
            if(cola.contiene(num)){
                i--;
            }
            else{               
            cola.agregarCola(num);
            System.out.println(cola.mostrar());
            }           
        }
    }
    
}
