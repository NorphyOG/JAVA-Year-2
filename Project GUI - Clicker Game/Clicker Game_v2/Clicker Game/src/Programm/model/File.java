package Programm.model;

////                                                  
///
// Creator: Jerome Weber                                 
// Project: Clicker Game                               
// Date: 23.03.2022 - 10:35                                   
// Info: For questions or similar contact me on Discord. 
// Discord: Ɲorphy#1164                               
///
////                                               

import java.io.*;

public class File {

    public void saveGame(boolean overrite) {
        FileWriter fileWriter;
        try {

            fileWriter = new FileWriter("saveGame", !overrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(""); //TODO

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadGame() {

        BufferedReader bufferedReader;
        try {

            bufferedReader = new BufferedReader(new FileReader("saveGame"));
            String txt;
            while ((txt = bufferedReader.readLine()) != null) {

                //TODO

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
