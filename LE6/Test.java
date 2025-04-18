/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test{
    public static void main (String args[]){
        Offering offering=new Coffee();
        offering=new Rum(offering);
        offering =new Rum(offering);
        System.out.println(offering.getName() + " " + offering.getPrice());
    }
}