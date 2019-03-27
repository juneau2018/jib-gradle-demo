package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
	while(true)
	{
            System.out.println( "Hello World!" );
            System.out.println( "++++++++++" );
            Thread.sleep(1);
            System.out.println( "Hello World!" );
            System.out.println( "----------" );
            Thread.sleep(1);
	}
    }
}
