import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	
	 static Iterable<String> select1(Iterable<String> iterable, Predicate<String> pred) {
		List<String> list = new ArrayList<>();
		Iterator<String> it = iterable.iterator();
		while(it.hasNext()) {
			String a = it.next();
			if(pred.test(a))
				list.add(a);
		}
		return list;
		}
	
	static <T> Iterable<T> select(Iterable<T> iterable, Predicate<T> pred) {
		List<T> list = new ArrayList<>();
		Iterator<T> it = iterable.iterator();
		while(it.hasNext()) {
			T a = it.next();
			if(pred.test(a))
				list.add(a);
		}
		return list;
		}
	
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("andar");
		list.add(" ");
		list.add("beber");
		list.add(" ");
		list.add("automovel");
		Iterable<String> startWitha= select(list, s -> s.charAt(0) == ('a')); 
		System.out.println(startWitha);
		
		System.out.println();
		System.out.println("ALUNOS:");
		
		List<Aluno> lista = new ArrayList<>();
		Aluno a1 = new Aluno(100, "Antonio", 2020, 2004);
		Aluno a2 = new Aluno(101, "Pedro", 2020, 2002);
		Aluno a3 = new Aluno(102, "Filipe", 2020, 2004);
		Aluno a4 = new Aluno(103, "Zacarias", 2023, 2004);
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		Iterable<Aluno> antonio = select(lista, a -> a.getNome().equals("Antonio")); 
		Iterable<Aluno> anoNascimento2004 = select(lista, a -> a.getAnoNascimento() == 2004); 
		System.out.println(antonio);
		System.out.println(anoNascimento2004);
		
		System.out.println();
		System.out.println("DATAS:");
		
		List<Date> listaData = new ArrayList<>();
		Date a = new Date(31,12,2023);
        Date b = new Date("05-12-2020");
        Date c = new Date("28-2-2023");
        Date d = new Date("02-5-2023");
        listaData.add(a);
        listaData.add(b);
        listaData.add(c);
        listaData.add(d);
        Iterable<Date> mes12 = select(listaData, date-> date.getMonth() == 12); 
        Iterable<Date> ano2023 = select(listaData, date-> date.getYear() == 2023); 
		System.out.println(mes12);
		System.out.println(ano2023);
	}

}
