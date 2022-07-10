package com.jhn.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements Contract.IView{

    Contract.IPresenter mpresenter;
    private TextView txt;
    private Button btn;
    private Button btn2;
    private String Data;

//    public MainActivity(Contract.IPresenter mPresenter) {
//        this.mpresenter = mPresenter;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mpresenter = new MainPresenter(this);

       init();

    }

    public void init(){
        btn = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        txt = findViewById(R.id.txt1);


        btn.setOnClickListener(mClickListner);
        btn2.setOnClickListener(mClickListner);

    }



    View.OnClickListener mClickListner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case  R.id.btn1:
                    Data = "데이터";
                    mpresenter.SendData(Data);
                    Log.e("btn1 Data",Data);
                    break;

                case R.id.btn2:
                    Data = "리셋";
                    mpresenter.SendData(Data);
                    Log.e("btn2 Data",Data);
                    break;

            }
        }
    };

    @Override
    public void ShowData(String data) {
        if(data == null){
            return;
        }
        txt.setText(data);

    }
}