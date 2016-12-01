public class CirculatingBook extends LibraryBook {
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String a, String t, String i, String c){
	super(a,t,i,c);
    }

    public String getHolder(){
	return currentHolder;
    }

    public void setHolder(String h){
	currentHolder = h;
    }

    public String getdueDate(){
	return dueDate;
    }

    public void setdueDate(String d){
	dueDate = d;
    }

    public void checkout(String patron, String due){
	currentHolder = patron;
	dueDate = due;
    }

    public void returned() {
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus() {
	if (currentHolder != null) {
	    return currentHolder + ", " + dueDate;
	}
	else {
	    return "Book available on Shelves";
	}
    }

    public String toString() {
	return super.toString() + ", " + currentHolder + ", " + dueDate;
    }

}
