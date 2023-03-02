package com.projetono;

public class App 
{
    public static void main( String[] args )
    {
        
        No<String>[] no = new No[4];
        no[0] = new No("rato");
        no[1] = new No("pato");
        no[2] = new No("gato");
        no[3] = new No("tatú");

        no[0].setProximoNo(no[1]);
        no[1].setProximoNo(no[2]);
        no[2].setProximoNo(no[3]);
        no[3].setProximoNo(null);

        for (int i = 0; i < no.length; i++) {
            System.out.println(no[i].getConteudo());
        }

        for (No<String> no2 : no) {
            System.out.println(no2.getConteudo());
        }

     }
}
