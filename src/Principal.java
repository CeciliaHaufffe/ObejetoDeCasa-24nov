/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cecil
 */
    public class Principal {
     public  static  void  main ( String [] args ) {

       Televisão televisão = new  Televisão ( "LG" , "Cinza" , 86 , "Smart TV" , "4k fullHD");
        Sofá sofa = new  Sofá ("Algodão" , "Rosa", 4 , 180, 48 );
       
        System.out.println("Obejtos de Casa: ");
      
        televisão.imprimeDadosTelevisão();
        System.out.println();
        sofa.imprimeDadosSofa();
 
     } 
       
}


