package main;

import java.io.*;

public class Reader {

    public void createMyData(boolean overrite) {
        FileWriter fileWriter;
        try {

            fileWriter = new FileWriter("myData.txt", !overrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("1,2,3,4,5");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void myData(AQueue aQueue) {
        BufferedReader bufferedReader;
        try {

            bufferedReader = new BufferedReader(new FileReader("myData.txt"));
            String txt;
            while ((txt = bufferedReader.readLine()) != null) {

                String[] allInt = txt.split(",");

                for (String stringInt : allInt) {
                    aQueue.add(Integer.parseInt(stringInt));
                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
