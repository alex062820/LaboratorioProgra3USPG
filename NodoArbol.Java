/*
* Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
* Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
*/
paquete  arbol ;

clase  pública NodoArbol {
    int  dato ;
    NodoÁrbol  hijoIzquierdo ;
    NodoÁrbol  hijoDerecho ;
   
    public  NodoArbol ( int  dato ){
        esto _ dato = dato ;
        esto _ hijoIzquierdo = null ;
        esto _ hijoDerecho = null ;
    }

    @ anular
     Cadena  pública a Cadena (){
        return  "su dato es" + esto . dato ;
    }
}
