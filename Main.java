import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<String> lines = getFileData("src/data");
        int counter = 0;
        int position = 50;
        String multiplier;
        int multi;
        for (int i = 0; i < lines.size(); i++) {
            multiplier = lines.get(i);
            multi = Integer.parseInt(multiplier.substring(1));
            for (int a=0; a<multi; a++){
                position = rotater(multiplier, position);
                if(position==0){
                    counter++;
                }
            }

        }

        System.out.println("Lands at zero: "+counter+" times");
    }

    public static int rotater(String rotation, int dial){
        if((rotation.substring(0, 1).equals("L"))){
            dial--;
            if(dial==-1){
                dial=99;

            }
        }else{
            dial++;
            if(dial==100){
                dial=0;

            }
        }

        return dial;

    }



    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}