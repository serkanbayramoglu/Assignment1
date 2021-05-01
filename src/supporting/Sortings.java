package supporting;

class Sortings {

	static void sort(String[] array) {

		if(array.length<2)
			return;
		
		int middle = array.length /2;
		
		String[] left = new String[middle];
		for (int i = 0; i<middle;i++) {
			left[i] = array[i];
		}
		
		String[] right = new String[array.length - middle];
		for (int i = middle; i<array.length;i++) {
			right[i-middle] = array[i];
		}
				
		sort(left);
		sort(right);
		
		merge(left,right,array);
		
	}
	
	static void merge(String[] left, String[] right, String[] result) {
		int i=0, j=0, k=0;
		
		while(i<left.length && j<right.length) {
			if (left[i].compareTo(right[j]) <= 0) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[j++];
			}
		}
		while (i<left.length) {
			result[k++] = left[i++];
		}
		while (j<right.length) {
			result[k++] = right[j++];
		}
	}
}
