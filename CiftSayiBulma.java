import java.util.Scanner;

import javax.crypto.SealedObject;

public class CiftSayiBulma {
    public static void main(String[] args) {
        /*
         * Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

            Ödev
            Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */

         Scanner input = new Scanner(System.in);

         int sayi;
         System.out.print("sayı değerini giriniz: ");
         sayi = input.nextInt();
         int toplam=0;
         int count=0;
         int ortalama=0;

         for(int  i=0 ;i <= sayi; i++){
            if((i%3==0) && (i%4==0)){
                count++;
                System.out.println(count+".i değeri: "+i);
                toplam +=i;
                              
            }

         }
         ortalama=toplam/count;
         System.out.println("ortalamanız: "+ortalama);
    }
}
