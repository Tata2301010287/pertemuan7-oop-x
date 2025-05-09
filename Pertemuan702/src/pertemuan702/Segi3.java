package pertemuan702;

/**
 *
 * @author Natalia
 * TGL 09 Mei 2025
 */
public class Segi3 extends BangunRuang{
    private int alas, tinggi;
    
    public void setAlas(int als){
        this.alas = als;
    }
    public void setTinggi(int tg){
        this.tinggi = tg;
    }
    @Override 
     public void hitungluas(){
        this.luas = this.alas * this.tinggi / 2;
        
        System.out.printf("Luas Segi Tiga\n");
        System.out.printf("Luas = 0.5 X Alas X Tinggi\n");
        System.out.printf("     = 0.5 X %d X %d\n", this.alas, this.tinggi);
        System.out.printf("     = %.2f\n", this.luas);
        
     }
} 