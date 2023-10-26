import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] zbior1 = {3, 2, 1, 10, 8, 14, 7, 9, 16, 4};
        int[] zbior2 = {3, 2, 15, 10, 9, 13, 0, 89, 32, 4,103,4};

        System.out.println("Nieuporzadkowane liczby: \n"+Arrays.toString(zbior1));
        Kopiec kopiec = new Kopiec(zbior1);

        System.out.print("Konkretny element -> ");
        kopiec.kopcuj(3); //kopcowanie dla konkretnego elementu
        kopiec.wydrukujKopiec();

        kopiec.zbudujKopiec();
        kopiec.wydrukujKopiec(); //budowanie kopca

        kopiec.sortowanie(); //posortowanie

        System.out.println("----------------\nNieuporzadkowane liczby: \n"+Arrays.toString(zbior2));
        Kopiec kopiec2 = new Kopiec(zbior2);

        System.out.print("Konkretny element -> ");
        kopiec2.kopcuj(4); //kopcowanie dla konkretnego elementu
        kopiec2.wydrukujKopiec();

        kopiec2.zbudujKopiec();
        kopiec2.wydrukujKopiec(); //budowanie kopca

        kopiec2.sortowanie(); //posortowanie


    }
}