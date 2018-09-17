
public class InsertionSort {

	public InsertionSort(){  //empty constructor
		
	}
	
	public void insertSort(int[] array){	//takes array into method
		for(int i=1; i<array.length; i++){
			while(i>0 && array[i-1] > array[i]){	//checks if previous element is greater than the original element being checked
				int temp=array[i-1];
				array[i-1]=array[i];
				array[i]=temp;
				i--;
			}
				
		}
	}
	public void printIS(int[] array){	//method to print array
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
