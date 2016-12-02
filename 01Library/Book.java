public class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book(){
	this("John Locke","The Social Contract","12-41256-13545");
    }

    public Book(String a, String t, String i){
	author = a;
	title = t;
	ISBN = i;
    }

    public String getAuthor(){
	return author;
    }

    public void setAuthor(String a){
	author = a;
    }

    public String getTitle(){
	return title;
    }

    public void setTitle(String t){
	title = t;
    }

    public String getISBN(){
	return ISBN;
    }

    public void setISBN(String i){
	ISBN = i;
    }

    public String toString(){
	return author + ", " + title +  ", " + ISBN;
    }

}
