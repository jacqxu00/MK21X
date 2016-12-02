import java.util.*;

public class SuperArrayIterator implements Iterator<String> {
    public SuperArray superArray;
    public int element;
    
    public SuperArrayIterator(SuperArray s, int i){
	superArray = s;
	element = i;
    }

    public boolean hasNext(){
	return element < superArray.size()-1;
    }

    public String next(){
	if(hasNext()){
	    element++;
	    return superArray.get(element);
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
