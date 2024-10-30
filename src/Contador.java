import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);

		System.out.print("Primeiro parâmetro: ");
		int parametroUm = input.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = input.nextInt();
		
		try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }

        input.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		
        for (int i = 1; i <= contagem; i++)
            System.out.printf("%d, ", i);  
        
	}
}
