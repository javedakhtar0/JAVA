interface inf1 {
    int num=20;
    void m1();
    void m2();
}

class interface_in implements inf1{
    public void m1(){
        System.out.println("m1() from interface_in");
    }
    public void m2(){
        System.out.println("m2() from interface_in");
    }

    public static void main(String args[])
    {
        interface_in ob1=new interface_in();
        ob1.m1();
        ob1.m2();

        //in 
       System.out.println(ob1.num);
    }
}


