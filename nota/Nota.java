import java.util.Date;
public class Nota
{
    private String contenido, titulo;
    private Date fecha;
    public Nota(String contenido, String titulo, Date fecha)
    {
      this.contenido=contenido;
      this.titulo=titulo;
      this.fecha=fecha;
    }
    
    public void setcontenido(){
      this.contenido=contenido;
    }
    
    public String getcontenido(String contenido){
    return contenido;
    }
    
    public void settitulo(){
     this.titulo=titulo;
    }
    
    public String gettitulo(String titulo){
    return titulo;
    }
    
    public void setfecha(){
    this.fecha=fecha;
    }
    
    public Date getfecha(Date fecha){
    return fecha;
    } 
}
