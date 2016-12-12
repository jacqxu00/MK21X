import java.lang.*;
import java.util.*;

public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if (zip.length() == 5) {
	  boolean ans = true;
	  for (int i = 0; i < 5; i++) {
	      ans = ans && Character.isDigit(zip.charAt(i));
	  }
	  if (ans) {
	  _zip = zip;
	  }
	  else {
	      throw new IllegalArgumentException("zip code contains at least one nondigit");
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

  private static String intToCode(String num) {
      ArrayList<String> codes = new ArrayList<String>();
      codes.add("||:::");
      codes.add(":::||");
      codes.add("::|:|");
      codes.add("::||:");
      codes.add(":|::|");
      codes.add(":|:|:");
      codes.add(":||::");
      codes.add("|:::|");
      codes.add("|::|:");
      codes.add("|:|::");
      return codes.get(Integer.parseInt(num));
  }

    private static String codeToInt(String code) {
      ArrayList<String> codes = new ArrayList<String>();
      codes.add("||:::");
      codes.add(":::||");
      codes.add("::|:|");
      codes.add("::||:");
      codes.add(":|::|");
      codes.add(":|:|:");
      codes.add(":||::");
      codes.add("|:::|");
      codes.add("|::|:");
      codes.add("|:|::");
      return ""+ codes.indexOf(code);
    }
    

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      String ans = _zip + checkSum(_zip) + " " + toCode(_zip);
      return ans;
  }

 
  public int compareTo(Barcode other){
      return this.toString().compareTo(other.toString());
  }

  public static String toCode(String zip) {
      String ans = "|";
      if (zip.length() != 5) {
	  throw new IllegalArgumentException("zip code must be 5 digits long");
      }
      boolean value = true;
      for (int i = 0; i < 5; i++) {
	  value = value && Character.isDigit(zip.charAt(i));
      }
      if (!value) {
	  throw new NumberFormatException("zip code contains at least one nondigit");
      }
      else {
	  for (int i = 0; i < 5; i++) {
	      String nextNum = zip.substring(i,i+1);
	      ans += intToCode(nextNum);
	  }
	  ans += intToCode(""+checkSum(zip))+"|";
	  return ans;
      }
  }

  public static String toZip(String code) {
      String ans = "";
      if (code.length() != 32) {
	  throw new IllegalArgumentException("incorrect length of barcode");
      }
      if (code.charAt(0)!= '|' || code.charAt(31)!= '|') {
	  throw new IllegalArgumentException("incorrect guardrails");
      }
      boolean value = true;
      for (int i = 0; i < 32; i++) {
	  value = value && (code.charAt(i)=='|' || code.charAt(i)==':');
      }
      if (!value) {
	  throw new IllegalArgumentException("non-barcode characters are used");
      }
      boolean result = false;
      for (int i = 0; i < 6; i++) {
	  result = result || (codeToInt(code.substring(i*5+1,(i+1)*5+1)).equals("-1"));
	  ans += codeToInt(code.substring(i*5+1,(i+1)*5+1));
      }
      if (result) {
	  throw new IllegalArgumentException("encoded ints are invalid");
      }
      if (!(""+ans.charAt(5)).equals(""+checkSum(ans.substring(0,5)))) {
        throw new IllegalArgumentException("checksum is incorrect");
      }
      else return ans.substring(0,5);
  }
}
