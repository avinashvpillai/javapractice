package javapractice.javapractice;

public class SelectionSort {

	public static void main(String[] args) {
		int data[] = {12,4,5,7,13,5,9,11};
		Integer minVal = null;
		Integer temp = null;
		int counter = 0;
		for(int i = 0; i< data.length; i++) {
			for(int j=counter; j<data.length; j++) {
				if(minVal == null) {
					minVal = data[counter];
				}
				if(minVal > data[j]) {
					temp = minVal;
					minVal = data[j];
					data[j] = temp;
				}
			}
			System.out.println("counter: "+ counter + ", minVal: "+minVal);
			data[counter] = minVal;
			minVal = null;
			counter++;
		}	
		
		for(int val: data) {
			System.out.print(val+" ,");
		}
	}
	

}
