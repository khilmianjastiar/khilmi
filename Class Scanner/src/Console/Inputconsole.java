/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import java.io.Console;
/**
 *
 * @author Khilmy
 */
public class Inputconsole {
    public static void main(String[] args) {
     String nama,alamat,jurusan,jeniskelamin;
     long nim;
     int tahun;
     
     Console con = System.console();
     
       System.out.print(" Inputkan Nama             : ");
             nama = con.readLine();
       
       System.out.print(" Inputkan Alamat           : ");
             alamat = con.readLine();      
             
       System.out.print(" Inputkan Jenis Kelamin    : ");
             jeniskelamin = con.readLine();
             
       System.out.print(" Inputkan Jurusan          : ");
             jurusan = con.readLine();
             
       System.out.print(" Inputkan Tahun            : ");
             tahun = Integer.parseInt(con.readLine());
             
       System.out.print(" Inputkan Nim              : ");
             nim = Long.parseLong(con.readLine());
             
             
                System.out.println ("======================================");
                System.out.println (" Nim saya adalah                   :"+nim);
                System.out.println (" Perkenalkan Nama saya             :"+nama);
                System.out.println (" Alamat saya di                    :"+alamat);
                System.out.println (" Tahun angkatan saya adalah        :"+tahun);
                System.out.println (" Jurusan saya adalah               :"+jurusan);
                System.out.println (" Jenis Kelamin saya adalah         :"+jeniskelamin);
    }
    
}
