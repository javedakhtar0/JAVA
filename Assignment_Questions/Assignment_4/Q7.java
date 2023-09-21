import java.io.*;
class Q7{
    public static void main(String args[])
    {
        Console c=System.console();
        int num=Integer.parseInt(c.readLine("Enter A Number:"));
        int rev=0,num1=0;
        int len=num;
        int l,count=0;
        while(len!=0)
        {
            len=len/10;
            count++;
        }
        l=count;
        for(int i=0; i<l; i++)
        {
          num1=num%10;
          
          rev=(rev*10)+num1;
          num=num/10;
        }
        System.out.println(" After reversing "+ rev);
    }
}