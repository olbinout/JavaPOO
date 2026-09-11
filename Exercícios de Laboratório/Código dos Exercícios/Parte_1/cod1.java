package Parte_1;

/*

-- \n (Nova Linha): Move o cursor para o início da próxima linha (específico para sistemas Unix/Linux/macOS modernos).

-- \t (Tabulação): Insere um espaçamento horizontal (Tab), equivalente geralmente a 4 ou 8 espaços.

-- \r (Retorno de Carro): Move o cursor para o início da linha atual sem descer para a próxima.

-- r\n (Quebra padrão Windows): Combinação usada nativamente no sistema operacional Windows.

*/

public class cod1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello,\nWorld!");
        System.out.println("Hel\rlo, World!");
        System.out.println("Hello,\tWorld!");
    }
}
