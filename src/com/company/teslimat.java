package com.company;


public class teslimat {
    private int teslimatAdeti;
    private String teslimatAdi;
    public teslimat(){};
    public teslimat(String teslimatAdi,int teslimatAdeti){// random olarak main de oluşturduğumuz teslimatAdi ve teslimatAdeti ni parametre olarak alan yapıcı constructor
        this.setTeslimatAdi(teslimatAdi);
        this.setTeslimatAdeti(teslimatAdeti);
    }

    public int getTeslimatAdeti() {
        return teslimatAdeti;
    }

    public void setTeslimatAdeti(int teslimatAdeti) {
        this.teslimatAdeti = teslimatAdeti;
    }

    public String getTeslimatAdi() {
        return teslimatAdi;
    }

    public void setTeslimatAdi(String teslimatAdi) {
        this.teslimatAdi = teslimatAdi;
    }


    @Override
    public String toString() {
        return "teslimat{" +
                "teslimatAdeti=" + teslimatAdeti +
                ", teslimatAdi='" + teslimatAdi + '\'' +
                '}';
    }


}
