import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opMenu;
        List <Pelicula> catalogo = new ArrayList<>();
        List<Cliente> cliente = new ArrayList<>();
        List<AlquierPelicula> alquiler = new ArrayList<>(); 

        Pelicula agregarPelicula = null;
        
        while (true) {
            System.out.println("-------Menu--------");
            System.out.println("1.Ingresar pelicula: ");
            System.out.println("2.Modificar pelicula: ");
            System.out.println("3.Eliminar pelicula");
            System.out.println("4.Ingresar cliente:");
            System.out.println("5.Alquilar pelicula: ");
            opMenu = leer.nextInt();

            if (opMenu == 1) {

                System.out.print("---INGRESANDO PELICULA---") ;

                System.out.println("\n Id: ");
                int id = leer.nextInt();

                System.out.println("Titulo: ");
                String titulo = leer.next();

                System.out.println("Genero: ");
                String genero = leer.next();

                System.out.println("Precio Alquiler: ");
                double precio_Alquiler = leer.nextDouble();

                System.out.print("Director: ");
                String director = leer.next();

                System.out.println("Descuento: ");
                double descuento = leer.nextDouble();

                agregarPelicula = new Pelicula(id, titulo, genero, precio_Alquiler, director, descuento);
                catalogo.add(agregarPelicula);

                System.out.println("Pelicula Agregada :D");
            }if(opMenu == 2){
                if (agregarPelicula != null) {
                    int modificar;
                    System.out.println("---------Modificar--------");
                    System.out.println("1.Modificar id: ");
                    System.out.println("2.Modificar titulo: ");
                    System.out.println("3.Modificar genero: ");
                    System.out.println("4.Modificar precio alquiler: ");
                    System.out.println("5.Modificar director: ");
                    System.out.println("6.Modificar descuento: ");
                    modificar = leer.nextInt();
                    switch (modificar) {
                        case 1:
                            System.out.println("Nuevo id: ");
                            int idModificado = leer.nextInt();
                            agregarPelicula.setId(idModificado);
                            break;
                        case 2:
                            System.out.println("Nuevo titulo: ");
                            String tituloModificado = leer.next();
                            agregarPelicula.setTitulo(tituloModificado);
                            break;
                        case 3:
                            System.out.println("Nuevo genero: ");
                            String generoMod = leer.next();
                            agregarPelicula.setGenero(generoMod);
                            break;
                        case 4:
                            System.out.println("Nuevo precio alquiler: ");
                            double precio_AlquilerMod = leer.nextDouble();
                            agregarPelicula.setPrecio_Alquiler(precio_AlquilerMod);
                        case 5:
                            System.out.println("Nuevo director: ");
                            String directorMod = leer.next();
                            agregarPelicula.setDirector(directorMod);
                        case 6:
                            System.out.println("Nuevo descuento");
                            double descuentoMod = leer.nextDouble();
                            agregarPelicula.setDescuento(descuentoMod);
                    }
                }else{
                    System.out.println("No hay peliculas por modificar");
                }
            }if (opMenu == 3) {
                 if (agregarPelicula != null) {
                    System.out.println("----ELIMINANDO PELICULA----");
                    
                 }
            }
            
        }
    }
}
