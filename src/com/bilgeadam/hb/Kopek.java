package com.bilgeadam.hb;
    // inheritance
    //superclass'sin  ozelliklerini subclass aliyor.
    //extends ile saglanir.

public class Kopek extends Hayvan {

    private String kopekCins;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }
    // method overriding
    //superclass methodunu kendimize ozgu yeniden yaziyoruz..
    public  void  sesCikar(){
        System.out.println("hav hav ");

    }

    @Override // bu override olsa da calisir olmasa da calisir. coda bakarken anlasila bilsin diye yaziliyor.
    public String toString() {
        return  "Ad: " +getAd() + "\n" +
                "Agirlik: " +getAgirlik() + "\n" +
                "Uzunluk: " +getUzunluk() +"\n" +
                "Cins: " + getKopekCins();

    }
}
