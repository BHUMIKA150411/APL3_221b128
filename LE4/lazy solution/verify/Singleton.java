/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Singleton
{
    private static Singleton uniqueInstance;
    static int count = 0;
    private Singleton(){
        count++;
    }
    public static Singleton getInstance() {
        if(uniqueInstance == null) 
        {
            uniqueInstance = new Singleton();
            System.out.println("New Object Created");
        }
        System.out.println("Count : " + count);
        return uniqueInstance;
    }
    
}
