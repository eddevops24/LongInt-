





public class LongInt extends MainLongInt {





	private final int [] array;

	private final int sign;

	private int[] arr;

	private int []longInt;

	private int []longIntAdd;

	 private int signstat=3;

	 LongInt lot;

	

	

	









	public LongInt(int sign, int [] array){ 



		this.sign=sign;



		arrAssign(this.array=array);



	}





	public void setArr(int[]arr){



		this.arr=arr;



	}

	public int[] getArr(){

		return arr;



	}

	public void arrAssign(int[] in){



		//String []p=new String[in.length];





		int a=in.length%8; //gets the remainder

		int f=in.length/8; // division to determine how many index new array will have

		if(a!=0){ //if a!=0 then we need to add one to index variabless

			f=f+1;

		}



		int []store =new int[f];// initializin string array



		int b=0;

		int c=1;

		int d=8;

		int z=0;





		for(int i=0;i<f;i++){



			int x=(d*c);

			int base=10000000;

			int m=1;

			if(x>in.length){

				z=in.length%8;

				x=(x-d)+z;

			}

			for(int j=in.length-x;j<in.length-(d*b);j++){

				base=(base/m);

				int num=base*(in[j]*this.sign);

				store[i]+=num;

				m=1*10;

			}

			//System.out.println(store[i]);

			//int[]B={3,5,0,0,0,3,2,7,4,5,9,4,8,4,7,4,5,4,3,1,7,8,9,0}; 		



			c++;

			b++;



		}

		longInt=store;

		

		





	}

	//} 











	public void print() { //print out of original arrays longInt form

		String result ="";

		if(longInt[0]<1){

			for(int j=0;j<=longInt.length-2;j++){

				longInt[j]=longInt[j]*this.sign;

			}

		}

		for(int i=longInt.length-1;i>=0;i--){

			

			result+=Integer.toString(longInt[i]);



		}

		System.out.println(result);

	}

	public void printAdd(int[]num) {  //print out of added arrays in longInt form

		int[]num2=num;

		String g="0000000";

		String result ="";

		if(num2[0]<1){

			for(int j=0;j<=num2.length-2;j++){

				num2[j]=num2[j]*signstat;

				

				

			}

			

		}

		for(int i=num2.length-1;i>=0;i--){

			if(num2[i]==0){

				result+=g;

			}

			result+=Integer.toString(num2[i]);

		}

		System.out.println(result);

		

	}

	public boolean equalTo(LongInt other) { 

		boolean isStatus=false;

		if(this.sign==other.sign && this.longInt.length==other.longInt.length){//check if greater

			for(int i=0;i<other.longInt.length;i++){

				if(this.longInt[i]==other.longInt[i]){

					isStatus=true;

				}

			}

		}

		else{isStatus=false;}

		return isStatus;

	}

	public boolean lessThan(LongInt other) { 

		boolean isStatus=false;

		if(this.sign<other.sign){//check if less than

			isStatus=true;

		}else if(this.sign+other.sign==-2&&this.longInt.length>other.longInt.length){

			isStatus=true;

		}else if(this.sign+other.sign==2&&this.longInt.length<other.longInt.length){

			isStatus=true;

		}



		return isStatus;

	} 

	public boolean greaterThan(LongInt other) { 

		boolean isStatus=false;



		if(this.sign+other.sign==2&&this.longInt.length>other.longInt.length){//check if greater

			isStatus=true;

		}if(this.sign+other.sign==-2&&this.longInt.length<other.longInt.length){//check if greater

			isStatus=true;

		}

		else if(this.sign>other.sign){

			isStatus=true;}

		else{for(int i=0;i<this.longInt.length;i++){

			if(this.longInt[i]>other.longInt[i]){

				isStatus=true;

			}

		}

		}

		return isStatus;



	

	}

	

	

