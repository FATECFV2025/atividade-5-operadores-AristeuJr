public class Operadores {

    // ----- Operadores Aritméticos -----
    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    public float divisao(float v1, float v2) {
        return v1 / v2;
    }

    // ----- Operadores de Atribuição -----
    public int atribuicaoSoma(int valor, int incremento) {
        valor += incremento;
        return valor;
    }

    public int atribuicaoSubtracao(int valor, int decremento) {
        valor -= decremento;
        return valor;
    }

    public int atribuicaoMultiplicacao(int valor, int fator) {
        valor *= fator;
        return valor;
    }

    public int atribuicaoDivisao(int valor, int divisor) {
        valor /= divisor;
        return valor;
    }

    // ----- Operadores Lógicos -----
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean naoLogico(boolean a) {
        return !a;
    }

    // ----- Operadores de Comparação -----
    public boolean maiorQue(int a, int b) {
        return a > b;
    }

    public boolean menorQue(int a, int b) {
        return a < b;
    }

    public boolean igualA(int a, int b) {
        return a == b;
    }

    public boolean diferenteDe(int a, int b) {
        return a != b;
    }

    public boolean maiorOuIgual(int a, int b) {
        return a >= b;
    }

    public boolean menorOuIgual(int a, int b) {
        return a <= b;
    }
}
