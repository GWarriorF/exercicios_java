package exercicios7;

public class RemedioMolde 
{
	private String nome, categoria, viaDeAdministracao, forma, quantidade;

	public RemedioMolde(String nome, String categoria, String viaDeAdministracao, String forma, String quantidade) {
		this.nome = nome;
		this.categoria = categoria;
		this.viaDeAdministracao = viaDeAdministracao;
		this.forma = forma;
		this.quantidade = quantidade;
	}

	public void PrintRemedio() 
		{
			System.out.println("Nome do remédio: " + nome);
			System.out.println("Categoria: " + categoria);
			System.out.println("Via de administação do remédio: " + viaDeAdministracao);
			System.out.println("Forma fisíca do produto: " + forma);
			System.out.println("Quantidade dentro da embalagem: " + quantidade + "\n");
			
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcategoria() {
		return categoria;
	}

	public void setcategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getviaDeAdministracao() {
		return viaDeAdministracao;
	}

	public void setviaDeAdministracao(String viaDeAdministracao) {
		this.viaDeAdministracao = viaDeAdministracao;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
