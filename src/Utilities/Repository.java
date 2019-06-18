package Utilities;


import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.Athlete;
import uy.edu.um.clases.MedalType;

public class Repository {

    static HeapMax<Integer,Athlete> medallasOro = new HeapMax<>(1000000);
    static HeapMax<Integer,Athlete> medallasBronce = new HeapMax<>(1000000);
    static HeapMax<Integer,Athlete> medallasPlata = new HeapMax<>(1000000);
    static HeapMax<Integer,Athlete> medallasTotales= new HeapMax<>(1000000);
    static int totales;

    public static void preg1() throws ValorNoExisteException {
        for (int i = 1; i <= LoadData.atletas.size() ; i++) {
            Athlete temp = LoadData.atletas.get(i);
            temp.setBroonces(0);
            temp.setPlatas(0);
            temp.setOros(0);
            totales = 0;
            for (int j = 0; j < temp.getAtleteOP().size() ; j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if(medal.equals(MedalType.GOLD)){
                    int oros = temp.getOros() +1;
                    temp.setOros(oros);
                }
                if(medal.equals(MedalType.SILVER)) {
                    int platas = temp.getPlatas() + 1;
                    temp.setPlatas(platas);
                }
                if(medal.equals(MedalType.BRONZE)){
                    int bronces= temp.getBroonces()+1;
                    temp.setBroonces(bronces);
                }
            }
        }
        for (int i = 1; i <= LoadData.atletas.size() ; i++) {
            Athlete temp = LoadData.atletas.get(i);
            medallasOro.add(new HeapNode<>(temp.getOros(),temp));
        }
        for (int i = 1; i <= LoadData.atletas.size() ; i++) {
            Athlete temp = LoadData.atletas.get(i);
            medallasPlata.add(new HeapNode<>(temp.getPlatas(),temp));
        }
        for (int i = 1; i <= LoadData.atletas.size() ; i++) {
            Athlete temp = LoadData.atletas.get(i);
            medallasBronce.add(new HeapNode<>(temp.getBroonces(),temp));
        }
        for (int i = 1; i <= LoadData.atletas.size() ; i++) {
            Athlete temp = LoadData.atletas.get(i);
            totales = temp.getOros() + temp.getPlatas() + temp.getBroonces();
            medallasTotales.add(new HeapNode<>(totales,temp));
        }
    }

    public static void preg2() throws ValorNoExisteException, ListaVaciaException {


    }



}
