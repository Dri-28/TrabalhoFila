/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solicitaçao;

import No.*;
import Fila.*;

/**
 *
 * @author adria
 */
public class Solicitaçao {/* classe que guarda a informação na fila*/
    
    public String nome;
    public int oque;
   
   
    
    public Solicitaçao(String valor,int oq)
    {
        nome=valor;
        oque=oq;
          
    }
    
    public Solicitaçao()
    {
        
    }
    
   /* public Solicitaçao getSolici()
    {
        return this.solicitaçao;
    }*/
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getOquee()
    {
        return this.oque;
    }
    
    public void setNome(String n)
    {
        this.nome=n;
    }
    
    public void setOquee(int x)/* recebe o numero 1 comum 2 urgente*/
    {
        this.oque=x;
    }
    
  
 
    
 
    

    
    public  String toString()
    {
        return  this.nome + " SENHA : " +this.oque;
        
    }
    
   
}

