/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodoctema4;

/**
 *
 * @author Pedro
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private double salario;
    
    /**
     *
     * @param nombre
     * @param apellido
     * @param salario
     */
    public Empleado(String nombre, String apellido, double salario){
       this.nombre = nombre;
       this.apellido=apellido;
       this.salario=salario;
    
    }
    
    /**
     *
     * @param subida
     */
    public void subidasalario(double subida){
      salario = salario + subida;
    }
    
    private boolean comprobar(){
      if(nombre.equals("")){
        return false; 
     }
      return true;
    }
    
}
