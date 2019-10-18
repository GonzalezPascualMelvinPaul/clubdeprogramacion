import java.util.*;

public class Busqueda
{
    static Nota s;
    int posicion=0;
    int x=0;
    private Nota[]n=new Nota[100];
    public Busqueda()
    {
        Nota[]n=new Nota[100];
    }
    public int busqueda(String nota, String letra){
    while(x<nota.length())  //En vez de nota aqui tiene que estar un arreglo de nnotas
        posicion=nota.indexOf(letra);
    if(posicion!=-1){
    posicion +=letra.length();
    nota=nota.substring(posicion);
    x=-1;
    }    
    x++;
   return posicion;
}
}
/* Son datos que faltan tengo mas o menos la idea de como hacerlo pero no se como 
 * asi que solo es lo que pude avanzar, y mejor te enseño mi bosquejo de mas o menos 
 * como quiero hacerlo
   */