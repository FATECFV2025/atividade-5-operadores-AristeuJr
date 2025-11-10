public class Calculadora {
    public static void main(String[] args) {

        Operadores op = new Operadores();

        // --- Aritméticos ---
        System.out.println("ADIÇÃO: " + op.adicao(10, 5));
        System.out.println("SUBTRAÇÃO: " + op.subtracao(10, 5));
        System.out.println("MULTIPLICAÇÃO: " + op.multiplicacao(10, 5));
        System.out.println("DIVISÃO: " + op.divisao(10, 5));

        // --- Atribuição ---
        System.out.println("\nATRIBUIÇÃO SOMA: " + op.atribuicaoSoma(10, 5));
        System.out.println("ATRIBUIÇÃO SUBTRAÇÃO: " + op.atribuicaoSubtracao(10, 5));
        System.out.println("ATRIBUIÇÃO MULTIPLICAÇÃO: " + op.atribuicaoMultiplicacao(10, 5));
        System.out.println("ATRIBUIÇÃO DIVISÃO: " + op.atribuicaoDivisao(10, 5));

        // --- Lógicos ---
        System.out.println("\nE LÓGICO (true && false): " + op.eLogico(true, false));
        System.out.println("OU LÓGICO (true || false): " + op.ouLogico(true, false));
        System.out.println("NÃO LÓGICO (!true): " + op.naoLogico(true));

        // --- Comparação ---
        System.out.println("\nMAIOR QUE (10 > 5): " + op.maiorQue(10, 5));
        System.out.println("MENOR QUE (10 < 5): " + op.menorQue(10, 5));
        System.out.println("IGUAL A (10 == 5): " + op.igualA(10, 5));
        System.out.println("DIFERENTE DE (10 != 5): " + op.diferenteDe(10, 5));
        System.out.println("MAIOR OU IGUAL (10 >= 10): " + op.maiorOuIgual(10, 10));
        System.out.println("MENOR OU IGUAL (5 <= 10): " + op.menorOuIgual(5, 10));
    }
}
