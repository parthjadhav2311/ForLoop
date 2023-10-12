package com.prowings.basics.forloop;

public class ForLoopWithContinueLabel {

	public static void main(String[] args) {
		
		
		outer:
			for(int i=0;i<6;i++)
			{
				System.out.println("i="+i);
				
				inner:
				for(int j=0;j<5;j++)
				{
					
					if(i==2 || j==3 )
					{
						continue outer;
					}
					System.out.println("j="+j);
				}
					
			}
	}
}