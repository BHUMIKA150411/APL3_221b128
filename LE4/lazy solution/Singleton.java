/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Singleton{
    private static Singleton UniqueInstance;
    private Singleton(){}
        public static Singleton getInstance(){
            if(UniqueInstance==null)
            UniqueInstance=new Singleton();
            return UniqueInstance;
    }
    
}