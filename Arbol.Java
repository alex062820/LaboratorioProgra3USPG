/*
* Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
* Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java para editar esta plantilla
*/
paquete  arbol ;


importar  Java . útil _ escáner ;

 árbol de clase  pública {
    Escáner  en = nuevo  Escáner ( Sistema . en );
     FuncionesArbol binaryTree1 = new FuncionesArbol  ( );
     FuncionesArbol binaryTree2 = new FuncionesArbol  ( );
    
    public  static  void  main ( String [] args ) {
        Arbol  imprimir = nuevo  Arbol ();
        imprimir _ menú ();
    }
    
      añadir vacío  público () {
        sistema _ fuera _ println ( "Ingrese elemento para arbol 2:" );
        árbolbinario2 . addNodo ( en . nextInt ());
    }
     
     menú vacío  público (){
        booleano  salir = false ;
         opción int ;
        
        mientras (! salir ){
           
           sistema _ fuera _ println ( "\n" + "1. Insertar un nodo" );
           sistema _ fuera _ println ( "2. Insertar segundo arbol" );
           sistema _ fuera _ println ( "3. Borrar un nodo" );
           sistema _ fuera _ println ( "4. Recorrido en Preorden" );
           sistema _ fuera _ println ( "5. Recorrido en Posorden" );
           sistema _ fuera _ println ( "6. Recorrido en orden" );
           sistema _ fuera _ println ( "7. Obtener la raiz" );
           sistema _ fuera _ println ( "8. Determinar la altura" );
           sistema _ fuera _ println ( "9. Determinar el numero de elementos" );
           sistema _ fuera _ println ( "10. Buscar un nodo" );
           sistema _ fuera _ println ( "11. Comparar igualdad en arboles" );
           sistema _ fuera _ println ( "12. Nivel de orden transversal" );
           sistema _ fuera _ println ( "13. Arbol binario o no binario" );
           sistema _ fuera _ println ( "14. salir" );
           sistema _ fuera _ println ( "Escribe una de las opciones:" );
           opción = en . siguienteInt ();
           
           cambiar ( opción ){
               caso  1 :
                   sistema _ fuera _ println ( "Ingrese elemento para arbol 1:" );
                   árbolbinario1 . addNodo ( en . nextInt ());
                   romper ;
                   
                caso  2 :
                    añadir ();
                    romper ;
              
               caso  3 :
                   sistema _ fuera _ println ( "Ingrese nodo al borrar arbol 1:" );
                   árbolbinario1 . eliminar ( en . nextInt ());
                   romper ;
                   
                caso  4 :
                   sistema _ fuera _ println ( "Recorrido en Preorden" );
                   sistema _ fuera _ println ( "Árbol 1" );
                   árbolbinario1 . preordenar ( árbolbinario1 . raiz );
                   romper ;
                   
                caso  5 :
                   sistema _ fuera _ println ( "Recorrido en PosOrden" );
                   sistema _ fuera _ println ( "Árbol 1" );
                   árbolbinario1 . postorden ( árbolbinario1 . raiz );
                   romper ;
                   
                caso  6 :
                   sistema _ fuera _ println ( "Recorrido en orden" );
                   sistema _ fuera _ println ( "Árbol 1" );
                   árbolbinario1 . inorden ( árbolbinario1 . raiz );
                   romper ;
                   
                caso  7 :
                   sistema _ fuera _ println ( "Obtener la raíz del arbol 1:" + binaryTree1 . obtenerlaRaíz ());
                   romper ;
                   
                caso  8 :
                   sistema _ fuera _ println ( "La altura del arbol 1 es: " + binaryTree1 . altura ( binaryTree1 . raiz ));
                   romper ;
                   
                caso  9 :
                   sistema _ fuera _ println ( "Las hojas del arbol 1 son: " + binaryTree1 . contar ( binaryTree1 . raiz ));
                   romper ;
                   
                caso  10 :
                   sistema _ fuera _ println ( "Buscar nodo:" );
                   if ( binaryTree1 . buscar ( in . nextInt ())== null ){
                       sistema _ fuera _ println ( "Nodo no encontrado" );
                   } más {
                        sistema _ fuera _ println ( "Nodo encontrado" );      
                   }
                   romper ;
                   
                caso  11 :
                   sistema _ fuera _ println ( "Comparar arboles" );
                   sistema _ fuera _ println ( árbolbinario1 . equals ( árbolbinario1 . raiz , árbolbinario2 . raiz ));
                    if (( binaryTree1 . equals ( binaryTree1 . raiz , binaryTree2 . raiz )) == verdadero ) {
                        sistema _ fuera _ println ( "Iguales" );
                    } más {
                        sistema _ fuera _ println ( "Diferentes" );
                    }
                    romper ;
                    
                caso  12 :
                    sistema _ fuera _ println ( "transversal" );
                    árbolbinario1 . levelOrderTree ( binaryTree1 . raiz );
                    romper ;
                    
                caso  13 :
                    if (! binaryTree1 . estavacia ()){
                        if ( binaryTree1 . completo ( binaryTree1 . raiz )){
                            sistema _ fuera _ println ( "Completo" );
                        } más {
                            sistema _ fuera _ println ( "Incompleto" );
                        }
                    
                    }
                    romper ;
                    
                caso  14 :
                   salir = verdadero ;
                   sistema _ fuera _ println ( "Programa terminado" );
                   
                   romper ;
                predeterminado :
                   sistema _ fuera _ println ( "Solo numeros entre 1 y 10" );
    
                
            }
        }
    }
}
