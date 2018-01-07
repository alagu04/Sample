package org.project.controller;

public class Test 
{
	
	public static void main(String a[]){
		int num=1;
		int highValue=10;
		int midVal=highValue;
		for(int i=num;i<=highValue;i++){
			
			for(int ii=1;ii<=midVal;ii++){
				System.out.print(" ");
			}
			int localval=i;
			localval--;
			boolean indicator=false;
			while(i!=localval){
				//localval++;
				 if(localval==0){
					 System.out.print(localval+1);
					 break;
				 }else{
					 localval++;
					 System.out.print(localval+"");
				 }
				 
				if(localval==1){
					indicator=true;
				}
				if(indicator){
					localval++;
				}else{
					localval--;
				}
				
			}
			//System.out.print(i);
			/*for(int ii=1;ii<=midVal;ii++){
				System.out.print(" ");
			}*/
			System.out.println();
			midVal--;
		}
	}

}
