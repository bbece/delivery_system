package com.company;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<mahalle> Liste=new ArrayList<>();//ArrayList şeklinde tutulur.
    public Queue(){

    }
    public void Enqueue(mahalle e){//Listeye eleman ekler
        getListe().add(e);

    }
    public int size(){//Listenin boyutunu döndürür
        return getListe().size();
    }
    public mahalle poll(){//listeden eleman çıkartır , döndürür ve List arayüzü ile LinkedList kullanmamız avantajıyla remove silinme olduktan sonra size i azaltır.
        return getListe().remove(0);

    }
//get,set, toString metodları
    public List<mahalle> getListe() {
        return Liste;
    }

    public void setListe(List<mahalle> liste) {
        Liste = liste;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "Liste=" + Liste +
                '}';
    }
}
