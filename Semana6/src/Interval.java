import java.util.Iterator;
import java.util.NoSuchElementException;

public class Interval implements Iterable<Integer>{

	
	private final int min;
	private final int max;
	
	public Interval(int min,int max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean isEmpty() {
		return min > max;
	}
	
	public int numberElements() {
		return max-min+1;
	}
	
	public static Interval naturals(int number) {
		return new Interval(1,number);
	}
	
	public static Interval arrayIndexes(int[] array) {
		return new Interval(0,array.length - 1);
	}
	
	public static Interval empty() {
		return new Interval(2,0);
	}
	
	private class IntervalIterator implements Iterator<Integer>{
		private int current = min;
		
		@Override
		public boolean hasNext() {
			return current<=max;
		}

		@Override
		public Integer next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			return current++;
		}

	
		
		
	}

	@Override
	public Iterator<Integer> iterator() {
		return new IntervalIterator();
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Interval [min=" + min + ", max=" + max + "]";
	}

	public static double average(Iterable<Integer> iterable) {

		Iterator<Integer> it = iterable.iterator();
		int sum = 0, nElems = 0;

		while (it.hasNext()) {
			sum += it.next();
			nElems++;
		}

		return (double) sum / nElems;
	}
	
	public static void main(String[] args) {

		Interval test = new Interval(14, 19);
		System.out.println("Intervalo entre 14 e 19: " + test);
		test.forEach(n -> System.out.println(n));
		
		/*Iterator<Integer> i = test.iterator();
		while(i.hasNext()) {
			Integer a = i.next();
			System.out.println(a);
		}*/

		Interval nat = Interval.naturals(7);
		System.out.println("Intervalo naturais ate' 7: " + nat);
		nat.forEach(n -> System.out.println(n));

		int[] v = new int[5];
		Interval indexes = Interval.arrayIndexes(v);
		System.out.println("Intervalo de indices do array v[5]: " + indexes);
		indexes.forEach(n -> System.out.println(n));

		Interval empty = Interval.empty();
		System.out.println("Intervalo vazio: " + empty);
		empty.forEach(n -> System.out.println(n));
		
		// calcula a media usando o metodo desenvolvido no exerc. anterior
		System.out.println();
		System.out.println("Medias dos inteiros pertencentes aos intervalos:" );
		System.out.println(test + ": " + average(test));
		System.out.println(nat + ": " + average(nat));
		System.out.println(indexes + ": " + average(indexes));
		System.out.println(empty + ": " + average(empty));
	}
}

	
	
	
