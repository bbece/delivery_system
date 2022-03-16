package com.company;


import java.util.ArrayList;
import java.util.List;


public class pQueue {
    private List<mahalle> Liste =new ArrayList<>();//ArrayList şeklinde tuttum
    public pQueue(){}
    public pQueue(List<mahalle> Liste){//yapıcı constructor
        this.setListe(Liste);}
    public void Enqueue(List<mahalle> ListeOrders){//listeye eleman ekler
        for(int a=0; a<ListeOrders.size();a++){
            getListe().add(a,ListeOrders.get(a));
        }


    }
    public int maxDegerBulma(){// o mahalledeki random atanmış toplam siparişlerden max siparişin indexini bulan ve döndüren metod
        int max=(Liste.get(0)).getTotalMahalleOrder();
        int index=0;
        for(int z=0;z<Liste.size();z++){
            if((Liste.get(z)).getTotalMahalleOrder()>max){
                max=(Liste.get(z)).getTotalMahalleOrder();
                index=z;
            }
        }
        return index;
    }



    public void Dequeue(){//max değerde sipariş olan mahalleyi yazdırıp, silen metod
        int x=maxDegerBulma();
        System.out.println("mahalle adı:"+(Liste.get(x)).getMahalleAdi()+"  "+"mahallenin toplam sipariş sayısı:"+(Liste.get(x)).getTotalMahalleOrder());
        Liste.remove(x);
    }
    public boolean isEmpty(){//liste boş mu?, döndüren metod
        return getListe().isEmpty();
    }
    public void Listeyazdirma(){//Lİsteyi yazdıran metod
        for (com.company.mahalle mahalle : Liste) {
            System.out.println(mahalle.getMahalleAdi());
            System.out.println(mahalle.getTotalMahalleOrder());


        }

    }//get,set toString metodları

    public Integer PqueueSize(){
        return Liste.size();
    }


    public List<mahalle> getListe() {
        return Liste;
    }

    public void setListe(List<mahalle> Liste) {
        Liste = Liste;
    }

    @Override
    public String toString() {
        return "pQueue{" +
                "Liste=" + Liste +
                '}';
    }
}
