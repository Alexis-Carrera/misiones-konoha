package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(jouninTask(List.of(3,1,5,3,5,5,7)));
    }

    private static int jouninTask(List<Integer> jouninList) {
        int amount = jouninList.get(0);
        List<Integer> listMission = new ArrayList<>();
        for(int i=0; i<amount;i++){
            for(int j=jouninList.get(i*2+1); j<=jouninList.get(i*2+2);j++){
                if(!listMission.contains(j)){
                    listMission.add(j);
                }
            }
        }
        return listMission.size();
    }

}
