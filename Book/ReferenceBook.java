public class ReferenceBook extends LibraryBook {
    private String collection;

    public ReferenceBook(String a, String t, String i, String callnum, String collect){
	super(a,t,i,callnum);
	collection = collect;
    }

    public String getCollect(){
	return collection;
    }

    public void setCollect(String c){
	collection = c;
    }

    public void checkout(String patron, String due) {
        System.out.println("Cannot check out a reference book");
    }

    public void returned() {
        System.out.println("Reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus() {
	return "Non-circulating reference book";
    }

    public String toString() {
	return super.toString() + ", " + collection;
    }
}
