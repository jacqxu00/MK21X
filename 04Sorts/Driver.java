public class Driver {
    public static void main(String[] args) {
	int[] name = new int[8];
	name[0] = 5;
	name[1] = 7;
	name[2] = 8;
	name[3] = 3;
	name[4] = 4;
	name[5] = 2;
	name[6] = 0;
	name[7] = 1;
	Sorts.selectionSort(name);
	System.out.println(name);
    }
}
