/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 27
 */
public class PBOULG10115557Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukan Kalimat : ");
        Kalimat = input.nextLine();
        
        System.out.print("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + Kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + Kalimat.toLowerCase());
    }    
}
