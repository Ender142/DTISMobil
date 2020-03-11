package com.example.dtis_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;//arayüz geçişi için kullanacağım
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button girisbuton;
    EditText tcNo;
    EditText sicilNo;
    EditText sifre;

    /*kullanacağım bütün nesnelerimi kendi
    değerlerinde tanımladım.*/

    private String sicil_no="1234567";
    private String tc_no="123456789";
    private String sifreonay="236555";

    /*program tamamlandığında bu değerleri veri tabanından alıyor olacağız, şimdilik
      fonksiyonların çalışıp çalışmadığından emin olmak için kendi atadığım değerlerle
      get() foksiyonlarının çalıştığından emin oluyorum.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        girisbuton = (Button) findViewById(R.id.girisbuton);
        tcNo = (EditText) findViewById(R.id.tcNo);
        sicilNo = (EditText) findViewById(R.id.sicilNo);
        sifre = (EditText) findViewById(R.id.sifre);
        /*nesnelerimi .xml'de belirlediğim id'leriyle java tarafında
        kullanabilmek için tanımlayarak oluşturdum
         */

        girisbuton.setOnClickListener(new View.OnClickListener() {
            //giriş butonuna tıklanma gerçekleşince


            @Override
            public void onClick(View v) {
                //tıklama anında çalışacak kodlar


                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                /*intent ile MainActivity(login sayfası) ile Main2Activity(giriş başarılıysa
                açılacak yönetici ekranı) arasındaki geçişi onClick metodu içinde tanımladım
                 */
                if (sicilNo.getText().equals(sicil_no)) {
                    if (tcNo.getText().equals(tc_no)) {
                        if (sifre.getText().equals(sifreonay)) {
                            startActivity(intent);
                        }
                    }
                }
                /*login ekranında sicil no, tc no ve şifre veritabanında bulunuyorsa
                giriş gerçekleştirilecek ve yönetim sayfasına intent ile geçilecek.
                 */
            }
        });




    }



}
