class Abc
{
 public static void main(String args[])
 {
  String s = "Chandni";
 //conacate method  
System.out.println(s.concat("Mishra"));
// character at index
  System.out.println(s.charAt(2));
//to print length
  System.out.println(s.length());
  String s1 = "Welcome";
  String s3 = "welcome";
// to check strings are equal or not
  System.out.println(s.equals(s1));
   System.out.println(s1.equals(s3));
   System.out.println(s1.equalsIgnoreCase(s3));
   System.out.println(s.indexOf('n'));
   System.out.println(s.lastIndexOf('a'));
   System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
   // trim
  String str = "    XYZ    ";
  System.out.println(str.trim());
  System.out.println(s.isEmpty());
  System.out.println(s.substring(2));
  System.out.println(s.substring(2,4));
}
}
