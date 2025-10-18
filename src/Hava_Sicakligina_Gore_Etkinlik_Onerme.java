/*
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/


import java.util.Scanner;
public class Hava_Sicakligina_Gore_Etkinlik_Onerme {
    static void main() {
        int sicaklik;
        System.out.println("Hava Sicakligina Giriniz");
        Scanner input = new Scanner(System.in);
        sicaklik = input.nextInt();
        if (sicaklik<25) {

        if (sicaklik < 5) {
            System.out.println("Kayak Yapabilirisniz");
        }
        if (sicaklik >= 5 && sicaklik <= 15)
        {
            System.out.println("Sinemaya Gidebilrsiniz");

        }
        if (sicaklik >= 10 && sicaklik <= 25)
        {
            System.out.println("Pikniğe Gidebilrsiniz");
        }}
        else{
            System.out.println("Yüzmeye Gidebilrsiniz");
        }
    }
    }

