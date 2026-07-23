/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carta;

/**
 *
 * @author Holam
 */
public class Carta {
    private String foto;
    private boolean visible;
    private boolean encontrada;
    public Carta(String foto){
        this.foto = foto;
        this.visible= false;
        this.encontrada = false;
    }
    public String getFoto() {
        return foto;
    }

    public boolean isVisible() {
        return visible;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }
    public void mostrar(){
        visible = true;
    }
    public void ocultar(){
        if(!encontrada){
            visible = false;
        }
    }
    public void marcarEncontrada(){
        encontrada=true;
        visible=true;
    }
}
