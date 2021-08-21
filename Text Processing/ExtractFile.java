package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] file = scan.nextLine().split("\\\\");

        String[] fileNameAndExtension = file[file.length - 1].split("\\.");

        String fileName = fileNameAndExtension[0];
        String fileExtension = fileNameAndExtension[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);





    }
}
