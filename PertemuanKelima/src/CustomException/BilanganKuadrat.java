/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomException;

/**
 *
 * @author Huawei
 */
class KuadratTidakTepatException extends Exception {

    public KuadratTidakTepatException(String k) {
        super(k);
    }
}

public class BilanganKuadrat {

    public static void KuadratTepat(double angka)
            throws KuadratTidakTepatException {
        double hasil = Math.sqrt(angka);
        if (hasil % 1 != 0) {
            throw new KuadratTidakTepatException("Hasil kuadrat dari " + angka
                    + " adalah " + hasil + " (bukan bilangan bulat)");
        } else {
            System.out.println("Akar kuadrat dari " + angka + " adalah " + (int) hasil);
        }
    }

    public static void main(String[] args) {
        try {
            KuadratTepat(3);
        } catch (KuadratTidakTepatException e) {
            System.out.println("Menangkap Exception: " + e.getMessage());
        }
    }
}
