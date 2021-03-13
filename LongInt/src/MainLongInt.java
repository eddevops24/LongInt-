public class MainLongInt {







	public static void main(String []args){







		int[]A= {1,4,2,3,5,5,0,0,0,0,0,0,0,0,1,0,0,5,6,8,1,0,0,0,0,0,5,4,5,9,3,4,5,2,9,0,7,7,1,1,5,6,8,3,5,9};



		int[]B={-3,5,0,0,0,3,2,7,4,5,9,4,8,4,7,4,5,4,3,1,7,8,9,0}; 



		int[]C={2,9,3,0,2,3,9,0,2,3,4,7,0,2,9,7,3,4,0,2,9,7,3,4,2,0,9,3,7,4,2,0,9,7,3,4,2,0,9,3,7,4,2,0,9,3,7,2,3,4,8,7,2,3,4,9,8,7,2,9,3,4,8,7,2,8,9,3,4,7,2,8,9,3,7,4,9,2};



		int[]D={-9,8,5,3,4,3,4,2,9,8,3,7,4,2,9,8,7,3,4,2,9,8,7,3,3,9,2,3,4,0,9,8,2,3,0,4,9,8,2,0,3,8,9,4,2,0,9,9,2,8,3,7,4,6,6,2,3,4,2,3,4,2,3,4,2,3,5,6,7,2,3,4,2,3,4,2,3};



		int[]E={8,4,3,6,4,1,3,1,6,8,4,3,8,6,1,8,3,5,1,3,5,1,6,8,4,6,9,4,8,3,5,4,3,4,8,9,4,3,6,4,3,5,1,8,4,6,8,4,3,4,3,5,1,6,8,4,8,4,3,5,1,6,8,4,6,8,4,3,1,5,3,8,4,6,8,4,3,1,3,8,4,6,8,1,3,1,5,3,8,4,3,1,3,5,1,3,8,4,1,3,5,1,3,8,4,3,8,1,3,5,1,3,8,1,3,1,3,8,4,3,8,4,3,5,1,5,3,4,5,4,1,5,4,5,1,5,1,5,1,5,1,3,1,4,1,5,9,2,6,5,4,5,4,3,5,1,5,3,1,6,8,4,8,6,1,3,2,4,2,5,8,7,5,6,1,5,1,6,5,1,1,2,3,3,2,4,6,1,7,4,5,6,1,2,7,6,5,2,1,6,7,2,1,6,2,4,1,6,2,7,4,1,2,3,0,7,6,5,2,7,6,1,2};









		int a=0;



		///////////Array of ints A///////////////

		for (int i=0;i<A.length;i++){

			a=0;

			int m=-1;

			if(A[i]<0){

				A[i]=A[i]*m;

				a=1;

				break;

			}

		}



		if(a==1){

			int[] H=A;

			int m=-1;

			LongInt a1=new LongInt(m,H);

		}



		else{



			int []H=A;

			int m=1;

			LongInt a1=new LongInt(m,H);

			System.out.println("-TEST CASE 2:Print each Long Integer to standard output using print().");

			System.out.println("This is the standard output of array A");

			a1.print();



		}



		////////////////////Array of ints B///////////////////////

		for (int i=0;i<B.length;i++){

			a=0;

			int m=-1;

			if(B[i]<0){

				B[i]=B[i]*m;

				a=1;

				break;

			}

		}



		if(a==1){

			int[] H=B;

			int m=-1;

			LongInt b1=new LongInt(m,H);

			//LongInt a1=new LongInt(1,A);

			//LongInt c1=new LongInt(1,C);

			//LongInt d1=new LongInt(-1,D);

			//LongInt e1=new LongInt(1,E);





			System.out.println("This is the standard output of array B");

			//System.out.println("is B=,<, or >than A?");

			//System.out.println("is B==A"+b1.equalTo(a1));

			//System.out.println("is B<A"+b1.lessThan(a1));

			//System.out.println("is B>A"+b1.greaterThan(a1));



			b1.print();

			//System.out.println("Addition of Arrays A+B+C");

			//e1.add(d1.add(c1.add(b1.add(a1))));





			//b1.print();







		}



		else{



			int []H=B;

			int m=1;

			LongInt b1=new LongInt(m,H);

		}



		////////////////////Array of ints C///////////////////////

		for (int i=0;i<C.length;i++){

			a=0;

			int m=-1;

			if(C[i]<0){

				C[i]=C[i]*m;

				a=1;

				break;

			}

		}



		if(a==1){

			int[] H=C;

			int m=-1;

			LongInt c1=new LongInt(m,H);

			System.out.println("This is the standard output of array C");



		}



		else{



			int []H=C;

			int m=1;

			LongInt c1=new LongInt(m,H);

			System.out.println("This is the standard output of array C");

			c1.print();

		}



		////////////////////Array of ints D///////////////////////

		for (int i=0;i<D.length;i++){

			a=0;

			int m=-1;

			if(D[i]<0){

				D[i]=D[i]*m;

				a=1;

				break;

			}

		}



		if(a==1){

			int[] H=D;

			int m=-1;

			LongInt l=new LongInt(m,H);

			System.out.println("This is the standard output of array D");

			l.print();

		}



		else{



			int []H=D;

			int m=1;

			//LongInt d1=new LongInt(m,H);

		}

		////////////////////Array of ints E///////////////////////

		for (int i=0;i<E.length;i++){

			a=0;

			int m=-1;

			if(E[i]<0){

				E[i]=E[i]*m;

				a=1;

				break;

			}

		}



		if(a==1){

			int[] H=E;

			int m=-1;

			//LongInt e1=new LongInt(m,H);

			System.out.println("This is the standard output of array E");





		}



		else{



			int []H=E;

			int m=1;

			LongInt e1=new LongInt(m,H);

			System.out.println("This is the standard output of array E");

			e1.print();

		}

		//////////////////////////////////////



		int[]A1= {1,4,2,3,5,5,0,0,0,0,0,0,0,0,1,0,0,5,6,8,1,0,0,0,0,0,5,4,5,9,3,4,5,2,9,0,7,7,1,1,5,6,8,3,5,9};



		int[]B1={3,5,0,0,0,3,2,7,4,5,9,4,8,4,7,4,5,4,3,1,7,8,9,0}; 



		int[]C1={2,9,3,0,2,3,9,0,2,3,4,7,0,2,9,7,3,4,0,2,9,7,3,4,2,0,9,3,7,4,2,0,9,7,3,4,2,0,9,3,7,4,2,0,9,3,7,2,3,4,8,7,2,3,4,9,8,7,2,9,3,4,8,7,2,8,9,3,4,7,2,8,9,3,7,4,9,2};



		int[]D1={9,8,5,3,4,3,4,2,9,8,3,7,4,2,9,8,7,3,4,2,9,8,7,3,3,9,2,3,4,0,9,8,2,3,0,4,9,8,2,0,3,8,9,4,2,0,9,9,2,8,3,7,4,6,6,2,3,4,2,3,4,2,3,4,2,3,5,6,7,2,3,4,2,3,4,2,3,0};



		int[]E1={8,4,3,6,4,1,3,1,6,8,4,3,8,6,1,8,3,5,1,3,5,1,6,8,4,6,9,4,8,3,5,4,3,4,8,9,4,3,6,4,3,5,1,8,4,6,8,4,3,4,3,5,1,6,8,4,8,4,3,5,1,6,8,4,6,8,4,3,1,5,3,8,4,6,8,4,3,1,3,8,4,6,8,1,3,1,5,3,8,4,3,1,3,5,1,3,8,4,1,3,5,1,3,8,4,3,8,1,3,5,1,3,8,1,3,1,3,8,4,3,8,4,3,5,1,5,3,4,5,4,1,5,4,5,1,5,1,5,1,5,1,3,1,4,1,5,9,2,6,5,4,5,4,3,5,1,5,3,1,6,8,4,8,6,1,3,2,4,2,5,8,7,5,6,1,5,1,6,5,1,1,2,3,3,2,4,6,1,7,4,5,6,1,2,7,6,5,2,1,6,7,2,1,6,2,4,1,6,2,7,4,1,2,3,0,7,6,5,2,7,6,1,2};



		LongInt a1=new LongInt(1,A1);

		LongInt b1=new LongInt(-1,B1);

		LongInt c1=new LongInt(1,C1);

		LongInt d1=new LongInt(-1,D1);

		

		LongInt e1=new LongInt(1,E1);

		System.out.println("-TEST CASE 3: For each Long Integer compare it to A-I using equalTo, lessThan, greaterThan (i.e., apply all three methods pair-wise, including on itself).");

		System.out.println("is A=,<, or >than A?");

		System.out.println("A==A"+a1.equalTo(a1));

		System.out.println("A<A"+a1.lessThan(a1));

		System.out.println("A>A"+a1.greaterThan(a1));

		

		System.out.println("is A=,<, or >than B?");

		System.out.println("A==B"+a1.equalTo(b1));

		System.out.println("A<B"+a1.lessThan(b1));

		System.out.println("A>B"+a1.greaterThan(b1));

		

		System.out.println("is A=,<, or >than C?");

		System.out.println("A==C"+a1.equalTo(c1));

		System.out.println("A<C"+a1.lessThan(c1));

		System.out.println("A>C"+a1.greaterThan(c1));

		

		System.out.println("is A=,<, or >than D?");

		System.out.println("A==D"+a1.equalTo(d1));

		System.out.println("A<D"+a1.lessThan(d1));

		System.out.println("A>D"+a1.greaterThan(d1));

		

		System.out.println("is A=,<, or >than E?");

		System.out.println("A==E"+a1.equalTo(e1));

		System.out.println("A<E"+a1.lessThan(e1));

		System.out.println("A>E"+a1.greaterThan(e1));

		

		

		System.out.println("TEST CASE 4:For each LongInt add it to every other LongInt (one at a time) and print the result.");

		e1.add(d1.add(c1.add(a1.add(b1))));

		System.out.println("TEST CASE 4:For each LongInt subtract it to every other LongInt (one at a time) and print the result.");

		e1.subtract(d1.subtract(c1.subtract(a1.subtract(b1))));

		

        

        

        

        

        



	}



}	







