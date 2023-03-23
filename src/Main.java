import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
        public static void main( String[] args) {
            Scanner leitor = new Scanner(System.in);
            ArrayList<List<Object>> temperaturas = new ArrayList<>();
            double soma = 0;
            int j = 1;
            int temperatura;
            String mes;
            int diaMes;
            ArrayList<Object> listas = new ArrayList<>();

                for (j = 1; j <= 3; j++) {

                    System.out.println("Digite o mês e o dia em que a medida está sendo realizada:");
                    mes = leitor.next();
                    diaMes = leitor.nextInt();

                    System.out.println("Digite o valor da temperatura " + j);
                    temperatura = leitor.nextInt();

                    listas.add(mes);
                    listas.add(diaMes);
                    listas.add(temperatura);
                    System.out.println(listas);
                    temperaturas.add(listas);
//                    System.out.println(lis);
                    System.out.println(temperaturas);
                    listas.clear();
                    soma += temperatura;
                }
            double media = soma / j;



            System.out.println("lista das temperaturas registradas: " + temperaturas);
            System.out.println("Média das temperaturas registradas no semestre: " + media);
        }

}



