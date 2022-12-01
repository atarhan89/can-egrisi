import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Kisi kisi1= new Kisi("hakan",10,"matematik",80,70,"turkce",90,85);
int kisi1MatOrtalama=(kisi1.ders1not1+ kisi1.ders1not2)/2 ;
int kisi1TurkOrtalama=(kisi1.ders2not1+ kisi1.ders2not2)/2 ;

        Kisi kisi5= new Kisi("ayse",50,"matematik",55,75,"turkce",85,85);
        int kisi5MatOrtalama=(kisi5.ders1not1+ kisi5.ders1not2)/2 ;
        int kisi5TurkOrtalama=(kisi5.ders2not1+ kisi5.ders2not2)/2 ;


        Kisi kisi2= new Kisi("ali",20,"matematik",72,88,"turkce",25,35);
        int kisi2MatOrtalama=(kisi2.ders1not1+ kisi2.ders1not2)/2 ;
        int kisi2TurkOrtalama=(kisi2.ders2not1+ kisi2.ders2not2)/2 ;

        Kisi kisi3 =new Kisi("fatma",30,"matematik",80,70,"",0,0);
        int kisi3MatOrtalama=(kisi3.ders1not1+ kisi3.ders1not2)/2 ;

        Kisi kisi4= new Kisi("ahmet",40,"",0,0,"turkce",90,85);
        int kisi4TurkOrtalama=(kisi4.ders2not1+ kisi4.ders2not2)/2 ;

        int aritmetikOrtMat=(kisi1MatOrtalama+ kisi5MatOrtalama+ kisi2MatOrtalama + kisi3MatOrtalama)/4;
        int aritmetikOrtTurk=(kisi4TurkOrtalama + kisi2TurkOrtalama+ kisi5TurkOrtalama+ kisi1TurkOrtalama)/4;


        int DD = aritmetikOrtMat + ((100 - aritmetikOrtMat) / 6);
        int DC = DD + ((100 - aritmetikOrtMat) / 6);
        int CC = DC + ((100 - aritmetikOrtMat) / 6);
        int CB = CC + ((100 - aritmetikOrtMat) / 6);
        int BB = CB + ((100 - aritmetikOrtMat) / 6);
        int BA = BB + ((100 - aritmetikOrtMat) / 6);
        int AA = BA + ((100 - aritmetikOrtMat) / 6) ;

        int trDD = aritmetikOrtTurk + ((100 - aritmetikOrtTurk) / 6);
        int trDC = DD + ((100 - aritmetikOrtTurk) / 6);
        int trCC = DC + ((100 - aritmetikOrtTurk) / 6);
        int trCB = CC + ((100 - aritmetikOrtTurk) / 6);
        int trBB = CB + ((100 - aritmetikOrtTurk) / 6);
        int trBA = BB + ((100 - aritmetikOrtTurk) / 6);
        int trAA = BA + ((100 - aritmetikOrtTurk) / 6) ;



        System.out.println("lütfen id giriniz?");
        Scanner klavye= new Scanner(System.in);
        int id = klavye.nextInt();


        if (id == 10) {
            System.out.println("Ogrenci adi : " + kisi1.ad);
            System.out.println("Ders Adi :" + kisi1.ders1);
        if (kisi1MatOrtalama<aritmetikOrtMat){
            System.out.println(kisi1.ders1+ "KALDI");
        } else{
            System.out.println(kisi1.ders1+ "GEÇTİ");
        }
       if(kisi1MatOrtalama> BA){
             System.out.println(kisi1.ders1 + "AA");
          }else if(kisi1MatOrtalama> BB){
           System.out.println(kisi1.ders1 + "BA");
          }else if(kisi1MatOrtalama> CB){
           System.out.println(kisi1.ders1 + "BB");
          }else if(kisi1MatOrtalama> CC){
           System.out.println(kisi1.ders1 + "CB");
          }else if(kisi1MatOrtalama> DC){
           System.out.println(kisi1.ders1 + "CC");
          }else if(kisi1MatOrtalama> DD){
           System.out.println(kisi1.ders1 + "DC");
          }else {
           System.out.println("Harf notunuz : DD");
         }


      /////////////////////////////////////////////////
            if (id ==20 ) {
                System.out.println("Ogrenci adi : " + kisi2.ad);
                System.out.println("Ders Adi :" + kisi2.ders1);

        if (kisi2MatOrtalama<aritmetikOrtMat){
            System.out.println(kisi2.ders1+ "KALDI");
        } else{
            System.out.println(kisi2.ders1+ "GEÇTİ");
        }
        if(kisi2MatOrtalama> BA){
            System.out.println(kisi2.ders1 + "AA");
        }else if(kisi2MatOrtalama> BB){
            System.out.println(kisi2.ders1 + "BA");
        }else if(kisi2MatOrtalama> CB){
            System.out.println(kisi1.ders1 + "BB");
        }else if(kisi2MatOrtalama> CC){
            System.out.println(kisi2.ders1 + "CB");
        }else if(kisi2MatOrtalama> DC){
            System.out.println(kisi2.ders1 + "CC");
        }else if(kisi2MatOrtalama> DD){
            System.out.println(kisi2.ders1 + "DC");
        }else {
            System.out.println("Harf notunuz : DD");
        }
       /////////////////////////////////////////////////
                if (id == 50) {
                    System.out.println("Ogrenci adi : " + kisi5.ad);
                    System.out.println("Ders Adi :" + kisi5.ders1);
        if (kisi5MatOrtalama<aritmetikOrtMat){
            System.out.println(kisi5.ders1+ "KALDI");
        } else{
            System.out.println(kisi5.ders1+ "GEÇTİ");
        }
        if(kisi5MatOrtalama> BA){
            System.out.println(kisi5.ders1 + "AA");
        }else if(kisi5MatOrtalama> BB){
            System.out.println(kisi5.ders1 + "BA");
        }else if(kisi5MatOrtalama> CB){
            System.out.println(kisi5.ders1 + "BB");
        }else if(kisi5MatOrtalama> CC){
            System.out.println(kisi5.ders1 + "CB");
        }else if(kisi5MatOrtalama> DC){
            System.out.println(kisi5.ders1 + "CC");
        }else if(kisi5MatOrtalama> DD){
            System.out.println(kisi5.ders1 + "DC");
        }else {
            System.out.println("Harf notunuz : DD");
        }

        /////////////////////////////////////////////
                    if (id == 30) {
                        System.out.println("Ogrenci adi : " + kisi3.ad);
                        System.out.println("Ders Adi :" + kisi3.ders1);
        if (kisi3MatOrtalama<aritmetikOrtMat){
            System.out.println(kisi3.ders1+ "KALDI");
        } else{
            System.out.println(kisi3.ders1+ "GEÇTİ");
        }
        if(kisi3MatOrtalama> BA){
            System.out.println(kisi3.ders1 + "AA");
        }else if(kisi3MatOrtalama> BB){
            System.out.println(kisi3.ders1 + "BA");
        }else if(kisi3MatOrtalama> CB){
            System.out.println(kisi3.ders1 + "BB");
        }else if(kisi3MatOrtalama> CC){
            System.out.println(kisi3.ders1 + "CB");
        }else if(kisi3MatOrtalama> DC){
            System.out.println(kisi3.ders1 + "CC");
        }else if(kisi3MatOrtalama> DD){
            System.out.println(kisi3.ders1 + "DC");
        }else {
            System.out.println("Harf notunuz : DD");
        }

        ///////////////////////////////////////////
                        if (id == 10) {
                            System.out.println("Ogrenci adi : " + kisi1.ad);
                            System.out.println("Ders Adi :" + kisi1.ders2);

                            if (kisi1TurkOrtalama < aritmetikOrtTurk) {
                                System.out.println(kisi1.ders1 + "KALDI");
                            } else {
                                System.out.println(kisi1.ders1 + "GEÇTİ");
                            }
                            if (kisi1TurkOrtalama > BA) {
                                System.out.println(kisi1.ders1 + "AA");
                            } else if (kisi1TurkOrtalama > BB) {
                                System.out.println(kisi1.ders1 + "BA");
                            } else if (kisi1TurkOrtalama > CB) {
                                System.out.println(kisi1.ders1 + "BB");
                            } else if (kisi1TurkOrtalama > CC) {
                                System.out.println(kisi1.ders1 + "CB");
                            } else if (kisi1TurkOrtalama > DC) {
                                System.out.println(kisi1.ders1 + "CC");
                            } else if (kisi1TurkOrtalama > DD) {
                                System.out.println(kisi1.ders1 + "DC");
                            } else {
                                System.out.println("Harf notunuz : DD");
                            }
                            ////////////////////////////////////////////
                            if (id == 20) {
                                System.out.println("Ogrenci adi : " + kisi2.ad);
                                System.out.println("Ders Adi :" + kisi2.ders2);
                                if (kisi2TurkOrtalama < aritmetikOrtTurk) {
                                    System.out.println(kisi2.ders1 + "KALDI");
                                } else {
                                    System.out.println(kisi2.ders1 + "GEÇTİ");
                                }
                                if (kisi2TurkOrtalama > BA) {
                                    System.out.println(kisi2.ders1 + "AA");
                                } else if (kisi2TurkOrtalama > BB) {
                                    System.out.println(kisi2.ders1 + "BA");
                                } else if (kisi2TurkOrtalama > CB) {
                                    System.out.println(kisi1.ders1 + "BB");
                                } else if (kisi2TurkOrtalama > CC) {
                                    System.out.println(kisi2.ders1 + "CB");
                                } else if (kisi2TurkOrtalama > DC) {
                                    System.out.println(kisi2.ders1 + "CC");
                                } else if (kisi2TurkOrtalama > DD) {
                                    System.out.println(kisi2.ders1 + "DC");
                                } else {
                                    System.out.println("Harf notunuz : DD");
                                }
                                //////////////////////////////////////////////
                                if (id == 40) {
                                    System.out.println("Ogrenci adi : " + kisi4.ad);
                                    System.out.println("Ders Adi :" + kisi4.ders2);

                                    if (kisi4TurkOrtalama < aritmetikOrtTurk) {
                                        System.out.println(kisi4.ders1 + "KALDI");
                                    } else {
                                        System.out.println(kisi4.ders1 + "GEÇTİ");
                                    }
                                    if (kisi4TurkOrtalama > BA) {
                                        System.out.println(kisi4.ders1 + "AA");
                                    } else if (kisi4TurkOrtalama > BB) {
                                        System.out.println(kisi4.ders1 + "BA");
                                    } else if (kisi4TurkOrtalama > CB) {
                                        System.out.println(kisi4.ders1 + "BB");
                                    } else if (kisi4TurkOrtalama > CC) {
                                        System.out.println(kisi4.ders1 + "CB");
                                    } else if (kisi4TurkOrtalama > DC) {
                                        System.out.println(kisi4.ders1 + "CC");
                                    } else if (kisi4TurkOrtalama > DD) {
                                        System.out.println(kisi4.ders1 + "DC");
                                    } else {
                                        System.out.println("Harf notunuz : DD");
                                    }
                                    ////////////////////////////////////////

                                    if (id == 50) {
                                        System.out.println("Ogrenci adi : " + kisi5.ad);
                                        System.out.println("Ders Adi :" + kisi5.ders2);
                                        if (kisi5TurkOrtalama < aritmetikOrtTurk) {
                                            System.out.println(kisi5.ders1 + "KALDI");
                                        } else {
                                            System.out.println(kisi5.ders1 + "GEÇTİ");
                                        }
                                        if (kisi5TurkOrtalama > BA) {
                                            System.out.println(kisi5.ders1 + "AA");
                                        } else if (kisi5TurkOrtalama > BB) {
                                            System.out.println(kisi5.ders1 + "BA");
                                        } else if (kisi5TurkOrtalama > CB) {
                                            System.out.println(kisi5.ders1 + "BB");
                                        } else if (kisi5TurkOrtalama > CC) {
                                            System.out.println(kisi5.ders1 + "CB");
                                        } else if (kisi5TurkOrtalama > DC) {
                                            System.out.println(kisi5.ders1 + "CC");
                                        } else if (kisi5TurkOrtalama > DD) {
                                            System.out.println(kisi5.ders1 + "DC");
                                        } else {
                                            System.out.println("Harf notunuz : DD");
                                        }
                                    }
                                }


                            }
                        }
                    }
                }
            }
        }
    }
}