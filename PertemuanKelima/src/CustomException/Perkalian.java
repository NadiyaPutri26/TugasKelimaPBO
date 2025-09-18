/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomException;

/**
 *
 * @author Huawei
 */
class PerkalianTidakTepatException extends RuntimeException {

    public PerkalianTidakTepatException(String p) {
        super(p);
    }
}

public class Perkalian {

    public static void Tepat(int a, int b) {
        if (b == 0) {
            throw new PerkalianTidakTepatException("Perkalian dengan nol tidak diperbolehkan.");
        }
        System.out.println("Hasil: " + (a * b));
    }

    public static void main(String[] args) {
        try {
            Tepat(2, 2);
        } catch (PerkalianTidakTepatException e) {
            System.out.println("Menangkap Exceoption: " + e.getMessage());
        }
    }
}
