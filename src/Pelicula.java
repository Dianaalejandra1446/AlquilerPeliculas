
public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private double precio_Alquiler;
    private String director;
    private double descuento;

    

    public Pelicula(int id, String titulo, String genero, double precio_Alquiler, String director, double descuento) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.precio_Alquiler = precio_Alquiler;
        this.director = director;
        this.descuento = descuento;
    }
    
    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio_Alquiler() {
        return precio_Alquiler;
    }

    public void setPrecio_Alquiler(double precio_Alquiler) {
        this.precio_Alquiler = precio_Alquiler;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

  
    public double calPrecioConDes() {
        if (descuento > 0) {            
            double calculo = (descuento / 100) * precio_Alquiler;
            return calculo;
        }
        return 0.0; 
    }
    
    
    
}
