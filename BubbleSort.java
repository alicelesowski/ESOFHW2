
public class BubbleSort {
	boolean swapped = false;
	
	public BubbleSort(){	//empty constructor
	}
	
	public void sort(int[] array){ //takes array into method
		int pass=1; //keeps track of current pair of array elements
		do{
			swapped = false;
			for(int i=0; i<array.length-pass; i++){
				while(i>0 && array[i-1] > array[i]){  //checks elements in the array in pairs next to eachother
					int temp=array[i-1];
					array[i-1]=array[i];
					array[i]=temp;
					swapped=true;
				}
			}
			pass++;
		}
		while(swapped);
}
		
	public void printArray(int[] array){ //method to print array
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
