                                                            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp 14
 */
public class tarea2 {
     
    char [] pila;
    Integer tope;
    Integer cont;
    
    public tarea2(Integer tope)
    {
            pila=new char[tope];
        cont=-1;
        this.tope=tope;        
    }
    
    public void push(char dato)
    {
        if(cont<tope-1)
        {
            cont ++;
            pila[cont]=dato;
        }else
        {
            System.out.println("Desbordando");
        }
    }
    public char pop()
    {
        char resultado=' ';
        if(cont>-1)
        {
            resultado=pila[cont];
            
            cont--;
        }else
        {
            System.out.println("Subdesbordamiento"); 
          }
        return resultado;
    }
    public char peek(){
        char resultado=' ';
        if(cont==-1)
        {
            return ' ';
        }else
            return pila[cont];
    }
}

