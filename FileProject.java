package New;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileProject {

	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		int ch1,ch2;
		do {
			System.out.println("------------MENU-------------");
			System.out.println("1:To display files in current directory in asscending order.");
			System.out.println("2:To perform various file operations.");
			System.out.println("3.To exit the program.");
			System.out.println("Enter your choice:");
			ch1=sc.nextInt();
			switch(ch1) {
			case 1:	File path = new File(".");
					String files[] = path.list();
					Arrays.sort(files); 
					System.out.println("List of files  in the current directory:");
					for(int i=0; i<files.length; i++) {
						System.out.println(files[i]);
					}
					break;
			case 2: String fname;
					do{
					System.out.println("------------ SUB MENU-------------");
					System.out.println("1:To add a file in current directory.");
					System.out.println("2:To delete a file in current directory.");
					System.out.println("3.To search a file in current directory.");
					System.out.println("4.To go back to the previous menu.");
					System.out.println("Enter your choice:");
					ch2=sc.nextInt();
					switch(ch2) {
					case 1:System.out.println("Enter the file name to be created:");
							fname=sc.next();
							File tmp = new File(".", fname);
							boolean b=tmp.createNewFile();
							if(b==true) {
							System.out.println("File successfully created:");}
							else {
								System.out.println("File creation failed! Try Again.");
							}
							break;
					case 2:System.out.println("Enter the file name to be deleted:");
							fname=sc.next();
							 File fdel = new File(fname);
					          
						        if(fdel.delete())
						        {
						            System.out.println("File deleted successfully");
						        }
						        else
						        {
						            System.out.println("File deletion failed.");
						        }
							break;
					case 3:System.out.println("Enter the file name to be searched:");
							fname=sc.next();
							File p = new File(".");
							String fil[] = p.list();
							if(Arrays.asList(fil).contains(fname)){
							    System.out.println("File Found.");
							}
							else {
								System.out.println("File not found.");
							}
							break;
					case 4:System.out.println("Going back to previous menu.");
							break;
					default:System.out.println("Invalid choice! Please try again.");
					
					
					}
					}while(ch2!=4);
					break;
			case 3:System.out.println("Thank you for using the program!");
					break;
			default:System.out.println("Invalid choice! Please try again.");
			
			}
		}while(ch1!=3);
		 
	sc.close();     
	}

}
