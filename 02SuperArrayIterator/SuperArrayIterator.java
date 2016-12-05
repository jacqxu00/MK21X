import java.util.*;

public class SuperArrayIterator implements Iterator<String> {
    public SuperArray superArray;
    public int element;
    
    public SuperArrayIterator(SuperArray s, int i){
	superArray = s;
	element = i;
    }

    public boolean hasNext(){
	return element < superArray.size();
    }

    public String next(){
	if(hasNext()){
	    element++;
	    return superArray.get(element-1);
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
