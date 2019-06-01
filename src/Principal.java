import Hash.ElementoYaExistenteException;
import Hash.HashCerrado;
import uy.edu.um.clases.Athlete;
import uy.edu.um.clases.NationalOlympicCommittee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static uy.edu.um.clases.SexType.valueOf;

public class Principal {

    public void displayMenu(){
        System.out.println ( "1) Question 1\n2) Question 2\n3) Question 3\n4) Question 4\n5) Question 5\n6) EXIT" );
        System.out.print ( "Selection: " );
    }

    public Principal() {
        Scanner in = new Scanner ( System.in );

        displayMenu();
        switch ( in.nextInt() ) {
            case 1:
                System.out.println ( "result 1" );
                break;
            case 2:
                System.out.println ( "result 2" );
                break;
            case 3:
                System.out.println ( "result 3" );
                break;
            case 4:
                System.out.println ( "result 4" );
                break;
            case 5:
                System.out.println ( "result 5" );
                break;
            case 6:
                break;

            default:
                System.err.println ( "Ingrese una opcion Valida" );
                new Principal();
                break;
        }
    }

    public static void main(String[] args) {

        try {
            new Principal();
        } catch (InputMismatchException e){
            System.out.println("Ingrese una opcion valida");
            new Principal();
        }

        HashCerrado NationalOlympicCommittees = new HashCerrado(231);
        HashCerrado Athletes = new HashCerrado(5000);

        BufferedReader objReader = null;

        try {

            String strCurrentLine;
            objReader = new BufferedReader(new FileReader("noc_regions.csv"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                String[] vec = strCurrentLine.split(",");
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0], vec[1]);
                NationalOlympicCommittees.insert(temp.getNoc(), temp.getRegion());
            }


           objReader=new BufferedReader(new FileReader("athlete_events.csv"));

           //creo q no es necesario --> strCurrentLine=objReader.readLine(); // para que saltee la fila que son los nombres de las columnas
            while ((strCurrentLine)!=null){
                String[] vec = strCurrentLine.split(",");

                    long temp1 = Long.parseLong(vec[0]);
                    int  temp2 = Integer.parseInt(vec[3]);
                    float temp3 = Float.parseFloat(vec[4]);
                    float temp4 = Float.parseFloat(vec[5]);

                    Athlete temp= new Athlete(temp1 , vec[1], valueOf(vec[2]), temp2,
                            temp3, temp4);
                    Athletes.insert(temp.getId(),temp);



            }
        } catch (IOException | ElementoYaExistenteException e ) {

            e.printStackTrace();

        } finally {

            try {

                if (objReader != null) objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }







    }
}
