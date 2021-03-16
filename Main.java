class Main {
  public static void main(String[] args) {
  ReverseNumber r = new ReverseNumber(234);

System.out.println(r.getNumber() + " reversed is " + r.getReverse() + " ");

r.setNumber(10000);

System.out.println(r.getNumber() + " reversed is " + r.getReverse() + " ");

r.setNumber(111);

System.out.println(r.getNumber() + " reversed is " + r.getReverse() + " ");

r.setNumber(9005);

System.out.println(r.getNumber() + " reversed is " + r.getReverse() + " ");

r.setNumber(84645);

System.out.println(r.getNumber() + " reversed is " + r.getReverse() + " ");

r.setNumber(8547);

System.out.println(r.getNumber() + " reversed is " + r.getReverse() + " ");

r.setNumber(123456789);

System.out.println(r.getNumber() + " reversed is " + r.getReverse());  
  }
}
