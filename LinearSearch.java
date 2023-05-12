package projeler;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan istenir
        System.out.print("Dizinin boyutunu giriniz: ");
        int size = input.nextInt();

        // Dizinin elemanlarını kullanıcıdan isteyelim
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            arr[i] = input.nextInt();
        }

        // Aranacak olan elemanı kullanıcıdan istenir
        System.out.print("Aranacak olan elemanı giriniz: ");
        int aranan = input.nextInt();

        // Linear Search algoritması ile aranılan elemanın dizide olup olmadığını kontrol edelim
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == aranan) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Aranan eleman " + (index+1) + ". sırada bulundu.");
        } else {
            System.out.println("Aranan eleman dizide bulunamadı.");
        }

        input.close();
    }
}

