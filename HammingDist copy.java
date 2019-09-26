import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HammingDist{

	// default constructor
	public HammingDist() {

	}
	public HammingDist(String ham1, String ham2) {
		this.ham1 = ham1;
		this.ham2= ham2;
	}
	
	String ham1;
	String ham2;
	private String Norman = "NRMN" ;

	String [] hamming = new String[4];
	private int capacity = 4;

	

	public void read(String filename) throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		//System.out.println("e");
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		String parse = "";
		int i= 0;
		info = br.readLine();
		while(info != null ) {
			/**capacity starts at four becauce the array has 4 elements
			 * so when i hits four the expandArray method will be called
			 * and cappacity will increase by one.
			 */
			if(i == capacity) {
				expandArray();
				capacity++;
			}

			

			// trying to break up string in mesonet.txt
			parse =  (String) info.subSequence(4,8);
		
			//System.out.println(parse);
			hamming[i] = parse;

			i++;
			info = br.readLine();
		}
	
		//This closes bufferReader
		br.close();
	}

	
	public void expandArray(){

		String[] temp = new String[hamming.length + 1];
		System.arraycopy(hamming, 0, temp, 0, hamming.length);
		hamming = temp;
	}



	public int showDistance() {
		int distance = 0;
		
		
		// sort through the String and compare.
		//if the String doesnt equal then add one to distance.
		for (int i = 0; i < ham1.length(); i++){
			if (ham1.charAt(i) !=  Norman.charAt(i)) {
				distance++;
			}
		}

		return distance;
	}

	public int showDistanceTwo() {
		int dist = 0;
		for ( int i = 0; i < ham2.length(); i++ ){
			if (ham2.charAt(i) !=  Norman.charAt(i)) {
				dist++;
			}
		}
		return dist;
	}


	public int sortArray() {
		int counter1 = 0;

		int newDist = 0;

		for(int i = 0; i < hamming.length ; i++ ) {
			// compare each element of the array to the given String
			String temp = hamming[i];
		
			
			for(int j = 0; j < ham1.length() ; j++) {
				if(ham1.charAt(j) !=  temp.charAt(j)) {
					newDist++;
				}
			}
			//the counter shows how many same distance are in mesonet.txt			
			if(showDistance() == newDist) {
				counter1++;
			}
			newDist = 0;
		}
		return counter1;
	}

	public int sortArrayTwo(){
		int counter2 = 0;
		int newDist2 = 0;
		String temp2 = "";	
		for(int i = 0  ; i < hamming.length ; i++ ) {

			temp2 = hamming[i];
			
			for(int j = 0; j < ham2.length() ; j++) {

				if(ham2.charAt(j) !=  temp2.charAt(j)) {
					newDist2++;
				}

				if(showDistanceTwo() == newDist2) {
					counter2++;
				}

			}
			newDist2 = 0;

		}
		return counter2;


	}

	public String toString() {
		String str1 = "The";
		str1 = str1.concat(" Hamming Distance between Norman and " + ham1 +
				" is " + showDistance() + " and for " + ham2 + ": " + showDistanceTwo()+ 
				".\n" + "For "+ ham1 + ", number of stations with Hamming Distance " + 
				showDistance() + " is " + sortArray() + ", and\nfor " + ham2 + 
				", number of stations with Hamming Distance "
				+  showDistanceTwo() + " is " + sortArrayTwo() + ".");

		return str1;
	}
}


