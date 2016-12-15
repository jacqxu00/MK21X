public class Driver {
    public static void main(String[] args) {
	int[] s8 = new int[8];
	s8[0] = 5;
	s8[1] = 8;
	s8[2] = 7;
	s8[3] = 3;
	s8[4] = 4;
	s8[5] = 2;
	s8[6] = 0;
	s8[7] = 1;
	System.out.println(Sorts.toString(s8));
	Sorts.selectionSort(s8);
	System.out.println(Sorts.toString(s8));
	int[] s0 = new int[0];
	System.out.println(Sorts.toString(s0));
	Sorts.selectionSort(s0);
	System.out.println(Sorts.toString(s0));
	int[] s1 = new int[1];
	s1[0] = 3;
	System.out.println(Sorts.toString(s1));
	Sorts.selectionSort(s1);
	System.out.println(Sorts.toString(s1));
	int[] s2 = new int[2];
	s2[0] = 2;
	s2[1] = 1;
	System.out.println(Sorts.toString(s2));
	Sorts.selectionSort(s2);
	System.out.println(Sorts.toString(s2));
    }
}
