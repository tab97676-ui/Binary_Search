public class BinarySearch {

	int binarySearch(int[] array, int target) {
    int i = array.length / 2;
    int k = 0;

    for (k = 0; k < array.length; k++) {
        if (array[i] == target) {
            return i;
        } else if (array[i] > target) {
            i -= (array.length - i) / 2;
        } else if (array[i] < target) {
            i += (array.length - i) / 2;
        }
    }

    return -1;
	}
}
