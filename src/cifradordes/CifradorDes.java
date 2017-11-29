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



public class CifradorDes {

	int s_cajas [] = {
			// S1
			14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7,
			0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8,
			4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0,
			15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13,
			// S2
			15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10,
			3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5,
			0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15,
			13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9,
			// S3
			10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8,
			13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1,
			13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7,
			1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12,
			// S4
			7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15,
			13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9,
			10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4,
			3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14,
			// S5
			2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9,
			14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6,
			4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14,
			11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3,
			// S6
			12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11,
			10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8,
			9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6,
			4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13,
			// S7
			4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1,
			13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6,
			1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2,
			6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12,
			// S8
			13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7,
			1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2,
			7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8,
			2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11
			
	};

	
	int matPerClave_1 [] = { 
			57,49,41,33,25,17,9,1,
			58,50,42,34,26,18,10,2,
			59,51,43,35,27,19,11,3,
			60,52,44,36,63,55,47,39,
			31,23,15,7,62,54,46,38,
			30,22,14,6,61,53,45,37,
			29,21,13,5,28,20,12,4
		};
		
	int matPerClave_2 [] = { 
		14,17,11,24,1,5,3,28,
		15,6,21,10,23,19,12,4,
		26,8,16,7,27,20,13,2,
		41,52,31,37,47,55,30,40,
		51,45,33,48,44,49,39,56,
		34,53,46,42,50,36,29,32
	};
	
int matrizRotacionClave []={1,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1};

int matPermutacionInicial []= {
		58,50,42,34,26,18,10,2,
		60,52,44,36,28,20,12,4,
		62,54,46,38,30,22,14,6,
		64,56,48,40,32,24,16,8,
		57,49,41,33,25,17,9,1,
		59,51,43,35,27,19,11,3,
		61,53,45,37,29,21,13,5,
		63,55,47,39,31,23,15,7
};


int matExpansion []={
		32,1,2,3,4,5,4,5,
		6,7,8,9,8,9,10,11,
		12,13,12,13,14,15,16,17,
		16,17,18,19,20,21,20,21,
		22,23,24,25,24,25,26,27,
		28,29,28,29,30,31,32,1
};

int matPermutacionFinal [] = {
		40,8,48,16,56,24,64,32,
		39,7,47,15,55,23,63,31,
		38,6,46,14,54,22,62,30,
		37,5,45,13,53,21,61,29,
		36,4,44,12,52,20,60,28,
		35,3,43,11,51,19,59,27,
		34,2,42,10,50,18,58,26,
		33,1,41,9,49,17,57,25
};

int matPermutacionF []={
		16,7,20,21,29,12,28,17,
		1,15,23,26,5,18,31,10,
		2,8,24,14,32,27,3,9,
		19,13,30,6,22,11,4,25
};
	
