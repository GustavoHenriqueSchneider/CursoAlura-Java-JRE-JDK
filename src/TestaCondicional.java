
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 12;
		int quantidadePessoas = 2;
		
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}
		else {
			if (quantidadePessoas >= 2)
				System.out.println("voce nao tem 18 anos mas pode entrar pois esta acompanhado");
			else
				System.out.println("infelizmente voce n�o pode entrar");
		}
	}
}
