public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;
  
    public SuperArray() {
	data = new String[10];
 	size = 0;
    }
    
    public SuperArray(int initCapac) {
	if (initCapac < 0) {
	    throw new IllegalArgumentException("parameter: "+ initCapac);
	}
	data = new String[initCapac];
	size = 0;
    }

    public int size(){
	return size;
    }

    public boolean add(String n){
	if(size == data.length){
	    this.grow();
	}
	data[size] = n;
	size++;
	return true;
    }

    public String get (int index) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException("parameter: "+ index);
	}
	return data[index];
    }

    public void clear() {
	String[] temp = new String[data.length];
	data = temp;
	size = 0;
    }

    public boolean isEmpty() {
	return size == 0;
    }
    
    public String set(int index, String element) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException("parameter: "+index);
	}
	data[index] = element;
	return element;
    }

    private void grow(){
	String[] temp = new String[size*2+1];
	for (int i = 0; i < size; i++) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public void add(int index, String element){
        if (index < 0 || index > size()) {
	    throw new IndexOutOfBoundsException("parameter: "+index);
	}
	else if(size == data.length){
	    this.grow();
	}
	for(int i = size; i > index; i--){
	    data[i] = data[i-1];
	}
	data[index] = element;
	size++;
    }

    public String remove(int index){
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException("parameter: "+index);
	}
	String element = data[index];
	for(int i = index; i < size; i++){
	    data[i] = data[i+1];
	}
	size--;
	return element;
    }
    
    public Iterator<String> interator(){
	return SuperArrayIterator(this, 0);
    }

    public String[] toArray(){
	String[] shorter = new String[size];
	for(int i = 0; i < size; i++){
	    shorter[i] = data[i];
	}
	return shorter;
    }

    public int indexOf(String n){
	for(int i = 0; i < size; i++){
	    if(n.equals(data[i])){
		return i;
	    }
	}
	return -1;
    }
    public int lastIndexOf(String n){
	for(int i = size-1; i >= 0; i--){
	    if(n.equals(data[i])){
		return i;
	    }
	}
	return -1;
    }

    public String toString(){
	String ans = "[ ";
	for (int i = 0; i < size-1; i++) {
	    ans = ans + data[i] + ", ";
	}
	ans = ans + data[size-1] + "]";
	return ans;
    }

    public String toStringDebug(){
        String ans = "[ ";
	for(int i = 0; i < size; i++) {
	    if (i == (data.length-1)) {
		ans += data[i];
	    }
	    else {
		ans += data[i] + ", ";
	    }
	}
	for (int i = size; i < data.length; i++) {
	    if(i == (data.length-1)) {
		ans += "_";
	    }
	    else {
		ans += "_, ";
	    }
	}
	return ans + "]";
    }
}