	 public  String permutacion(String entrada, int p[],String control){
	       String salida="";
//          System.out.println("entrada permutacion "+entrada+" - "+control);

//          System.out.println("largo permutacion "+entrada.length()+" y el largo de la matriz es: "+p.length);
               //System.out.println(p.length);
	       for(int i=0;i<p.length;i++){
//	       System.out.println(p[i]);
                   salida += entrada.charAt(p[i]-1);
//             System.out.println("salida permutacion en el for "+i+":" +salida+" - "+control);
	           
	       }
	    return salida;
	   }
           
         
         public  String permutacionI(String entrada, int p[],String control){
	       String salida="";
               int x=0;
//          System.out.println("entrada permutacion "+entrada+" - "+control);

//          System.out.println("largo permutacion "+entrada.length()+" y el largo de la matriz es: "+p.length);
//               System.out.println(p.length);
               
                char[] tempCharArray = entrada.toCharArray();
               
	       for(int i=0;i<p.length;i++){
//	       System.out.println(p[i]);
             //      salida += entrada.charAt(p[i]-1);
                             
                tempCharArray[p[i]-1] = entrada.charAt(i); // Donde 'x' es la posición que buscas.
                salida = String.valueOf(tempCharArray);

             
//             System.out.println("salida permutacion en el for "+i+":" +salida+" - "+control);
	           
	       }
//        System.out.println("Largo salida permutacionI: "+salida.length());
	    return salida;
	   }
    public static String hexaBin(String hexa){
        
        String salida="";
        String a []= new String [64];
        String [] textseparado= hexa.split("");//para separar el string
        
     //For apara recorer el mensaje
        for(int i =0 ; i < textseparado.length; i++ ){
        
          int Hex = Integer.parseInt(textseparado[i] , 16); // pasaje de hexa a entero
          String  binary = Integer.toBinaryString(Hex);  // pasaje de inte a binaio
          a[i]=binary;// guardo todos los vlores en un array
         // System.out.println( String.format("%08d",Integer.parseInt(a[i])));
          
          salida+= "0000".substring(0,4-binary.length())+binary;
         
        }
        // mostrar por pantalla
         
        //   System.out.println(a[5]);
    
        
        
    return salida;
    }

	
	public static String asciiABinario (String texto){
	      String letras = texto, n,s="";                                    //se uso para definir el texto
	      int x=0;                                                          //variable en la que vamos a guardar
	      //for para pasar por las letras del total del tamaño del texto
	      for (int i=0; i<letras.length(); i++){                            
	    	  x=letras.charAt(i);                                               //guardamos en x el valor de la letra en la posicion (i)
	    	  n=Integer.toBinaryString(x);                                      //transformamos el valor en binario 
	          s+=String.format("%08d", Integer.parseInt(n));                     //Transformamos el valor binario a string y le damos formato añadiendo 0 necesarios
	          //System.out.println(s);   //con letras.charAt(i) mostramos por pantalla el valor de la letra
	      }
	  	return s;
	   }
	
        public static String binarioAascii (String textoB){
	      String letras = textoB, n,s="";                                    //se uso para definir el texto
                                                    //variable en la que vamos a guardar
	      
        //System.out.println(letras.length());
        // System.exit(0);
	      for (int i=0; i<letras.length(); i=i+8){                            
	    	                                                 //guardamos en x el valor de la letra en la posicion (i)
	    	  n=textoB.substring(i, i+8);
                  //System.out.println(n);

                  char ch = Character.valueOf(((char) Integer.parseInt(n, 2)));
                  //System.out.println(ch);

	          s+=ch;                     //Transformamos el valor binario a string y le damos formato añadiendo 0 necesarios
	          //System.out.println(s);   //con letras.charAt(i) mostramos por pantalla el valor de la letra
	      }
	  	return s;
	   }
        
                
	public static String xor(String num1, String num2){
	        String numEncriptado="";
	        if (num1.length() != num2.length()) {  // no se si corresponde > o =
	            numEncriptado="ERROR";
	        } else{
		        for (int i=0; i<num1.length(); i++){
		            numEncriptado+= ((int)num1.charAt(i)^(int)num2.charAt(i));
		        }
	        }
	        return numEncriptado;
	    }
	
	public static String rotacion(String entrada,int cant, String direccion){
        String salida;
        
        if (direccion!="L"){
        	String auxiliar=entrada.substring(entrada.length()-cant);
        	salida = entrada.substring(0,entrada.length()-cant);
        	salida=auxiliar+salida;
        }else{
        	String auxiliar=entrada.substring(0, cant);
        	salida = entrada.substring(cant);
        	salida=salida+auxiliar;
        }
            
        return salida;
        
    }
    
	public static String rotacion(String entrada,int cant){
        String salida=rotacion(entrada,cant,"L");
        return salida;
    }
     
