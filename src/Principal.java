import uy.edu.um.clases.NationalOlympicCommittee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Principal {
    public static void main (String[] args){
        BufferedReader objReader = null;
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader("noc_regions.csv"));
            while ((strCurrentLine = objReader.readLine()) != null) {
                String[] vec = strCurrentLine.split(",");
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0],vec[1]);
                System.out.println(vec[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (objReader!= null)     objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
