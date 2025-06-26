import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("\n");
        var value1 = 8;
    var binary1=Integer.toBinaryString(value1);
        System.out.printf(" Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 2; //esse é o value que desloca o número de bits dos valores
        //var binary2=Integer.toBinaryString(value2);
        System.out.printf(" Segundo número da operação %s\n", value2);
       var result = value1 >> value2;
       var binaryResult=Integer.toBinaryString(result);
        System.out.printf("%s >> %s = %s (representação binária %s)\n", value1,value2, result, binaryResult);

/*
1001

 */








        /*var result = ~value1;
        var binaryResult=Integer.toBinaryString(result);
        System.out.printf("~%s = %s (representação binária %s\n", value1,result,binaryResult);
*/
    }
    /*
    110
    101
    0 = false
    1 = true
basicamente o código esta analisando a representação binária dos números ( values ) e vendo se é verdadeiro ou falso
através do or



O operador de complement (~) ele nega o true e o false ou seja se algo é true ele vira false, se algo é false ele vira true

00000000000000000000000000000110   da direita para a esquerda, o 0 é false em baixo ele se torna true(1) o 1 é true em baixo ele se torno false (0) e assim vai....
11111111111111111111111111111001




     */

}