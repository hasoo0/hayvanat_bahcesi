package com.bilgeadam.hb;
    // inheritance
    //superclass'sin  ozelliklerini subclass aliyor.
    //extends ile saglanir.

public class Kopek extends Hayvan {

    private String kopekCins;
    private double kuyrukUzunlugu;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }

    public double getKuyrukUzunlugu() {
        return kuyrukUzunlugu;
    }

    public void setKuyrukUzunlugu(double kuyrukUzunlugu) {
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }

    // method overriding
    //superclass methodunu kendimize ozgu yeniden yaziyoruz..
    public  void  sesCikar(){
        System.out.println("hav hav ");

    }

    @Override // bu override olsa da calisir olmasa da calisir. coda bakarken anlasila bilsin diye yaziliyor.
    public String toString() {
        return  "Ad: " +getAd() + "\n" +
                "Agirlik: " +getAgirlik() + " kg " + "\n" +
                "Uzunluk: " +getUzunluk() +"\n" +
                "Cins: " + getKopekCins() +"\n" +
                "Kuyruk Uzunlugu: " + getKuyrukUzunlugu();


    }
}
