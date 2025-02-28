/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Singleton{
    private static Singleton UniqueInstance=new Singleton();
    private Singleton(){}
        public static Singleton getInstance(){
            return UniqueInstance;
    }
    
}