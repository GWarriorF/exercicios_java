package exercicios7;

public class FuncionarieMolde 
{
		private String nome, cargo, departamento; 
		private Float salario, cargaHorariaMinutos;
		
		public FuncionarieMolde(String nome, String cargo, String departamento, 
								Float salario, Float cargaHorariaMinutos)
		{

			this.nome = nome;
			this.cargo = cargo;
			this.departamento = departamento;
			this.salario = salario;
			this.cargaHorariaMinutos = cargaHorariaMinutos;
		}
		
		public void PrintFuncionarie() 
		{
			System.out.println("Nome funcionarie: " + nome);
			System.out.println("Cargo funcionarie: " + cargo);
			System.out.println("Departamento funcionarie: " + departamento);
			System.out.println("Salário funcionarie: " + salario);
			System.out.println("Carga horária em minutos funcionarie: " + cargaHorariaMinutos + "\n");
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		public Float getSalario() {
			return salario;
		}

		public void setSalario(Float salario) {
			this.salario = salario;
		}

		public Float getCargaHorariaMinutos() {
			return cargaHorariaMinutos;
		}

		public void setCargaHorariaMinutos(Float cargaHorariaMinutos) {
			this.cargaHorariaMinutos = cargaHorariaMinutos;
		}
		
		
		
		
}
