package com.bilgeadam.hb;

// Hayvan clasinin objesini olursturulmasini istemiyorum
// abstraction class yapacagiz
    public abstract class  Hayvan {

    private  String ad;
    private double uzunluk;
    private  double agirlik;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public  void  sesCikar(){

        System.out.println("-------------");
    }

}


