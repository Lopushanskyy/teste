

public class Aluno {
	private int numero;
	String nome;
	int anoMatricula;
	int anoNascimento;
	int abcdasdadasdasdasdasdadsdaasdasdsda;

	public Aluno(int numero, String nome, int anoMatricula, int anoNascimento) {
		this.numero = numero;
		this.nome = nome;
		this.anoMatricula = anoMatricula;
		this.anoNascimento = anoNascimento;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + ", anoMatricula=" + anoMatricula + ", anoNascimento="
				+ anoNascimento + "]";
	}

	/*public static void main(String[] args) {

		List<Aluno> lista = new ArrayList<>();

		Aluno a1 = new Aluno(100, "Antonio", 2020, 2004);
		Aluno a2 = new Aluno(101, "Pedro", 2020, 2002);
		Aluno a3 = new Aluno(102, "Filipe", 2020, 2004);
		Aluno a4 = new Aluno(103, "Zacarias", 2023, 2004);

		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);

		for (Aluno aluno : lista) {
			System.out.println(aluno);
		}

		System.out.println();
		lista.sort(new ComparadorDeNome());

		for (Aluno aluno : lista) {
			System.out.println(aluno);
		}

		System.out.println();
		lista.sort(new ComparadorDeNumero());

		for (Aluno aluno : lista) {
			System.out.println(aluno);
		}

		System.out.println();
		lista.sort(new ComparadorComposto());
		for (Aluno aluno : lista) {
			System.out.println(aluno);
		}

	}*/

}