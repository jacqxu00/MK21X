public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;

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
	  }
      }	  
      else {
	  throw new IllegalArgumentException("zip code must be 5 digits long");
      }
  }

// postcondition: computes and returns the check sum for _zip
  private static int checkSum(String zip){
      int sum = 0;
      for (int i = 0; i < 5; i++) {
	  sum = sum+ Integer.parseInt(zip.substring(i, i+1));
      }
      return sum % 10;
  }

  private static String intToCode(int num) {
      String[] codes = new String[10];
      codes = 1  {"||:::",
		  ":::||",
		  "::|:|",
		  "::||:",
		  ":|::|",
		  ":|:|:",
		  ":||::",
		  "|:::|",
		  "|::|:",
		  "|:|::"};
      return codes[num];
  }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      String ans = _zip + _checkDigit + " ";
      for (int i = 0; i < 5; i++) {
	  String nextNum = _zip.substring(i,i+1);
	  ans += inttoCode(Integer.parseInt(nextNum));
	  }
      }
      return ans;
  }


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
      return this.toString().compareTo(other.toString());
  }

  public static toCode(String zip) {
      if (zip.length() != 5) {
	  throw new IllegalArgumentException("zip code must be 5 digits long");
      }
      else try {
	  String ans = "";
	  for (int i = 0; i < 5; i++) {
	      String nextNum = _zip.substring(i,i+1);
	  }
	  return ans;
      }
      catch (NumberFormatException e) {
	  throw e("invalid zip");
      }
  }

  public static toZip(String code) {

  }
}
