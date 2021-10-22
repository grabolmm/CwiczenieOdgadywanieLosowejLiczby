import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Operacje operacje = new Operacje();

        int liczbaKomputer = random.nextInt(11);
        int liczbaCzlowiek;
        int licznikProb = 0;

        System.out.println(liczbaKomputer);
        System.out.println("Zgadnij jaką liczbe z przedziału 0-10 wylosowałem");
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        liczbaCzlowiek = scanner.nextInt();

//        while (liczbaCzlowiek < 0 || liczbaCzlowiek > 10){
//            System.out.println("błędny przedział liczbowy");
//            System.out.println("podaj liczbe: ");
//            liczbaCzlowiek = scanner.nextInt();
//        }
        operacje.sprawdzeniePrzedzialuLiczb(liczbaCzlowiek,);


        if(liczbaCzlowiek == liczbaKomputer){
            System.out.println("brawo odgadłeś liczbę za 1 razem");
        }else{
            licznikProb ++;
            while (liczbaCzlowiek != liczbaKomputer) {
                if (liczbaCzlowiek < liczbaKomputer) {
                    System.out.println("moja liczba jest większa");
                    System.out.println("podaj liczbe: ");
                    liczbaCzlowiek = scanner.nextInt();
                    licznikProb ++;
                } else if (liczbaCzlowiek > liczbaKomputer) {
                    System.out.println("moja liczba jest mniejsza");
                    System.out.println("podaj liczbe: ");
                    liczbaCzlowiek = scanner.nextInt();
                    licznikProb ++;
                }
            }
            System.out.println("brawo odgadłeś liczbę za " + licznikProb + " razem");
        }
    }
}
