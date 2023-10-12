package com.prowings.basics.forloop;

public class NestedForLoopWithBreak {
	
	public static void main(String[] args) {
		
		
		for(int i=0; i<=5;i++)
		{
			System.out.println("i ="+i);
			
			
			for(int j=0;j<=3;j++)
			{
				
				
				if(j==2)
				{
					break;
					
				}
				
				System.out.println("j ="+j);
				
				
				
			}
		}
	}

}
