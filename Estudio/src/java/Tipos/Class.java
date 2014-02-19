/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

/**
 *
 * @author Oscar
 */
public class Class extends Abstract implements Interface{
    
    public Class(){
        System.out.println("Super"+metodo());
    }
    
    public static void main(String[] args) {
        Class clase = new Class();
        System.out.println("metodo Main corrio");
    }



    @Override
    public void texto() {
    }
    
    @Override
    public void metodoInterface() {
    }
   
    
}
