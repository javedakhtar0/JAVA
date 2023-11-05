 // in this code we used non stastic methods,static method ,nonstatic variables and static variables also:-


//declaire a class name method_1   
class method_1{ 

    //declairation and initialisatin non static variable which name is num1              
     int num1=20; 

     //declairation and initialisatin static variable which name is num2    
    static int num2=10; 

        //declaired a nonStatic method(addition()) which name is addition
        void addition()
        {
            System.out.println("Addition of num1 and num2: "+(num1+num2));
            num1++;
            num2++;
        }

        //declaired a Static method(subtraction()) which name is subtraction
        static void subtraction()
        {

            //wuthout creat
            method_1 ob1=new method_1();
            System.out.println("Subtraction of num1 and num2: "+(ob1.num1-ob1.num2));
        }

         public static void main(String args[]){

            method_1 ob1=new method_1();
            method_1 ob2=new method_1();
            
            ob2.addition(); 
            subtraction();
            ob2.subtraction();
            method_1.subtraction();
            ob1.addition();
    }

}