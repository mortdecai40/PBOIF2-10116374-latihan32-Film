package pboif2.pkg10116374.latihan32.film;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melihat informasi film
 *
 */
public class PBOIF210116374Latihan32Film {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Film n = new Film();
        n.nama="Blade";
        n.genre="Action , Horor ,Scifi";
        n.rating=8.5;
        n.duration=120;
        n.nowPlaying(n.nama,n.genre,n.rating,n.duration) ;
        
        Film n2 = new Film();
        n2.nama="How to Train Yout Dragon";
        n2.genre="Animation";
        n2.rating=9.0;
        n2.duration=110;
        n2.nowPlaying(n2.nama,n2.genre,n2.rating,n2.duration) ;
        
        Film n3 = new Film();
        n3.nama="Catch Me If You Can";
        n3.genre="Comedy, Action";
        n3.rating=7.8;
        n3.duration=140;
        n3.nowPlaying(n3.nama,n3.genre,n3.rating,n3.duration) ;
        
        Film n4 = new Film();
        n4.nama="The Shining";
        n4.genre=" Horor ";
        n4.rating=8.9;
        n4.duration=100;
        n4.nowPlaying(n4.nama,n4.genre,n4.rating,n4.duration) ;
    }
    
}
