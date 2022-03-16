package com.company;

import java.util.ArrayList;
import java.util.List;

public class Stack {//Yığıt sınıf
    private List<mahalle> Liste=new ArrayList<>();//ArrayLİst şeklinde tuttum.List interface i ile  C# farklı.
    public Stack(){

    }
    public void push(mahalle e){//mahalle türünde eleman ekler
        getListe().add(e);
    }
    public int size(){//listenin boyutunu hesaplar
        return getListe().size();
    }
    public mahalle pop(){//listeden eleman siler ve onu döndürür
        int size= getListe().size();
        return getListe().remove(size-1);
    }

    ///get, set ToString metodları
    public List<mahalle> getListe() {
        return Liste;
    }

    public void setListe(List<mahalle> liste) {
        Liste = liste;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "Liste=" + Liste +
                '}';
    }
}
