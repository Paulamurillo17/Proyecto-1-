/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import carta.Carta;

/**
 *
 * @author Holam
 */
public class Tablero {
    private Carta[][] cartas;
    private Nivel nivel;
    public Tablero(Nivel nivel){
        this.nivel = nivel;
        cartas = new Carta[nivel.getFilas()][nivel.getcolumnas()];
    }
    public Carta obtenerCartas(int fila, int columna){
        return cartas[fila][columna];
    }
    public void asignarCartas(int fila, int columna, Carta carta){
        cartas[fila][columna]=carta;
    }
    public boolean compararCartas(Carta carta1, Carta carta2){
        return carta1.getFoto().equals(carta2.getFoto());
    }
    
    
}
