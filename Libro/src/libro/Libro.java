/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/*
 * @version 1.0
 * @author Lucia y Toñi
 * @since 4-3-2022

 */
public class Libro {
    private String titulo; //Titulo del libro.
    private String autor; //Autor del libro.
    private int ejemplares; //Número de ejemplares.
    private int prestados; //Número prestado

    //constructor por defecto 
    public Libro() {
    }

    /**
    *constructor con parámetros
    *@param titulo Es el nombre del libro que establecemos mediante una cadena.
    * @param autor Es el nombre del autor del libro que establecemos mediante uan cadena.
    * @param ejemplares El numero de ejemplares que tenemos para prestar.
    * @param prestados El numero de ejemplares que hemos prestado.
    */
    public Libro(String titulo, String autor, int ejemplares, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    /**
     * Obtener el autor del libro.
     *  @return El nombre del autor del libro
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Establecer el nombre del aoutor
     * @param autor Es el escritor del libro
     */

    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Obtener el nuemro de libros que hay paar prestar
     * @return Número de libros
     */

    public int getEjemplares() {
        return ejemplares;
    }
    /**
     * Establece el número de libros que hay parar prestar 
     * @param ejemplares Es el número de libros que hay parar prestar
     */

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    /**
     * Obtener el nuemro de libros prestados
     * @return Número de prestamos
     */

    public int getPrestados() {
        return prestados;
    }
    /**
     * Establece el número de libros que se han prestado
     * @param prestados Es el número de libros que hay prestados
     */

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    /**
     * Obtener el nombre del libro
     * @return Nombre del libro
     */

    public String getTitulo() {
        return titulo;
    }
    /**
     * Establece el nombre del libro
     * @param titulo Es el nombre del libro
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método para realizar el prestamo de un libro 
     * @return True si se ha devuelto o false si no se ha devuelto
     */
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    /**
     * método para realizar la devolución de un libro 
     * @return True si se ha devuelto o false si no se ha devuelto
     */
     
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    /**
     * método toString sobrescrito para mostrar los datos de la clase Libro
     * @return El titulo-Autor-Ejemplares-Prestados; del libro
     */
    
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;                                    
    }
   
}//Fin de la clase Fraccion