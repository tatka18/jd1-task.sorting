package by.htp.task.sorting;

public class SortingBooble {

	public static void main(String[] args) {

		int[] data = new int[] { 3, 7, 6, 8, 9, 2, 0, 1, 4, 5 };

		bubbleSort(data);
		print(bubbleSort(data));
	}

	public static int[] bubbleSort(int data[]) {
		int tmp = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = (data.length - 1); j >= (i + 1); j--) {
				if (data[j] < data[j - 1]) {
					tmp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = tmp;
				}
			}
		}
		return data;
	}

	public static void print(int[] data) {

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
