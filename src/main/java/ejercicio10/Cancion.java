/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author reduan
 */
public class Cancion {
    
    private String titulo;
    private String autor;
    
    public Cancion(){
        
        titulo = "";
        autor = "";
        
    }
    
    public Cancion(String titulo, String autor){
        
        this.titulo = titulo;
        this.autor = autor;
        
    }
    
    public String getAutor(){
        
        return autor;
        
    }
    
    public void setAutor(String autor){
        
        this.autor = autor;
        
    }
    
    public String getTitulo(){
        
        return titulo;
        
    }
    
    public void setTitulo(String titulo){
        
        this.titulo = titulo;
        
    }
}
