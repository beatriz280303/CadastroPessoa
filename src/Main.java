
public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1, "Beatriz", 22, "Bia");
		Pessoa pessoa2 = new Pessoa(2, "Isabella", 24, "Isa");
		Pessoa pessoa3 = new Pessoa(3, "Carla", 26, "Ca");
		
		Endereco endereco1 = new Endereco(1, "Rua das Belas", "Estreito", 147, "Florian�polis");
		Endereco endereco2 = new Endereco(2, "Rua Lindas", "Kobrassol", 201, "S�o Jos�");
		Endereco endereco3 = new Endereco(3, "Rua Tartarugas", "Coqueiros", 100, "Florian�polis");

		
		System.out.println("O nome da pessoa 1 � " + pessoa1.getNome());
		System.out.println("A idade da pessoa 1 � " + pessoa1.getIdade() + " anos");
		System.out.println("O apelido da pessoa 1 � " + pessoa1.getApelido());
		System.out.println("A rua da pessoa 1 � " + endereco1.getRua());
		System.out.println("O bairro da pessoa 1 � " + endereco1.getBairro());
		System.out.println("O numero da casa da pessoa 1 � " + endereco1.getNumero());
		System.out.println("A cidade da pessoa 1 � " + endereco1.getCidade() + "\n");
		
		System.out.println("O nome da pessoa 2 � " + pessoa2.getNome());
		System.out.println("A idade da pessoa 2 � " + pessoa2.getIdade() + " anos");
		System.out.println("O apelido da pessoa 2 � " + pessoa2.getApelido());
		System.out.println("A rua da pessoa 2 � " + endereco2.getRua());
		System.out.println("O bairro da pessoa 2 � " + endereco2.getBairro());
		System.out.println("O numero da casa da pessoa 2 � " + endereco2.getNumero());
		System.out.println("A cidade da pessoa 2 � " + endereco2.getCidade() + "\n");
		
		System.out.println("O nome da pessoa 3 � " + pessoa3.getNome());
		System.out.println("A idade da pessoa 3 � " + pessoa3.getIdade() + " anos");
		System.out.println("O apelido da pessoa 3 � " + pessoa3.getApelido());
		System.out.println("A rua da pessoa 3 � " + endereco3.getRua());
		System.out.println("O bairro da pessoa 3 � " + endereco3.getBairro());
		System.out.println("O numero da casa da pessoa 3 � " + endereco3.getNumero());
		System.out.println("A cidade da pessoa 3 � " + endereco3.getCidade());
		

	}

}
