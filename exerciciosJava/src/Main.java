import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //*1 atividade
        //  var scanner = new Scanner(System.in);
        //        System.out.println("Digite seu nome");
        //        var userName = scanner.next();
        //        System.out.println("Agora informe sua idade :");
        //        var year= 2025;
        //        var userAge = year-scanner.nextInt();
        //        System.out.printf(" Seu nome é %s e voce nasceu em   %s \n", userName, userAge);
        //

        // Atividade 2 - Àrea do Quadrado
         //  var scanner = new Scanner(System.in);
        //        System.out.println("Digite o valor do lado do quadrado ");
        //        var sideSquare=scanner.nextInt();
        //        var calc = sideSquare*sideSquare;
        //        System.out.printf("A área do quadrado é %s \n", calc);
        //

        // Atividade 3 - Àrea do Retangulo
        //        var scanner= new Scanner(System.in);
        //        System.out.println("Digite o lado do retângulo");
        //        var sideRectangle = scanner.nextInt();
        //        System.out.println("Digite o valor da Base do retângulo ");
        //        var baseOfRectangle = scanner.nextInt();
        //        var result = sideRectangle*baseOfRectangle;
        //        System.out.printf("O resultado da área do Retângulo é respectivamente %s, \n",result );
        //
        //
        //  Atividade 4 :
        var scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa :");
        var firstPerson = scanner.next();
        System.out.println("Digite a idade da primeira pessoa");
        var firstAgePerson = scanner.nextInt();
        System.out.println("Digite o nome da segunda pessoa : ");
        var secondPerson = scanner.next();
        System.out.println("Digite a idade da segunda pessoa : ");
        var secondAgePerson = scanner.nextInt();
        var differenceAge = firstAgePerson - secondAgePerson;
        System.out.printf("Os nomes registrados foram : %s e %s,\n a diferença de suas idades são respectivamente: %s anos ",firstPerson, secondPerson, differenceAge);
        //
        //
        //
        //





    }
}