  public  String [] generaClave(String clave){
	  String [] salida = new String [16];
	  System.out.println("generar clave: "+clave);

          String tempClave = permutacion(clave, matPerClave_1 ,"generaClave1");//revisar
//	  System.out.println(tempClave);
//	  System.out.println("generar clave temp: "+tempClave);

//        System.exit(0);
          
	  String c0 = tempClave.substring(0,28); 
//	  System.out.println("C0: "+c0);
	  String d0 = tempClave.substring(28,56); 
	  String c="", d="";
	  for(int i= 0; i<16; i++){
	  	c= rotacion(c0,matrizRotacionClave[i],"L");
	  	d= rotacion(d0,matrizRotacionClave[i],"L");
	    c0 = c;
	    d0 = d;
	    salida[i]= c+d;
//	    System.out.print("C["+i+"]: "+c0);
//	    System.out.println("   d["+i+"]: "+d0);
	    
	    salida[i] = permutacion(salida[i], matPerClave_2,"matPerClave2");
            
	    System.out.println("   salida["+i+"]: "+salida[i]);
//	    System.exit(0);
	  }
//          System.exit(0);
	  for (int i=0;i<16;i++){
          System.out.println("SubClave "+(i+1)+" :"+salida[i]);    
          }
//          System.exit(0);
	  return salida; 
	  
  }
	
 public String cifrar(String texto, String clave){
	 String salida="";
          /*String aux;
          aux=asciiABinario(clave);
          clave=aux;
          System.out.println(clave+" largo "+clave.length());*/
          clave=asciiABinario(clave);
	 String [] clavesGeneradas = generaClave(clave);
         //System.out.println("indice 0 permutacion inicial: " + matPermutacionInicial[0]);
           
//        System.out.println("Texto en cifrar: "+texto);
         texto=asciiABinario(texto);
         salida = permutacion(texto, matPermutacionInicial,"inicial");
	 System.out.println("cifrar salida: "+salida);

         String l0 = salida.substring(0,32);
	 String r0 = salida.substring(32,64);
//	 System.out.println("r0: "+r0);
//	 System.out.println("l0: "+l0);
	 String r1="", l1="";
	 for (int i = 0; i<16; i++){
		 l1 = r0;
 	     r1 = xor( l0,f(r0,clavesGeneradas[i] ));
 	     r0 = r1;
 	     l0 = l1;
 		 System.out.println("r0||l0["+(i+1)+"]"+r1+ " - " + l1);
	 }
	 System.out.println("R1+L1: "+r1+l1);
	 salida = permutacion(r1.concat(l1),matPermutacionFinal,"final");
	 
	 //System.out.println("cifrar salida: "+salida);
	 return salida;
 
 }
 
 public String desCifrar(String texto, String clave){
    String salida="";
    
    clave=asciiABinario(clave);

//    System.out.println(texto+" - "+texto.length());
//    System.exit(0);
    String [] clavesGeneradas = generaClave(clave);
    salida = permutacionI(texto, matPermutacionFinal,"final");
    //System.out.println("Salida perm inicial descifrar: "+salida);
//   System.exit(0);
    String l0 = salida.substring(0,32);
    String r0 = salida.substring(32,64);
//  System.exit(0);       
       String r1="", l1="";
	 for (int i = 15; i>-1; i--){
		 l1 = r0;
 	     r1 = xor( l0,f(r0,clavesGeneradas[i] ));
 	     r0 = r1;
 	     l0 = l1;
 		 System.out.println("r0||l0["+(i+1)+"]"+r1+ " - " + l1);
	 }   
//         System.exit(0);
         
         	 salida = permutacionI(r1.concat(l1), matPermutacionInicial,"inicial");

      salida=binarioAascii(salida);   
    return salida;

 }
 
 
 String f (String r0, String clave){
	 String salida = "";
	 salida = permutacion(r0, matExpansion,"matexpansion" );
//	 System.out.println("Expansion salida: "+salida);
	 salida = xor(salida, clave);
//	 System.out.println("func F XOR salida: "+salida);
	 String fila, columna;
	 String concat ="";
	 for( int i=0 ; i<8; i++){
		fila = salida.substring(i*6,(i*6)+1)+salida.substring(i*6+5,i*6+6);
		columna = salida.substring(i*6+1, i*6+5);
		int indSCaja = i*64+Integer.parseInt(fila, 2)*16+Integer.parseInt(columna, 2);
	    String temp = Integer.toBinaryString(s_cajas[indSCaja]).toString();
		concat = concat+ "0000".substring(0,4-temp.length())+temp;
	 }
	 
	 salida = permutacion(concat,matPermutacionF,"matpermF");
	 return salida;
 }
 
 
}



	
	

