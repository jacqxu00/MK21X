
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
	

    public static void toString(int[] data){
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
        System.out.println(ans);
    }

    private static int[] genArray(int nums) {
	int[] ans = new int[nums];
	for (int i = 0; i < nums; i++) {
	    ans[i] = (int)(Math.random() * 100000);
	}
	return ans;
    }

    public static void main(String[] args) {
	if (args.length != 2) {
	    System.out.println("Please print according to following format \n 'length of array, type of sort (0: selection, 1: insertion, 2: bubble)'");
	    return;
	}
	int[] arr = genArray(Integer.parseInt(args[0]));
	if (arr.length <= 20) {
	    toString(arr);
	}
	int sort = Integer.parseInt(args[1]);
	long start = System.currentTimeMillis();
	if(sort == 0){
	    selectionSort(arr);
	}
	if(sort == 1){
	    insertionSort(arr);
	}
	if(sort == 2){
	    bubbleSort(arr);
	}
	long end = System.currentTimeMillis();
	if (arr.length <= 20) {
	    toString(arr);
	}
	System.out.println((end - start) / 1000.0);
    }
	    
}
