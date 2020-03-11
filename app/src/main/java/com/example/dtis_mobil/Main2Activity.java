package com.example.dtis_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.VideoView;

import com.google.android.gms.maps.MapView;

public class Main2Activity extends AppCompatActivity {
    Switch haritaswitch;//switchimizi oluşturduk
    MapView harita;//haritamızı oluşturduk
    VideoView videoplayer;//videoplayerımızı oluşturduk

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        haritaswitch = (Switch) findViewById(R.id.haritaswitch);//switchimizi .xml'deki switchin id'siyle eşledik
        haritaswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//switch kontrol
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {//switchde değişiklik olduğunda
                /*switch butonunun açık kapalı olması takibini ve açık ve kapalı olma
                durumlarında bir eylem gerçekleştirmesini sağlayan kod bluğunu hazırladım,
                şimdilik Google MapView ile ilişkisini kurmuyorum ilişki kurulduğunda harita
                sayfadan kaybolup video büyük ekranda oynamaya başlayacak.
                onPageStarted ve onPageFisinished isimli iki ayrı fonksiyon olduğunu öğrendim,
                bunlarla yapabileceğimi düşünüyorum.
                MapView için konsoldan bir API anahtarı alacağız ve .xml tarafında Google Developers Console'ın verdiği
                bu API'yi koda dahil edeceğiz.
                Fakat bizim amacımız kendi konumunu değil seçili olan DTIS'nin konumu olduğu için
                burada takıldım.
                 */

                if(isChecked){
                    buttonView.setText("Harita Açık");
                }else{
                    buttonView.setText("Harita Kapalı");
                }

            }
        });
    }
}
