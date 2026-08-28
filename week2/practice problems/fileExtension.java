package Step;

import java.util.Scanner;

public class fileExtension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename=sc.nextLine();
        int dot = filename.lastIndexOf('.');
        String extension = filename.substring(dot + 1);
        if ((extension.equalsIgnoreCase("pdf"))||(extension.equalsIgnoreCase("docs"))||(extension.equalsIgnoreCase("zip"))){

            System.out.println("Accepted");
        }
        else
        {
            System.out.println("Rejected");
        }


    }
}
