
public class Sorts{

    public static String name(){
	return "10.Xu.Jackie"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	if (data.length > 1) {
	    for (int i = 0; i < data.length - 1; i++) {
		int smallest = data[i];
		int smallind = i;
		int j = i+1;
		while (j < data.length) {
		    if (data[j] < smallest) {
			smallest = data[j];
			smallind = j;
		    }
		    j++;
		}
	   
		if (smallest != data[i]) {
		    data[smallind] = data[i];
		    data[i] = smallest;
		}
	    }
	}
    }

    public static void insertionSort(int[] data){
	if (data.length > 1) {
	    for (int i = 1; i < data.length; i++) {
		if (data[i] < data[i-1]){
		    int val = data[i];
		    for (int j = i; j >= 1; j--) {
			if (val < data[j-1]) {
			    data[j] = data[j-1];
			    if (j == 1 || val > data[j-2]) {
				data[j-1] = val;
			    }
			}
		    }
		}
	    }
	}		
    }

    public static void bubbleSort(int[] data) {
	int pass = 1;
	boolean swaps = true;
        while (swaps) {
	    swaps = false;
	    for (int i = 0; i < data.length - pass; i++) {
		if (data[i] > data[i+1]) {
		    int temp = data[i+1];
		    data[i+1] = data[i];
		    data[i] = temp;
		    swaps = true;
		}
	    }
	}
	pass++;
    }
	

    public static String toString(int[] data){
	String ans = "[ ";
	if (data.length == 1) {
	    ans += data[0] + "]";
	}
	else if (data.length == 0) {
	    ans += "]";
	}
	else {
	    for (int i = 0; i < data.length - 1; i++) {
		ans += data[i];
		ans += ", ";
	    }
	    ans += data[data.length-1];
	    ans += "]";
	}
	return ans;
    }

}
