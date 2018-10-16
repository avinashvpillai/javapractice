package javapractice.javapractice;

public class BubbleSort {

	public static void main(String[] args) {
		int data[] = {12,4,5,7,13,5,9,11};
		boolean swapped = false;
		int counter = data.length-1;
		for(int i=0;i< counter ;i++){			
			for(int j=0; j<data.length-1 ; j++) {							
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					swapped = true;
				}
			}
			// to exit if there is nothing to swap
			if(!swapped) {
				break;
			}
			// to avoid sorting an already sorted element positions(right most on each itteration), sorting n-1 element of last iteration from right to left
			counter --;
		}
		
		for(int val: data) {
			System.out.print(val+" ,");
		}

	}

}
