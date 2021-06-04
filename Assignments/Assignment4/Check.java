import  java.io.*;
class check {
   public  static  void main(String args[]) throws IOException {
       char ch;
BufferedReader inputstream = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter Charachter :");
       ch=(char) inputstream.read();
       if(Character.isDigit(ch))
           System.out.println("Entered Character is Digit");
       else if(Character.isUpperCase(ch))
       {
           System.out.println("Entered Character is Upper case");
           System.out.println("Lower Case Character is:-"+Character.toLowerCase(ch));
       }
       else if(Character.isLowerCase(ch))
       {
           System.out.println("Entered Character is Lower Case");
           System.out.println("Upper Case Character is:-"+Character.toUpperCase(ch));
       }
       else
           System.out.println("Entered Character is special char");

   }
}
