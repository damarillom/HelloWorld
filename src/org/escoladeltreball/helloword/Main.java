/**
 * 
 */
package org.escoladeltreball.helloword;

import java.util.Arrays;

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
		int[] values = {1,2,4};
		Main m = new Main();
//		int small = m.findSmallest(values);
//		System.out.println(small);
//		int sum = m.sum(values);
//		System.out.println(sum);
//		int n = 2;
//		int frecuency = m.frecuency(values, n);
//		System.out.println(frecuency);
//		double frequency = m.frequencyPercentage(values, n);
//		System.out.println(frequency);
		System.out.println(Arrays.toString(m.merge(values, 3)));
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
	public boolean isPresent(int[] values, int n) {
		boolean present = false;
		for (int i = 0; i < values.length; i++) {
			if (n == values[i]) {
				present = true;
			}
		}
		return present;
	}
	public int[] merge(int[] values, int n) {
		int[] merge = new int[values.length + 1];
		Main m = new Main();
		for (int j = 0; j < merge.length;j++) {
			merge[j] = 0;
		}
		for (int i = 0; i < values.length; i++) {
			
			if (!m.isPresent(merge, n)) {
				merge[i] = values[i];
			} else {
				merge[i+1] = values[i];
			}
			if (n > values[i] && n < values[i+1]) {
				merge[i+1] = n;
			}
		}
		return merge;
	}
}
