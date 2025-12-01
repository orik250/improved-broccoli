import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<String> lines = getFileData("data");
        int counter = 0;
        int partOneAnswer = 50;
        int partTwoAnswer = 0;
        String multiplier = "0";
        int multi = 0;
        for (int i = 0; i < lines.size(); i++) {
            multiplier = lines.get(i);
            multi = Integer.parseInt(multiplier.substring(1));
            for (int i=0; i<multi; i++){
                rotater(multiplier, partOneAnswer);

            }

        }

        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }


    ArrayList<String> combos = getFileData("data");
    public static int rotater(String rotation, int dial){

        int count =0;
        int num = Integer.parseInt(rotation.substring(1));
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

    public static int getPartTwoNumber(String line) {
        // do part 2
        return 0;
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
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