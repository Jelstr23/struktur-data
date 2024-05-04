import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Tugas 1 Juli Endah Lestari 048395352");
      //1.Buatlah sebuah deklarasi variabel 
      //dengan tipe data integer yang bernama ‘jumlahBaris’
      int jumlahBaris;
      //contoh penggunaan variabel
      jumlahBaris=20;
      System.out.println("jika jumlahBaris dikali 3="+ jumlahBaris*3);
      
      //2.Buatlah sebuah deklarasi variabel 
      //dengan tipe data string yang bernama ‘kalimatBaru’ 
      //yang berisi kata ‘Deklarasi tipe data String’?
      String kalimatBaru="Deklarasi tipe data String";
      System.out.println("Kalimat baru:"+ kalimatBaru);
      
      //3.Buatlah pendeklarasian array satu dimensi 
      //dengan nama ‘empatAngka’, tipe data integer, 
      //yang berisi angka (07, 10, 20, 23)? 
      //Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
      int[] empatAngka={07,10,20,23};
      for (int i=0; i<empatAngka.length; i++) {
        System.out.print(empatAngka[i]+"\t");
      }
      System.out.println();
      
      //4.Buatlah pendeklarasian array dua dimensi dengan nama ‘alfabet’
      //tipe data String yang terdiri dari tiga baris dan tiga kolom, 
      //seperti pada matrik berikut, Pendeklarasian tersebut 
      //menggunakan bahasa pemrograman Java.
      String[][] alfabet={{"p","s","n"}, {"w","l","b"}, {"s","r","e"}};
      for (int x=0; x<alfabet.length; x++) {
        for (int y=0; y<alfabet[x].length; y++) {
          System.out.print(alfabet[x][y]+"\t");
        }
        System.out.println();
      }
      System.out.println();
      
      //5.Buatlah deklarasi linked list dengan nama 'listAngka'
      //yang memiliki list (26, 08, 23, 24, 16). Pendeklarasian 
      //tersebut dengan menggunakan bahasa pemrograman Java.
      LinkedList<Integer> listAngka= new LinkedList<>();
      listAngka.add(26);
      listAngka.add(8);
      listAngka.add(23);
      listAngka.add(24);
      listAngka.add(16);
      System.out.println(listAngka);
  }
}