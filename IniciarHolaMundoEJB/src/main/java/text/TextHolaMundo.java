/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import beans.HolaMundoEJBRemote;
import javax.naming.*;

/**
java:global/IniciarHolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote
 */
public class TextHolaMundo {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try{
            Context jndi=new InitialContext();
            //Instancia de la interfaz
            HolaMundoEJBRemote holamundoEJB=(HolaMundoEJBRemote) jndi.lookup("java:global/IniciarHolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
            int resultado=holamundoEJB.sumar(7, 12);
            System.out.println("Resultado: " + resultado);
        }catch(NamingException e){
            e.printStackTrace();
        }
    }
}
