package buscaminas;

import java.awt.Color;
import javax.swing.JButton;

public class Cuadro extends JButton {
    
    public boolean mina;//La casilla sera verdadera si hay una mina,es falsa si no hay mina
    
    public Cuadro(){//Constructor
        
        super();// para que se ejecute el JButton
        double random = Math.random();
        /*Definir de manera aleatorea un valor entre 0 y 1 para definir probabilidad de que salga o no una mina*/
         if(random>0.7)
            mina=true;//Esta minado
            else
            mina=false;//No esta minado
        }
        
    public boolean estaMinado(){
        return mina;  //Regresa el valor de mina      
    }

    boolean mina() {
        return mina;
    }
}