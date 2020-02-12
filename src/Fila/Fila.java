/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;
import No.*;


/**
 *
 * @author adria
 */
public class Fila<X>  {
    
   
    
  
    No primeiro, aux,ultimo;
    public void insiraNaFila(X i) throws Exception
    {
        
        if(i==null)
            throw new Exception("Informação Ausente");
        
        No tmp;
        
         tmp=new No(i);         
          if(primeiro==null)
          {
              
              ultimo=tmp;
              primeiro=tmp;
          }
              else
          {
            ultimo.setProx(tmp);
            ultimo=ultimo.getProx();
          }
          
     
    }
    
    /**
     *
     * @return
     */
    public X remove() 
    {
       
      X aux=(X) primeiro.info;
        if(primeiro==ultimo)
        {
            ultimo=null;
            primeiro=null;
        }
        else
        {
        
      
         No anterior;
             
           anterior=primeiro;
        
         anterior=null;    
        primeiro=primeiro.prox;
        }
        
       
        
      return (X)  aux;
     
        
    }
    
    public void removeMais()/*remove tres elementos ao mesmo tempo*/
    {
        No ant;
        
         ant=primeiro.prox.prox;
         
         primeiro=ant.prox;
         
         ant=null;
         
         
    }
    
            
       
    
     public String toString()
      {
                    String ret="{";
                    
                    No atual=this.primeiro;
                    
                    while(atual!=null)
                    {
                        ret=ret+atual.getInfo()+" ";
                       
                        if(atual!=this.ultimo);
                         ret=ret +  ",";
                         
                         atual=atual.getProx();
                            
                    }
                    return ret+" } ";
                }
    