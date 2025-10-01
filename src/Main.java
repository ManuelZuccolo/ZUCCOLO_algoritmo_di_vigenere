import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        AlgoritmoVigenere alg = new AlgoritmoVigenere();

        System.out.println("Inserire la frase su cui si vuole operare: ");
        String frase = scan.nextLine();

        System.out.println("Inserire la chiave (se più di una separa con spazi): ");
        String chiave = scan.nextLine();
            String[] arrayS = chiave.split(" ");
            int[] array =  new int[arrayS.length];

            for(int i = 0; i < arrayS.length; i++)
            {
                array[i] = Integer.parseInt(arrayS[i]);
            }

        System.out.println("Inserire l'operazione da svolgere: \nCodifica --> +\nDecodifica --> -  \n");
        char metodo = scan.next().charAt(0);

        for(int i = 0; i < frase.length(); i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                System.out.print(alg.Algoritmo(frase.charAt(i), array[j], metodo));
            }
        }
    }
}
