# com.T113_UI_Project_T10

###  

***

1. tests class isimlendirmesi US_ID seklinde olmali

2. Locate alinan element nerenin elementi oldugu aciklama satiri ile aciklanmali
   || orn:  Homepage >> LoginLink >> Email Text Box ||

<br/>

### Git

***

1. Herkes kendi adina birer branch olusturur.
    * 'git branch <isim>'

2. #### *** Herkes kendi branch'inde calisir.
3. #### ** Her islemden once hangi branch'de oldugu kontrol edilir.**
3. Pull etme adimlari;
    * 'git branch'  (hangi branch'de oldugumuz kontrol edilir)
    * main yesil ve yaninda yildiz olmali (degilse 'git branch main')
    * 'git pull' yapilir
    * 'git branch <isim>' (kendi branch'imize gecilir)
    * 'git merge main' (main'dekileri kendi branch'imize cekiyoruz)

3. Yaptigi degisiklikleri kucuk commitlerle kendi branchinda saklar. Burada tavsiye edilen sadece sizin yaptiginiz
   degisikliklerin eklenmesidir.
    * 'git add . kesinlikle kullanilMAMAli'
    * 'git add (degisiklik yapilan yerin dosya yolu yani "path from content root" u)
    * 'git commit -m "isim/tarih/yapilan degisiklikler icin bir mesaj yazilir."'
      Örn >>> git commit -m "ayse/08.11/loginClassEklendi"
4. git push

5. gelen linkten ustteki linke tiklanir ve github hesabi sayfasi acilir

6. Push ettigimiz kendi kodumuz icin **request** olusturulur ve is biter

7. Merge request islemi team lead tarfindan gerceklestirilir

### Isimlendirmelerde Dikkat Edilecekler

***

| Element Türü   | Variable name |
|----------------|---------------|
| Element        | xElementi     |
| Button         | XButton       |    
| Logo           | XLogo         |
| Sadece text    | XText         |
| Drop down      | XDropDown     |
| Radio Button   | XRadioButton  |
| Check box      | XCheckBox     |
| Tablo Sutunu   | XColumn       |
| Tablo Satiri   | XRow          |
| Urun resimleri | XImageProduct |
| Linkler        | XLinki        |
