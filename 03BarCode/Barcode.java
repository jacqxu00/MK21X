public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      boolean ans = true;
      if (zip.length() == 5) {
	  for (int i = 0; i < 5; i++) {
	      ans = ans && Character.isDigit(_zip.charAt(i));
	  }
	  if (ans) {
	  _zip = zip;
	  _checkDigit = checkSum();
	  }
      }	  
      else {
	  throw new RuntimeException("zip code must be 5 digits long");
      }
  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      Barcode copy = new Barcode(_zip);
      return copy;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int sum = 0;
      for (int i = 0; i < 5; i++) {
	  sum = sum+ Integer.parseInt(_zip.substring(i, i+1));
      }
      return sum % 10;
  }

  private String intToBar(int digit){
      if (digit == 1) {
	  return ":::||";
      }
      if (digit == ) {
	  return "::|:|";
      }
      if (digit == 3) {
	  return "::||:";
      }
      if (digit == 4) {
	  return ":|::|";
      }
      if (digit == 5) {
	  return ":|:|:";
      }
      if (digit == 6) {
	  return ":||::";
      }
      if (digit == 7) {
	  return "|:::|";
      }
      if (digit == 8) {
	  return "|::|:";
      }
      if (digit == 9) {
	  return "|:|::";
      }
      if (digit == 0) {
	  return "||:::";
      }
  }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      String ans = _zip + _checkDigit + " ";
      for (int i = 0; i < 5; i++) {
	  ans += intToBar(Integer.parseInt(_zip.substring(i, i+1)));
      }
      return ans;
  }


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}
