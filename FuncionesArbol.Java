/*
* Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
* Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
*/
paquete  arbol ;

importar  Java . útil _ ListaEnlazada ;
importar  Java . útil _ cola ;

public  class  FuncionesArbol {

    NodoArbol  raiz ;

    public  FuncionesArbol () {
        esto _ raíz = nulo ;
    }

    //insertar un nodo
    public  void  addNodo ( int  dato ) {
        NodoArbol  nuevo = new  NodoArbol ( dato );
        if ( raiz == null ) {
            raíz = nuevo ;
        } más {
            NodoArbol  aux = raiz ;
            NodoÁrbol  padre ;
            mientras ( verdadero ) {
                padre = auxiliar ;
                if ( dato < aux . dato ) {
                    auxiliar = auxiliar . hijoIzquierdo ;
                    si ( auxiliar == nulo ) {
                        padre _ hijoIzquierdo = nuevo ;
                        volver ;
                    }
                } más {
                    auxiliar = auxiliar . hijoDerecho ;
                    si ( auxiliar == nulo ) {
                        padre _ hijoDerecho = nuevo ;
                        volver ;
                    }
                }
            }
        }
    }

    public  booleano  eliminar ( int  dato ) {
        //necesitamos dos punteros
        //de tipo nodo arbol
        NodoArbol  aux = raiz ;
        NodoArbol  padre = raiz ;
        booleano  esHijoIzquierdo = true ;
        while ( aux . dato != dato ) {
            padre = auxiliar ;
            if ( dato < aux . dato ) {
                //tomar izquierda
                esHijoIzquierdo = true ;
                auxiliar = auxiliar . hijoIzquierdo ;
            } más {
                esHijoIzquierdo = false ;
                auxiliar = auxiliar . hijoDerecho ;
            }
            si ( auxiliar == nulo ) {
                devolver  falso ;
            }
        } // fin mientras
        if ( aux . hijoIzquierdo == null
                && auxiliar _ hijoDerecho == null ) {
            //es hoja
            si ( aux == raiz ) {
                raíz = nulo ;
            } else  if ( esHijoIzquierdo ) {
                padre _ hijoIzquierdo = null ;
            } más {
                padre _ hijoDerecho = null ;
            }
        } else  if ( aux . hijoDerecho == null ) {
            si ( aux == raiz ) {
                raíz = aux . hijoIzquierdo ;
            } else  if ( esHijoIzquierdo ) {
                padre _ hijoIzquierdo = aux . hijoIzquierdo ;
            } más {
                padre _ hijoDerecho = aux . hijoIzquierdo ;
            }
        } else  if ( aux . hijoIzquierdo == null ) {
            si ( aux == raiz ) {
                raíz = aux . hijoDerecho ;
            } else  if ( esHijoIzquierdo ) {
                padre _ hijoIzquierdo = aux . hijoDerecho ;
            } más {
                padre _ hijoDerecho = aux . hijoIzquierdo ;
            }
        } más {
            NodoArbol  reemplazo = obtenerNodoReemplazo ( aux );
            si ( aux == raiz ) {
                raíz = reemplazo ;
            } else  if ( esHijoIzquierdo ) {
                padre _ hijoIzquierdo = reemplazo ;
            } más {
                padre _ hijoDerecho = reemplazo ;
            }
            reemplazo _ hijoIzquierdo = aux . hijoIzquierdo ;
        }
        devolver  verdadero ;
    }
    
    public  booleano  estavacia (){
        return  raiz == null ;
    }

    public  NodoArbol  obtenerNodoReemplazo ( NodoArbol  nodoReemplazo ) {
        NodoArbol  reemplazandoPadre = nodoReemplazo ;
        NodoArbol  reemplazo = nodoReemplazo ;

        NodoArbol  aux = nodoReemplazo . hijoDerecho ;

        while ( auxiliar != nulo ) {
            reemplazandoPadre = reemplazo ;
            reemplazo = aux ;
            auxiliar = auxiliar . hijoIzquierdo ;
        }
        if ( reemplazo != nodoReemplazo . hijoDerecho ) {
            Reemplazo de Padre . hijoIzquierdo = reemplazo . hijoDerecho ;
            reemplazo _ hijoDerecho = nodoReemplazo . hijoDerecho ;
        }
        sistema _ fuera _ println ( "El nodo reemplazo es" + reemplazo );
        volver  reemplazo ;
    }

