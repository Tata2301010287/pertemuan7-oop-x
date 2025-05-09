/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan701;

/**
 *
 * @author INSTIKI
 * TGL: 09 Mei 2025
 */
public class pesan {
    private String tx = "Isi Pesan default";
    
    public void tulisPesan(){
        System.out.println(this.tx);
    }
    public void tulisPesan(String txt){
        System.out.println(txt);
    }
    public void tulisPesan(String txt2 , String txt3){
        System.out.println(txt2+txt3);
    }
}
