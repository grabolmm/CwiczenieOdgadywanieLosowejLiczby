import java.util.Scanner;

public class Operacje {
    private int nowaLiczbaCzlowiek;
    private boolean czyPodanoNowaLiczbe;
    private Scanner scanner = new Scanner(System.in);

    public void sprawdzeniePrzedzialuLiczb(int liczbaCzlowiek){
        while (liczbaCzlowiek < 0 || liczbaCzlowiek > 10){
            System.out.println("błędny przedział liczbowy");
            System.out.println("podaj liczbe: ");
            liczbaCzlowiek = scanner.nextInt();
            nowaLiczbaCzlowiek = liczbaCzlowiek;
            czyPodanoNowaLiczbe = true;
        }
    }

    public int getNowaLiczbaCzlowiek() {
        return nowaLiczbaCzlowiek;
    }

    public boolean isCzyPodanoNowaLiczbe() {
        return czyPodanoNowaLiczbe;
    }
}
