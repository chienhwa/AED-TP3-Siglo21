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
public class Hash {

    int dato;
    int estado; //0 = Vacío, 1 = Eliminado, 2 = Ocupado

    static int FuncionHash(int n, int m) {
//n es el valor original
//m es el tamaño de la tabla
// y debe devolver una posición int dentro del tamaño m
        return (n % m);
    }

    static void insertaHash(Hash[] h, int m, int n) {
        boolean i = false;
        int j = FuncionHash(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].estado = 2;
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            System.out.print("Elemento insertado con Éxito! \n");
        } else {
            System.out.print("Tabla llena!!! \n");
        }
    }

    static int buscaHash(Hash[] h, int m, int n) {
//h es la tabla hash
//m es el tamaño de la tabla
//n es el valor buscado
// devuelve la posición que contiene el valor n encontrado, -1 si no es encuentrado
        int j = FuncionHash(n, m);
        while (j < m) {
            switch (h[j].estado) {
                case 0: // vacío
                    return -1; // no se encontró
                case 1: // eliminado
                    j++; // seguimos buscando
                    break;
                case 2: // ocupado
                    if (h[j].dato == n) return j; // valor encontrado
                    else j++; // no encontrado, sigo buscando
                    break;
            }
        }
        return -1; // si llega acá es porque no encontró
    } // cierre método buscaHash

    static int eliminaHash(Hash[] h, int m, int n) {
        int i = buscaHash(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            System.out.print("Elemento Borrado! \n");
            return 1;
        }
    }
}
