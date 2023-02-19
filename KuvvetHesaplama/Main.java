package KuvvetHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        sayi = scan.nextInt();

        for (int i = 1; i <=sayi; i++){
            if ((i % 4 == 0) || (i % 5 == 0)){
                System.out.println(i);
            }
        }
    }
}
