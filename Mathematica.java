
import java.util.*;

/**
 * 
 */
public class Mathematica implements IMathematics {

    /**
     * Default constructor
     */
    public Mathematica() {
    }

    /**
     * 
     */
    public void mathSort(int[] array) {	//takes array into method
		for(int i=1; i<array.length; i++){
			while(i>0 && array[i-1] > array[i]){	//checks if previous element is greater than the original element being checked
				int temp=array[i-1];
				array[i-1]=array[i];
				array[i]=temp;
				i--;
			}
				
		}
	}
    
    }
