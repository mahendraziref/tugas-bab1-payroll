/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zyref
 */
public class mkaryawan {

    public static void main(String[] args) {
        karyawan k = new karyawan();
        System.out.println("Data karyawan");
        System.out.println("==================");
        System.out.println("101\tpaijo\t900\t200\t150\t75");
        System.out.println("102\tlulu\t875\t200\t100\t100");
        System.out.println("103\tlala\t1000\t350\t200\t125");
        System.out.println("");
        k.setNama("Paijo");
        k.setNik(101);
        k.setGaji(900);
        k.setTunjangan(200);
        k.setBonus(150);
        k.setDenda(75);
        k.displayMessage();
        
        karyawan l=new karyawan();
        l.setNama("lulu");
        l.setNik(102);
        l.setGaji(875);
        l.setTunjangan(200);
        l.setBonus(100);
        l.setDenda(100);
        l.displayMessage();
        
        karyawan m=new karyawan();
        m.setNama("lala");
        m.setNik(103);
        m.setGaji(1000);
        m.setTunjangan(350);
        m.setBonus(200);
        m.setDenda(125);
        m.displayMessage();
    }
}
