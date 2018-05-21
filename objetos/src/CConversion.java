/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author racso
 */
public class CConversion {

    public float convertir() {
        Scanner grados = new Scanner(System.in);
        float centigrados = grados.nextFloat();
        float farenheit;
        return farenheit = (float) (centigrados * 1.8 + 32);
    }
}
