//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

 ReverseNumber() {

number = 0;

}
 
ReverseNumber(int num) {

number = num;

}

public int getNumber() {

return number;

}

public void setNumber(int number) {

this.number = number;

}


 public int getReverse()
 {
  int rev=0, temp = number;
    while (temp!= 0) {
       rev = rev * 10 + temp % 10;
       temp = temp / 10;
    }
  return rev;
 }

public String toString() {

return "ReverseNumber [number=" + number + "]";

} 
 
}
