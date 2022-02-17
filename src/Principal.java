/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Datos alumno n°1: Chien Hwa Chen, VINF012546, DNI 92785287
 * Datos alumno n°2: Milagros Maza, VINF011926, DNI 44064690
 * Datos alumno n°3: Pablo Hidalgo, 
 */
public class Principal {

    public static void main(String[] args) {
        int i, n, elemento;
// Tabla Definida de 15
        int m = 15;
        Hash[] h = new Hash[m];
        for (i = 0; i < m; i++) {
            h[i] = new Hash();
            h[i].estado = 0;
        }
// Insertar elemento
        Hash.insertaHash(h, m, 15);
        Hash.insertaHash(h, m, 130);
        Hash.insertaHash(h, m, 7);
        Hash.insertaHash(h, m, 32);
//Buscando un elemento
        elemento = 7;
        i = Hash.buscaHash(h, m, elemento);
        i = Hash.eliminaHash(h, m, 130);
    }
}
