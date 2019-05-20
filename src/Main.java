import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        double input1 = scan.nextDouble();
        System.out.println("Podaj druga liczbe");
        double input2 = scan.nextDouble();

        if (input1 == input2) {
            double result = input1 * input1;
            System.out.println("Liczby są sobie rowne wyswietlamy ich kwadrat o wartosci: " + result);
        }

        else if (input1 > input2) {
            double result = input1 + input2;
            System.out.println("Pierwsza Liczba wieksza drugiej więc wyswietlamy ich sumę czyli: " + result);
        }

        else if (input1 < input2) {
            double result = input1 * input2;
            System.out.println("Pierwsza liczba miejsza od drugiej wiec wyświetlamy ich iloczyn");

        } else {
            System.out.println("Błąd wyniku");

        }
    }

}
