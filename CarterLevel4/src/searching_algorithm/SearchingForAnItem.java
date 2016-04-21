package searching_algorithm;

public class SearchingForAnItem {
	public static void main(String[] args) {
		int[] dataSet = {0, 2, 2, 2, 3, 8};
		System.out.println(binarySearch(dataSet, 8));
	}
	
	protected static int binarySearch(int[] dataSet, int wantedValue) {
		int index = dataSet.length / 2;
		int median = dataSet[dataSet.length / 2];
		while(median != wantedValue) {
			if(wantedValue < median) {				
				index /= 2;
			} else if(wantedValue == 0) {
				return 0;
			} else if(index == 1) {
				if(wantedValue == dataSet[1]) {
					return 1;
				} else {
					return 2;
				}
			} else if(dataSet[dataSet.length - 1] == wantedValue) {
				return dataSet.length - 1;
			} else {
				index += index / 2;
			}
			median = dataSet[index];
		}
		return index;
	}
}