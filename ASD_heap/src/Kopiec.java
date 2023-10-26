import java.util.Arrays;

public class Kopiec {

    public int[] zbior;
    public int size;

    public Kopiec(int[] zbior) {
        this.size = zbior.length;
        this.zbior = zbior;
        //zbudujKopiec();
    }

    public void zbudujKopiec() {
        for (int i = (size / 2) - 1; i >= 0; i--) { //size / 2 - 1 dlatego ze tablica jest indeksowana od 0
            kopcuj(i);
        }
    }

    public void kopcuj(int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < size && zbior[leftChild] > zbior[largest]) { //ustawienie dziecka zaleznie od tego czy jest wieksze
            largest = leftChild;
        }

        if (rightChild < size && zbior[rightChild] > zbior[largest]) {
            largest = rightChild;
        }

        if (largest != i) { //jezeli I nie jest najwieksze, podmien i wykonaj rekurencyjnie funkcje dla kolejnego elementu
            zamien(i, largest);
            kopcuj(largest);
        }
    }

    public void zamien(int i, int j) { //podmiana nowego najwiekszego elementu na miejsce rodzica
        int temp = zbior[i];
        zbior[i] = zbior[j];
        zbior[j] = temp;
    }

    public void wydrukujKopiec() { //drukowanie kopca
        System.out.print("Utworzony kopiec: \n[");
        for (int i = 0; i < size; i++) {
            if(i==size-1) {
                System.out.print(zbior[i] + "]\n");
            }else{
                System.out.print(zbior[i] + ", ");
            }
        }

    }

    public void sortowanie() {
        zbudujKopiec();

        for (int i = size - 1; i >= 0; i--) {

            zamien(0, i); // Przenosimy  korzeń na koniec

            size--; // Zmniejszamy rozmiar kopca aby nie uwzgledniac ostatniego elementu w kopcuj()
            kopcuj(0);
        }

        size = zbior.length; // Przywracamy pierwotny rozmiar po sortowaniu
        System.out.println("Posortowany zbior: \n"+ Arrays.toString(zbior));
    }
}
