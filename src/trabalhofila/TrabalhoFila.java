/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofila;
import Fila.*;
import No.*;
import Solicitaçao.*;



/**
 *
 * @author adria
 */
public class TrabalhoFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
             
         try{
             
             
         Scanner entrada=new Scanner(System.in);
                int opcao = 0;
                String i;
                int oq;
             
                  Fila<Solicitaçao>normal= new Fila();
                  Fila<Solicitaçao>comum= new Fila();
                  Fila <Solicitaçao>urgente= new Fila();
                  
             do{
                 
                              
                   System.out.println("1- Entrar na fila 2-Triagem das filas  3-Atendimento"
                           + " 4-Sair");
                   opcao=entrada.nextInt();
                        

                 switch(opcao)
                 {
                     case 1:
                     System.out.println("Digite o nome:");    
                     i=entrada.next();
                     System.out.println("1-Comum 2-Urgente ?");
                     oq=entrada.nextInt();
                     System.out.println("\n");
                     
                     Solicitaçao soli= new Solicitaçao(i,oq);
                     normal.insiraNaFila(soli);
                     System.out.println(normal);
                     break;
                     
                     
                     case 2:
                    
                     
                      for(;;) {
                      Solicitaçao p=normal.remove();
                       
                      if(p.oque==1 ){
             
                     comum.insiraNaFila(p);
                      
                     System.out.println(comum);
                     }
                      
                     else
                       if(p.oque==2)
                       urgente.insiraNaFila(p);
                       System.out.println(urgente);
                      
                      }
                    
                     
                    
               
                    
                     case 3:
                         
                            do{
                            urgente.removeMais();/*removendo tres do urgente*/
                            comum.remove();/*removendo um do comum*/
                            
                            System.out.println(comum);
                            System.out.println(urgente);
                            }while(urgente!=null);
                            
                           
                        
                     
                   
                            
              
                     case 4:
                         break;
                         
                         
                     default:
                         System.out.println("Escolha as opções de 1 há 4");
                 }
                 
                 
                 
             }while(opcao!=4);
             
            
             
             
         }catch(Exception e){};
    

    }
    }
    