    //Empieza desde el padre
    public  void  preordenar ( NodoArbol  Nodo ) {
        si ( Nodo != nulo ){
            sistema _ fuera _ imprimir ( Nodo . dato + ", " );
            preordenar ( Nodo . ​​hijoIzquierdo );
            preordenar ( Nodo . ​​hijoDerecho );
        }
    }

    // Empieza desde los hijos
    public  void  posorden ( NodoArbol  Nodo ) {
         si ( Nodo != nulo ){
            posorden ( Nodo . ​​hijoIzquierdo );
            postorden ( Nodo . ​​hijoDerecho );
            sistema _ fuera _ imprimir ( Nodo . dato + ", " );

        }
    }

    // Empieza desde los primeros izquierdos desde abajo para arriba
    public  void  inorden ( NodoArbol  Nodo ) {
        si ( Nodo != nulo ){
            inorden ( Nodo . ​​hijo Izquierdo );
            sistema _ fuera _ imprimir ( Nodo . dato + ", " );
            inorden ( Nodo . ​​hijoDerecho );
        }
    }

    public  int  obtenerlaRaíz () {
        volver  raiz . dato ;

    }

    public  int  altura ( NodoArbol  Nodo ) {
        if ( Nodo != null ) {
            return ( 1 + Math . max ( altura ( Nodo . hijoIzquierdo ), altura ( Nodo . hijoDerecho )));
        }
        devolver  0 ;
    }

    public  int  contar ( NodoArbol  Nodo ) {
        if ( Nodo != null ) {
            return ( 1 + contar ( Nodo . hijoIzquierdo ) + contar ( Nodo . hijoDerecho ));
        }
        devolver  0 ;
    }

    public  NodoArbol  buscar ( int  dato ) {
        NodoArbol  aux = raiz ;
        while ( aux . dato != dato ) {
            if ( dato < aux . dato ) {
                auxiliar = auxiliar . hijoIzquierdo ;
            } más {
                auxiliar = auxiliar . hijoDerecho ;
            }
            si ( auxiliar == nulo ) {
                devolver  nulo ;
            }
        }
        volver  auxiliar ;
        
    }
    public  boolean  equals ( NodoArbol  T1 , NodoArbol  T2 ){
        si ( T1 == T2 )
            devolver  verdadero ;
        si ( T1 == nulo && T2 == nulo )
            devolver  falso ;
        si (( T1 ​​== nulo ) || ( T2 == nulo ))
                devolver  falso ;

        if ( T1 . dato != T2 . dato ) {
            if (!( T1 . dato == ( T2 . dato ))) {
                devolver  falso ;
            }

        }
        if (! es igual a ( T1 . hijoIzquierdo , T2 . hijoIzquierdo )) {
            devolver  falso ;
        }

        if (! es igual a ( T1 . hijoDerecho , T2 . hijoDerecho )) {
            devolver  falso ;
        }

        devolver  verdadero ;
    }
    
    public   void  levelOrderTree ( NodoArbol  Nodo ) {
        si ( Nodo == nulo ) {
            volver ;
        }
        Cola < NodoArbol > cola = new  LinkedList < NodoArbol >(); // cola
        cola _ oferta ( Nodo );
        while (! cola . está vacío ()) {

            NodoArbol  raíz = cola . encuesta ();
            // contenido de salida
            sistema _ fuera _ print ( raíz . dato + ", " );
            // subárbol izquierdo
            NodoArbol  izquierda = raíz . hijoIzquierdo ;
            si ( izquierda ! = nulo ) {
                cola _ oferta ( izquierda );
            }
            // derecho subárbol
            NodoArbol  derecha = raíz . hijoDerecho ;
            si ( correcto ! = nulo ) {
                cola _ oferta ( derecha );
            }

        }
    }
    
    public  booleano  completo ( NodoArbol  Nodo ) {
        si ( Nodo == nulo ) {
            devolver  verdadero ;
        } más {
            if ((( Nodo . hijoDerecho == null && Nodo . hijoIzquierdo != null ))
                    || (( Nodo . hijoDerecho != null && Nodo . hijoIzquierdo == null ))) {
                devolver  falso ;
            }
            booleano  m = completo ( Nodo . hijoIzquierdo );
            booleano  n = completo ( Nodo . hijoDerecho );
            retorno ( m && n );
        }

    }

}
