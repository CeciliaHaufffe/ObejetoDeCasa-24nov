/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cecil
 */
public class Sofá {
    String material ;
     String cor; 
     int numassento;
     double largura;
     double  peso;
      
      Sofá ( String  material , String  cor , int numassento , double largura, double peso) {
        this.material = material;
        this.cor = cor;
        this.numassento = numassento;
        this.largura = largura;
        this.peso = peso;
    }


       void  imprimeDadosSofa () {
        System.out.println(" --------- Sofá ---------- " );
         System.out.println ("Material: "  + material);
        System.out.println( "Cor: " + cor);
         System.out.println("Números de Assento: "  + numassento+" lugares");
         System.out.println("Largura: "  + largura+"cm");
        System.out.println ("Peso: " + peso+"kg" );
        
      }
     public String getmaterial (){
         return material;
     }
     
     public void setmaterial (String marca){
         this.material= marca; 
         
     }
      public String getcor (){
         return cor;
     }
     
     public void setcor (String cor){
         this.cor = cor; 
         
     }
      public int getnumassento (){
         return numassento;
     }
     
     public void setnumassento (int polegadas){
         this.numassento= polegadas; 
         
     }
     public double getlargura (){
         return largura ;
     }
     
     public void setlargura (double comprimento ){
         this.largura = comprimento; 
         
     }
      public double getpeso(){
         return peso;
     }
     
     public void setpeso (double resolução){
         this.peso = resolução; 
         
     }

 
}