package adding_algorithm;

import org.junit.Assert;
import org.junit.Test;

public class AddingItemIntoArray {
	protected static int[] addItem(int[] array, int insertItem) {
		int[] newArray = new int[array.length + 1];
		for(int i = array.length - 1; i >= 0; i--) {
			if(insertItem > array[i]) {
				newArray[i] = array[i];
				newArray[i + 1] = insertItem;
				for(int x = i - 1; x >= 0; x--) {
					newArray[i - 1] = array[i - 1];
				}
				break;
			}
			newArray[i + 1] = array[i];
		}
		return newArray;
	}
	
	protected static void printArray(int[] valuesToPrint) {
		for(int i : valuesToPrint) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}