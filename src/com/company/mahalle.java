package com.company;

import java.util.ArrayList;
import java.util.List;

public class mahalle {
    private String mahalleAdi;
    private int totalMahalleOrder;
    private List<teslimat> genericList=new ArrayList<>();
    public mahalle(String mahalleAdi,List<teslimat> genericList){//mahalle adı ve genericList i alarak oluşturulan yapıcı constructor
        this.setMahalleAdi(mahalleAdi);
        this.setGenericList(genericList);
    }public mahalle(String mahalleAdi,int totalMahalleOrder){//mahalle adı ve random olarak atanmış o mahallenin toplam siparş sayısını parametre alan yapıcı constructor
        this.setMahalleAdi(mahalleAdi);
        this.setTotalMahalleOrder(totalMahalleOrder);
    }
    //get,set,toString Metodları


    public String getMahalleAdi() {
        return mahalleAdi;
    }

    public void setMahalleAdi(String mahalleAdi) {
        this.mahalleAdi = mahalleAdi;
    }

    public List<teslimat> getGenericList() {
        return genericList;
    }

    public void setGenericList(List<teslimat> genericList) {
        this.genericList = genericList;
    }

    @Override
    public String toString() {
        return "mahalle{" +
                "mahalleAdi='" + mahalleAdi + '\'' +
                ", genericList=" + genericList +
                '}';
    }


    public int getTotalMahalleOrder() {
        return totalMahalleOrder;
    }

    public void setTotalMahalleOrder(int totalMahalleOrder) {
        this.totalMahalleOrder = totalMahalleOrder;
    }

}

