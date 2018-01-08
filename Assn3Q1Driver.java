//Author Peter Adamson

public class Assn3Q1Driver{

	public static void main(String[] args){

		try{		
			int[] myArray = {956, 31, 1009, 78, 991, 1, 884, 12, 766, 750};
			Assn3Q1Sort.sort(myArray);
		}
		catch(Exception exp){
			System.out.println("An exception was thrown!\n\n" + exp);
		}
	}


}
