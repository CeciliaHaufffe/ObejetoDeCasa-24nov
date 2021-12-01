/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cecil
 */
public class Televisão {
     String marca;
     String cor; 
     int polegadas;
     String tipo;
     String  resolução;
      
      Televisão ( String  marca , String  cor , int polegadas , String tipo, String resolução) {
        this.marca = marca;
        this.cor = cor;
        this.polegadas = polegadas;
        this.tipo = tipo;
        this.resolução = resolução;
      }
     
     
      void  imprimeDadosTelevisão () {
        System.out.println(" --------- Televisão ---------- " );
         System.out.println ("Marca: "  + marca);
        System.out.println("Cor: " + cor);
         System.out.println("Polegadas: "  + polegadas);
         System.out.println("Tipo: "  + tipo);
        System.out.println ( "Resolução: " + resolução );
        
      }
     public String getmarca (){
         return marca;
     }
     
     public void setmarca (String marca){
         this.marca= marca; 
         
     }
      public String getcor (){
         return cor;
     }
     
     public void setcor (String cor){
         this.cor = cor; 
         
     }
      public int getpolegadas (){
         return polegadas;
     }
     
     public void setpolegadas (int polegadas){
         this.polegadas= polegadas; 
         
     }
     public String gettipo(){
         return tipo ;
     }
     
     public void settipo (String tipo ){
         this.tipo = tipo; 
         
     }
      public String getresolução(){
         return resolução;
     }
     
     public void setresolução (String resolução){
         this.resolução = resolução; 
         
     }
}
