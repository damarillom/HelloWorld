/**
 * 
 */
package org.escoladeltreball.helloword;

/**
 * @author iaw26509397
 *
 */
public interface Utils {
	/*
	 * This method returns the frecuency of n in values
	 */
	public abstract int frecuency(int[] values, int n);
	/*
	 * This method returns the frecuency of n in values
	 */
	public abstract double frequencyPercentage(int[] values, int n);
	/*
	 * This method returns the smallest value in the integer in an integer array
	 */
	public abstract int findSmallest(int[] values);
	/*
	 * this method returns the sum of values
	 */
	public abstract int sum(int[] values);
	/*
	 * this method returns true if n is in values
	 */
	public abstract boolean isPresent(int[] values, int n);
	/*
	 * this method returns an integer with n in its place
	 * NOTE: values is am ordered array
	 */
	public abstract int[] merge(int[] values, int n);
}
