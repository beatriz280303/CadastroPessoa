
public class Pessoa {

	private Integer id;
	private String nome;
	private Integer idade;
	private String apelido;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(Integer id, String nome, Integer idade, String apelido) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.apelido = apelido;

	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
}
