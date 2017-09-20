/**
 * 
 */
package org.escoladeltreball.helloword;

/**
 * @author iaw26509397
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		int[] values = {3, 2, 4, 2, 6};
//		Main m = new Main();
//		int small = m.findSmallest(values);
//		System.out.println(small);
//		int sum = m.sum(values);
//		System.out.println(sum);
//		int n = 2;
//		int frecuency = m.frecuency(values, n);
//		System.out.println(frecuency);
//		double frequency = m.frequencyPercentage(values, n);
//		System.out.println(frequency);
	}
	/*
	 * (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.helloword.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		// TODO Auto-generated method stub
		int smallest = values[0];
		int aux = smallest;
		
		for (int i = 0; i < values.length; i++) {
			aux = values[i];
			if (smallest > aux) {
				smallest = aux;
			}
		}
		return smallest;
	}
	/*
	 * (non-Javadoc)
	 * @see org.escoladeltreball.helloword.Utils#sum(int[])
	 */
	public int sum(int[] values) {
		int sum = 0;
		int aux = 0;
		for (int i = 0; i < values.length; i++) {
			aux = values[i];
			sum = sum + aux;
		}
		return sum;
	}
	public int frecuency(int[] values, int n) {
		int frecuency =0;
		for (int i = 0; i < values.length; i++) {
			if (n == values[i]) {
				frecuency++;
			}
		}
		return frecuency;
	}
	public double frequencyPercentage(int[] values, int n) {
		double frequency = 0;
		for (int i = 0; i < values.length; i++) {
			if (n == values[i]) {
				frequency++;
			}
		}
		frequency = frequency * 100 / values.length;
		return frequency;
	}

}
