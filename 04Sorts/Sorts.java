public class Sorts{

    public static String name(){
	return "10.Xu.Jackie"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data the elements to be sorted.
     */
    public static void selectionSort(int[] data){
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
	    System.out.println(toString(data));
	}
    }

    public static String toString(int[] data) {
	String ans = "[ ";
	for (int i = 0; i < data.length - 1; i++) {
	    ans += data[i];
	    ans += ", ";
	}
	ans += data[data.length-1];
	ans += "]";
	return ans;
    }
}
