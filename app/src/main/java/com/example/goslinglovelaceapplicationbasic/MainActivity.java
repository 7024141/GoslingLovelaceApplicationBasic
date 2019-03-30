package com.example.goslinglovelaceapplicationbasic;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isChinese()){
            int orientation = getResources().getConfiguration().orientation;
            String str;
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                TextView namePort = (TextView)findViewById(R.id.namePort);
                namePort.setText("詹姆斯·高斯林");

                TextView tvPort = (TextView)findViewById(R.id.tvPort);
                str = getResources().getString(R.string.goslingZh);
                tvPort.setText(str);
            }
            else if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
                TextView nameLand = (TextView)findViewById(R.id.nameLand);
                nameLand.setText("艾达·洛维斯");

                TextView tvLand = (TextView)findViewById(R.id.tvLand);
                str = getResources().getString(R.string.adaZh);
                tvLand.setText(str);
            }
        }
    }

    public boolean isChinese(){
        Locale locale = this.getResources().getConfiguration().locale;
        String language = locale.getLanguage();

        if(language.endsWith("zh")){
            return true;
        }
        else return false;
    }
}