	public LongInt add(LongInt other) { 

          int []z;

          int p=1;

			int n=-1;

			int[]totalSum;

			LongInt j;

			

		if(this.longInt.length>=other.longInt.length){ //check if long ints are of diff size

			

			z=new int[this.longInt.length];

			for(int i=0;i<other.longInt.length;i++){

				z[i]=other.longInt[i];

			}

		}else{

			

			z=new int[other.longInt.length];

			for(int i=0;i<this.longInt.length;i++){

					z[i]=this.longInt[i];

				

		}

		}



	    if(z.length==other.longInt.length){ // 1st if statement for arrays of == size 

		

	    	int [] total=new int[z.length];



		int carry = 0;

        int sum=0;

		for ( int k = 0; k <z.length; k++)



		{



			 sum = z[k] + other.longInt[k] + carry;

			

			if(sum<1){

				sum=sum+100000000;

			}

			



			total[k] = sum%100000000;



			carry = sum/100000000;



			//System.out.println(total[k]);



		}

		totalSum=new int[z.length];

		for(int i=0;i<total.length;i++){

		totalSum[i]=total[i];

		}

		if(totalSum[0]<1){

  		  j=new LongInt(n,totalSum);

  		  signstat=n;

  	}else{

  		 j=new LongInt(p,totalSum);

  		  signstat=p;

  	}

	    }//end of 1st array

	    else{

	    	

	    	int [] total=new int[z.length];



			int carry = 0;

			int sum=0;

			for ( int k = 0; k <z.length; k++)



			{



				 sum = z[k] + this.longInt[k] + carry;

				

				 if(z[k]<this.longInt[k]){

						sum=sum+100000000;

					}


				



				total[k] = sum%100000000;



				carry = sum/100000000;



				//System.out.println(total[k]);



			}

			totalSum=new int[z.length];

			for(int i=0;i<total.length;i++){

			totalSum[i]=total[i];

			}

}

	    	if(totalSum[0]<1){

	    		  j=new LongInt(n,totalSum);

	    		  signstat=n;

	    	}else{

	    		 j=new LongInt(p,totalSum);

	    		 signstat=p;

	    		 

	    	}

	    	lot=j;
	    	
	    	
	       lot.printAdd(totalSum);

	       lot.longInt=totalSum;

	        return lot;

}



	public LongInt subtract(LongInt other) {

		 int []z;

         int p=1;

			int n=-1;

			int[]totalSum;

			LongInt j;

			

		if(this.longInt.length>=other.longInt.length){ //check if long ints are of diff size

			

			z=new int[this.longInt.length];

			for(int i=0;i<other.longInt.length;i++){

				z[i]=other.longInt[i];

			}

		}else{

			

			z=new int[other.longInt.length];

			for(int i=0;i<this.longInt.length;i++){

					z[i]=this.longInt[i];

				

		}

		}



	    if(z.length==other.longInt.length){ // 1st if statement for arrays of == size 

		

	    	int [] total=new int[z.length];



		int carry = 0;

       int sum=0;

		for ( int k = 0; k <z.length; k++)



		{



			 sum = z[k]* - other.longInt[k] - carry;

			

			 /*if(z[k]<this.longInt[k]){

					sum=sum+100000000;

				}
*/
			



			total[k] = sum%100000000;



			carry = sum/100000000;



			//System.out.println(total[k]);



		}

		totalSum=new int[z.length];

		for(int i=0;i<total.length;i++){

		totalSum[i]=total[i];

		}

		if(totalSum[0]<1){

 		  j=new LongInt(n,totalSum);

 		  signstat=n;

 	}else{

 		 j=new LongInt(p,totalSum);

 		  signstat=p;

 	}

	    }//end of 1st array

	    else{

	    	

	    	int [] total=new int[z.length];



			int carry = 0;

			int sum=0;

			for ( int k = 0; k <z.length; k++)



			{



				 sum =  this.longInt[k]-z[k] - carry;

				

				/*if(z[k]>this.longInt[k]){

					sum=sum+100000000;

				}*/

				



				total[k] = sum%100000000;



				carry = sum/100000000;



				//System.out.println(total[k]);



			}

			totalSum=new int[z.length];

			for(int i=0;i<total.length;i++){

			totalSum[i]=total[i];

			}

}

	    	if(totalSum[0]<1){

	    		  j=new LongInt(n,totalSum);

	    		  signstat=n;

	    	}else{

	    		 j=new LongInt(p,totalSum);

	    		 signstat=p;

	    		 

	    	}

	    	lot=j;

	      
	      
	       lot.longInt=totalSum;
	       lot.signstat=signstat;
	       lot.printAdd(totalSum);
	        return lot;

}

		

	}





