package by.htp.task.sorting;

public class SortingInsert {

	public static void main(String[] args) {

		int[] data = new int[] { 5, 6, 4, 7, 3, 9, 0, 1, 2 };

		insertionSort(data);
		print(insertionSort(data));

	}

	public static int[] insertionSort(int data[]) {
		int key = 0;
		int i = 0;

		for (int j = 1; j < data.length; j++) {
			key = data[j];
			i = j - 1;

			while (i >= 0 && (data[i] > key)) {
				data[i + 1] = data[i];
				i = i - 1;
				data[i + 1] = key;
			}
		}
		return data;
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.printf("[%d] ", data[i]);
		}

	}

}
