class P1
{
    public static void main(String args[])
    {
       int a = 6000;
       int b = 0;
       try{
          int c =a/b;
          System.out.println(c);
       }
       catch(Exception e)
       {
           System.out.println("Failed to divde\n");
           System.out.println(e);
       }
       System.out.println("The end");
    }
}
