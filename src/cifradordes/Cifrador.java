/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradordes;

/**
 *
 * @author marcelox
 */

public class Cifrador{
    
    
    public static void main(String[] args){
        
        
        String TextoInicial="ALGO DES";
        String claveInicial="PASS1234";
        
        CifradorDes cDes=new CifradorDes();
        
        String textoFinal=cDes.cifrar(TextoInicial, claveInicial);
        System.out.println("Texto cifrado: "+textoFinal);
        System.out.println();
        
        
        String textoDesCifrado=cDes.desCifrar(textoFinal, claveInicial);
        
        System.out.println("Texto DEScifrado: "+textoDesCifrado);
        System.out.println();

        
    }
    
    
    
}



/*public class Cifrador {
    
    public function String asciiBin(String texto)
    {
        
    }
    public function String hexaBin(String texto){
        
    }
    public function String permutacion(String original,int[] permut){
        
    }
    public function String rotacion(String texto,int cant,String direccion){
        
    }
    
    // Li=Lr - 1
    // Ri=Li-1+f(R0.K1)
    
    public function String xOr(String nr1, String nr2){
        
    }
    public function int binEntero(String texto){
        
    }
    
    public function String enteroBin(int nro){
        
    }
    public function string sCaja(String bloque, int sCaja){
        binEntero
    }
    public function String devolverBloque64(String bloque){
        
    }
    
    
    
    
    
}*/


