import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("""
                           Bem vindo \u00e0 calculadora!!! 
                           Digite os dois n\u00fameros que voc\u00ea deseja utilizar, 
                           e logo ap\u00f3s a opera\u00e7\u00e3o.""");
        Scanner readNumberOne = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int firstNumber = readNumberOne.nextInt();
        Scanner readNumberTwo = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        int secondNumber = readNumberTwo.nextInt();
        int operation = 0;
        while (operation != 8){
            Scanner readOperation = new Scanner(System.in);
            System.out.println("""
                         Digite qual operation voc\u00ea deseja fazer:
                         [1] Somar 
                         [2] Diminuir 
                         [3] Multiplicar 
                         [4] Dividir 
                         [5] Maior 
                         [6] Menor 
                         [7] Resetar números
                         [8] Sair""");
            operation = readOperation.nextInt();
            switch (operation){
            case 1:
            System.out.print("A soma entre ");
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));            
            break;
            case 2:
            System.out.print("A subtração entre ");
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            break;
            case 3:
            System.out.print("A multiplicação entre ");
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
            break;
            case 4:
            System.out.print("A divisão entre ");
            System.out.println(firstNumber + " / " + secondNumber + " = " +  (firstNumber / secondNumber));
            break;
            case 5:
            if (firstNumber > secondNumber){
                System.out.print(firstNumber);
                System.out.print(" é maior que ");
                System.out.println(secondNumber);
            }
            else if (firstNumber < secondNumber) {
                System.out.print(secondNumber);
                System.out.print(" é maior que ");
                System.out.println(firstNumber);
            }
            else if (firstNumber == secondNumber){
                System.out.println("São iguais!");
            }
            else {
                System.out.println("erro.");
            }
            case 6:
            if (firstNumber < secondNumber) {
                System.out.print(firstNumber);
                System.out.print(" é menor que ");
                System.out.println(secondNumber);
            }
            else if (firstNumber > secondNumber) {
                System.out.print(secondNumber);
                System.out.print(" é menor que ");
                System.out.println(firstNumber);
            }
            else if (firstNumber == secondNumber) {
                System.out.println("São iguais!");
            }
            else {
                System.out.println("erro.");
            }
            case 7:
            Scanner readNumberOneAgain = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            firstNumber = readNumberOneAgain.nextInt();
            Scanner readNumberTwoAgain = new Scanner(System.in);
            System.out.println("Digite o segundo número: ");
            secondNumber = readNumberTwoAgain.nextInt();
        }}
        System.out.println("Espero ter ajudado!");
    }
}
