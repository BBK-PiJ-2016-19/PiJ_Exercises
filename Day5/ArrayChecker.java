public class ArrayChecker {
	
	
	public boolean isSymmetrical(int[] arrayInts) {
		int size = arrayInts.length();
		for(int i = 0; i < size/2; i++) {
			if(arrayInts[i] != arrayInts[size-i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public int[] reverse(int[] arrayInts) {
		int size = arrayInts.length();
		int[] result = new int[size];
		for (int i = 0; i < ize; i++) {
			result[size-1-i] = arrayInts[i];
		}
		return result;
	}
}