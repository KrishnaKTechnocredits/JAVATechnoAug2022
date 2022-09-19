package asthaSrivastava.arrayBasics;

class ReturnSecMax {

	int getMaxValue(int[] arr) {
		int maxV = arr[0];
		int sMaxV = arr[1];

		for (int index = 0; index < arr.length; index++) {
			if (maxV < arr[index]) {
				sMaxV = maxV ;
				maxV = arr[index];
			} else if (sMaxV < arr[index]) {
				sMaxV = arr[index];
			}

		}

		return sMaxV;
	}

	public static void main(String[] args) {
		int[] input = {10,99,33,44,89,76};
		int output = new ReturnSecMax().getMaxValue(input);
		System.out.println("Second highest number is :" + output);
	}
}
