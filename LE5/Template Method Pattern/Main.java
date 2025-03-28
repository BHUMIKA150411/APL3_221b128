/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main
{
	public static void main(String[] args) {
		Beverage b=new Whisky();
		b.templateMethod(30);
		b=new Beer();
		b.templateMethod(300);
		b=new Rum();
		b.templateMethod(40);
	}
}