import Hash.ElementoYaExistenteException;
import Hash.HashCerrado;
import double_linked_list.ValorNoExisteException;
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
                HashCerrado NationalOlympicCommittees= new HashCerrado(231); //creo que esta mal hacer esto en el while pero si lo pongo afuera me da un error
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0],vec[1]);
                NationalOlympicCommittees.insert(temp.getNoc(),temp.getRegion());
                System.out.println(NationalOlympicCommittees.get(temp.getNoc()));


            }
        } catch (IOException | ElementoYaExistenteException | ValorNoExisteException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objReader!= null)     objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
