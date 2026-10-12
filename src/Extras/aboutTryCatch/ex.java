package Extras.aboutTryCatch;

import java.util.Scanner;

/*
 * TRY-CATCH: BÁSICO
 *
 * Exceção = erro que acontece durante a execução (divisão por zero, índice errado etc).
 * Sem tratamento, o programa para e mostra o erro na tela.
 *
 * try      -> bloco com código que PODE dar erro
 * catch    -> bloco que roda SE o erro acontecer (o programa não para)
 * finally  -> bloco que roda SEMPRE, com ou sem erro
 * throw    -> lança uma exceção manualmente
 * throws   -> declara na assinatura do método que ele pode lançar exceção
 *
 * Ordem: se der erro no try, o resto do try é pulado e o código vai pro catch.
 * Depois do catch (ou do try, se não deu erro), o programa segue normalmente.
 *
 * Vários catch: coloque o mais específico primeiro e o mais genérico (Exception) por último.
 *
 * Checked (ex: IOException) -> o compilador OBRIGA tratar ou declarar com throws.
 * Unchecked (ex: ArithmeticException, NullPointerException) -> não é obrigatório tratar.
 */
public class ex {

    public static void main(String[] args) {

        // 1) Sem try-catch, este erro derrubaria o programa:
        // int r = 10 / 0;

        // 2) try-catch básico
        try {
            int r = 10 / 0;                     // lança ArithmeticException
            System.out.println(r);              // esta linha NÃO roda
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero. " + e.getMessage());
        }
        System.out.println("2) O programa continua aqui.");

        // 3) Vários catch: específico primeiro, genérico depois
        try {
            int[] v = new int[3];
            v[5] = 1;                           // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3) Índice inválido: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("3) Qualquer outro erro: " + e.getMessage());
        }

        // 4) finally: roda sempre, bom para fechar recursos
        try {
            System.out.println("4) Abrindo recurso...");
        } catch (Exception e) {
            System.out.println("4) Erro");
        } finally {
            System.out.println("4) Finally sempre roda.");
        }

        // 5) try-with-resources: fecha o Scanner sozinho (não precisa de sc.close())
        try (Scanner sc = new Scanner("42")) {  // lê de uma String, sem travar o programa
            int n = sc.nextInt();
            System.out.println("5) Número lido: " + n);
        }                                       // sc.close() é chamado automaticamente aqui

        // 6) throw manual
        try {
            verificarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("6) Capturado: " + e.getMessage());
        }

        // 7) Método com throws (exceção checada): precisa ser tratada aqui
        try {
            lerArquivo();
        } catch (java.io.IOException e) {
            System.out.println("7) Erro de IO: " + e.getMessage());
        }
    }

    // throw: lança a exceção quando a regra é quebrada
    static void verificarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        System.out.println("Idade ok: " + idade);
    }

    // throws: avisa quem chama que este método pode lançar IOException
    static void lerArquivo() throws java.io.IOException {
        throw new java.io.IOException("arquivo não encontrado (exemplo)");
    }
}