import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	
	private int current;
	T[] array;

	public ArrayIterator(T[] array) {
		this.array = array;
		this.current = 0;
	}
	
	
	@Override
	public boolean hasNext() {
		return current < array.length;
	}

	@Override
	public T next() {
		return array[current++];
	}
	
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5}; 
		ArrayIterator <Integer > test = new ArrayIterator<>(a);
		while(test.hasNext()) {
			System.out.println(test.next());
			
		}

	}

}

/* IMPLEMENTACAO COM ITERABLE:
 * 
 * 
 * import java.util.Iterator;

public class ArrayIterator<T> implements Iterable<T> {
	
	private int current;
	T[] array;

	public ArrayIterator(T[] array) {
		this.array = array;
		this.current = 0;
	}
	
	public class ITER implements Iterator<T>{

		@Override
		public boolean hasNext() {
			return current < array.length;
		}

		@Override
		public T next() {
			return array[current++];
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5}; 
		ArrayIterator <Integer > test = new ArrayIterator<>(a);
		for(Integer i : test) {
			System.out.println(i);
		}

	}



	@Override
	public Iterator<T> iterator() {
		return new ITER();
	}

} */
