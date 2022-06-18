import java.util.Scanner;

public class DersNotu {
    public static void main(String[] args) {

        int mat,fiz,turk,edebiyat;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz :");
        fiz = input.nextInt();

        System.out.println("Türkçe Notunuz :");
        turk = input.nextInt();

        System.out.println("Edebiyat Notunuz :");
        edebiyat = input.nextInt();

        double avarage = (mat+fiz+turk+edebiyat) / 5;
        if (avarage <= 50){
            System.out.println("Allah Kaldım :D ");
            System.out.println("Ortalamanız :" + avarage);}
            else {
                System.out.println("Geçtin Aslann");
                System.out.println("Ortalamanız :" + avarage);
            }

    }
}
