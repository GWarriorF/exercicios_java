package exercicios7;

public class CursoMolde 
{
		private String nomeCurso, modalidade, instrutor, duracao, alune;

		public CursoMolde(String nomeCurso, String modalidade, String instrutor, String duracao, String alune) 
		{
			this.nomeCurso = nomeCurso;
			this.modalidade = modalidade;
			this.instrutor = instrutor;
			this.duracao = duracao;
			this.alune = alune;
		}
		
		public void PrintCurso() 
		{
			System.out.println("Alune: " + alune);
			System.out.println("Nome do curso: " + nomeCurso);
			System.out.println("Modalidade do curso: " + modalidade);
			System.out.println("Intrutor(es) do curso: " + instrutor);
			System.out.println("Duração do curso: " + duracao + "\n");
		}

		public String getNomeCurso() {
			return nomeCurso;
		}

		public void setNomeCurso(String nomeCurso) {
			this.nomeCurso = nomeCurso;
		}

		public String getModalidade() {
			return modalidade;
		}

		public void setModalidade(String modalidade) {
			this.modalidade = modalidade;
		}

		public String getInstrutor() {
			return instrutor;
		}

		public void setInstrutor(String instrutor) {
			this.instrutor = instrutor;
		}

		public String getDuracao() {
			return duracao;
		}

		public void setDuracao(String duracao) {
			this.duracao = duracao;
		}

		public String getAlune() {
			return alune;
		}

		public void setAlune(String alune) {
			this.alune = alune;
		}
		
		
		
		
}
