package com.jhn.mvptest;

public interface Contract {

    public interface IView  {
        void ShowData(String data);

    }
    public interface IPresenter{

        void SendData(String data);
    }

}
