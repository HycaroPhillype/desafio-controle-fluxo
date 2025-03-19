import java.util.Scanner;

class ParameterInvalidException extends Exception {
    public ParameterInvalidException(String message) {
        super(message);
        // Eu usei o "super()" para garantir retornos melhores da classe Exeption, como manter a mensagem acessível pelo método getMessage() e, Garantir que a exceção se comporte como qualquer outra do java.
    }
}

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int parameterOne = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parameterTwo = terminal.nextInt();
        
        try {
            counter(parameterOne, parameterTwo);

        } catch (ParameterInvalidException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }
    }

    static void counter(int parameterOne, int parameterTwo) throws ParameterInvalidException {
        if (parameterOne > parameterTwo) {
            throw new ParameterInvalidException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int count = parameterTwo - parameterOne;
        
        for (int i = 1; i <= count; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
