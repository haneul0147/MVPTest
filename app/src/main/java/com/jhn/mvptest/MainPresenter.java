package com.jhn.mvptest;

public class MainPresenter implements Contract.IPresenter {

    Contract.IView mIView;
    MainModel mainModel;
//    private String Data;



    public MainPresenter(Contract.IView mIView) {
        this.mIView = mIView;
        mainModel = new MainModel(this);
    }


    @Override
    public void SendData(String data) {
        if(data == null){
            return;
        }
        if(data == "데이터"){
            mainModel.Data =  data+"성공";
           // Data = data+"성공";
        }if(data == "리셋"){
            mainModel.Data =  data+"성공";
           // Data = data+"성공";
        }
        mIView.ShowData(mainModel.Data);
    }


}
