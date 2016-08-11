package com.shilpy.calculator;

import android.content.Context;

/**
 * Created by Shilpy on 8/11/2016.
 */
public class CalculatorModel {
    private Context context;
    public CalculatorModel(Context context) {
        this.context=context;
    }
    private int substract(int a,int b){
        return a-b;
    }
}
