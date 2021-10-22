import java.util.Scanner;

public class Operacje {
    private int podajLiczbe;
    private int liczbaCzlowiek;
    private int liczbaKomputer;

    public void sprawdzeniePrzedzialuLiczb(int liczbaCzlowiek, int podajLiczbe){
        while (liczbaCzlowiek < 0 || liczbaCzlowiek > 10){
            System.out.println("błędny przedział liczbowy");
            System.out.println("podaj liczbe: ");
            liczbaCzlowiek = podajLiczbe;
        }

    }

}
