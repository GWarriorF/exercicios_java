package exercicios7;

public class ClienteMolde 
{
		private String nome, genero, preferenciaProduto, celular;
		private Integer idade;
	
		
		
		public ClienteMolde(String nome, String genero, String preferenciaProduto, Integer idade, String celular) 
		{
			this.nome = nome;
			this.genero = genero;
			this.preferenciaProduto = preferenciaProduto;
			this.idade = idade;
			this.celular = celular;
		}
		
		public void PrintCliente() 
		{
			System.out.println("Nome do cliente: " + nome);
			System.out.println("Genero do cliente: " + genero);
			System.out.println("Idade do cliente: " + idade);
			System.out.println("Preferencia de produto do cliente: " + preferenciaProduto);
			System.out.println("Número de celular do cliente: " + celular + "\n");
			
		}
		
		public void setNome(String nome) 
		{
			this.nome = nome;
		}
		public String getNome() 
		{
			return nome;
		}
		
		public void setGenero(String genero) 
		{
			this.genero = genero;
		}
		public String getGenero() 
		{
			return genero;
		}
		
		public void setPreferenciaProduto(String preferenciaProduto) 
		{
			this.preferenciaProduto = preferenciaProduto;
		}
		public String getPreferenciaProduto() 
		{
			return preferenciaProduto;
		}
		
	
		public void setIdade(Integer idade) 
		{
			this.idade = idade;
		}
		public Integer getIdade() 
		{
			return idade;
		}
		
		public void setcelular(String celular) 
		{
			this.celular = celular;
		}
	
		public String getcelular() 
		{
			return celular;
		}
	
}
