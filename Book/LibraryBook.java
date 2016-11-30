public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	super(a,t,i);
	callNumber = c;
    }

    public String getcallNum() {
	return callNumber;
    }

    public void setcallNum(String c) {
	callNumber = c;
    }

    public abstract void checkout(String patron, String due);
    public abstract void returned();
    public abstract String circulationStatus();

    public int compareTo(LibraryBook a) {
	if (this.getcallNum().compareTo(a.getcallNum()) < 0) {
	    return -1;
	}
	else if (this.getcallNum().compareTo(a.getcallNum()) == 0) {
	    return 0;
	}
	else {
	    return 1;
	}
    }

    public String toString() {
	return getTitle() + ", " + getAuthor() + ", " + getISBN() + ", " + circulationStatus() + ", " + getcallNum();
    }
    
}
