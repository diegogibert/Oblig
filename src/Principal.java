import Hash.ElementoYaExistenteException;
import Hash.HashCerrado;
import double_linked_list.ValorNoExisteException;
import javafx.scene.chart.PieChart;
import uy.edu.um.clases.Athlete;
import uy.edu.um.clases.NationalOlympicCommittee;
import uy.edu.um.clases.SexType;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

    public void displayMenu(){
        System.out.println ( "1) Question 1\n2) Question 2\n3) Question 3\n4) Question 4\n5) Question 5" );
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

            default:
                System.err.println ( "error" );
                break;
        }
    }

    public static void main(String[] args) {

        new Principal();

        HashCerrado NationalOlympicCommittees = new HashCerrado(231);
       // HashCerrado Athletes = new HashCerrado(5000);

        BufferedReader objReader = null;

        try {

            String strCurrentLine;
            objReader = new BufferedReader(new FileReader("noc_regions.csv"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                String[] vec = strCurrentLine.split(",");
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0], vec[1]);
                NationalOlympicCommittees.insert(temp.getNoc(), temp.getRegion());
            }


           // objReader=new BufferedReader(new FileReader("athlete_events.csv"));

//            strCurrentLine=objReader.readLine(); // para que saltee la fila que son los nombres de las columnas
//            while ((strCurrentLine=objReader.readLine())!=null){
//                String[] vec = strCurrentLine.split(",");
//
//
//                    Athlete temp= new Athlete(Long.parseLong(vec[0]) , vec[1], SexType.valueOf(vec[2]), Integer.parseInt(vec[3]),
//                            Float.parseFloat(vec[4]), Float.parseFloat(vec[5]));
//                    Athletes.insert(temp.getId(),temp);
//
//
//
//            }
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
