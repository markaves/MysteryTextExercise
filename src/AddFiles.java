import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AddFiles {
	public static void main(String[] args) {
		
		
		String[] myFilename = new String[]{"left.txt", "right.txt"};
		ArrayList<String> leftFile = new ArrayList<>();
		ArrayList<String> rightFile = new ArrayList<>();
		ArrayList<Integer> total = new ArrayList<>();
		
		for (String filename : myFilename) {
			
		
			try (BufferedReader breader = new BufferedReader(new FileReader(filename))) {
			
				while (breader.ready()) {
					String line = breader.readLine();
					//System.out.println(line);
					String[] parts = line.split(" ");
					

					boolean numeric = true;
					for (String e : parts) {
						numeric = e.matches("-?\\d+(\\.\\d+)?");
						if (numeric) {
							if (filename.contains("left.txt")) {
								leftFile.add(e);
							}else {
								rightFile.add(e);	
							}
						}
					}
					
				}
			} catch (IOException e) {
				throw new RuntimeException("problem reading from file " + filename, e);
			}
		}
		
		Integer sum=0;
		int yourInt =0;
		char out;
		int cntr=1;
		for (int x=0; x<=leftFile.size()-1;x++)
		{
			
			total.add(Integer.parseInt(rightFile.get(x))+Integer.parseInt(rightFile.get(x)));
			yourInt=Integer.parseInt(rightFile.get(x))+Integer.parseInt(rightFile.get(x));
			
			yourInt=Integer.parseInt(leftFile.get(x))+Integer.parseInt(rightFile.get(x));
			if (cntr<=8) {
			System.out.print((char)yourInt);
			}else {
				System.out.println((char)yourInt);
			}
			cntr++;
			if (cntr==9) {
				cntr=1;
			}
			
		}
		
		
		
		
	}
}