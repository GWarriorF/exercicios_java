package exercicios7;

public class JogoMolde 
{
		//Atributos de um jogo (Produto)
			private String titulo, genero, console, faixaetaria; 
			private float saldo;
			
			public JogoMolde(String titulo, String genero, String console, String faixaetaria, float saldo) 
			{
				this.titulo = titulo;
				this.genero= genero;
				this.console = console;
				this.faixaetaria = faixaetaria;
				this.saldo = saldo;
			}
			
			public void PrintJogo()
			{
				System.out.println("Título: " + titulo);
				System.out.println("Genêro: " + genero);
				System.out.println("Console: " + console);
				System.out.println("Faixa Etaria: " + faixaetaria);
				System.out.println("Preço: " + saldo + "\n"); 
			}
			
			//titulo 
			public void setTitulo(String titulo) 
			{
				this.titulo = titulo; 
			}
			public String getTitulo() 
			{
				return titulo; 
			}
			
			//genero 
			public void setGenero(String genero) 
			{
				this.genero = genero; 
			}
			public String getGenero() 
			{
				return genero; 
			}
			
			//console
			public void setConsole(String console) 
			{
				this.console = console; 
			}
			public String getConsole() 
			{
				return console; 
			}
			
			//faixa etaria 
			public void setFaixaetaria(String faixaetaria) 
			{
				this.faixaetaria = faixaetaria; 
			}
			public String getFaixaetaria() 
			{
				return faixaetaria; 
			}
			
			//faixa etaria 
			public void setSaldo(float saldo) 
			{
				this.saldo = saldo; 
			}
			public float getSaldo() 
			{
				return saldo; 
			}	

}
