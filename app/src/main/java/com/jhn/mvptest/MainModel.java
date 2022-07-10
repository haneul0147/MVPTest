package com.jhn.mvptest;

public class MainModel {
    Contract.IPresenter mPresenter;

    public MainModel(Contract.IPresenter mPresenter) {
        this.mPresenter = mPresenter;
    }

    public String Data;
}
