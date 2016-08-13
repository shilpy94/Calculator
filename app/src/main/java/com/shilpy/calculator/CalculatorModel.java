package com.shilpy.calculator;

import android.content.Context;

/**
 * Created by Shilpy on 8/11/2016.
 */
public class CalculatorModel {



    MainActivity ma=MainActivity.getInstance1();

    public void calculate(String opr, String str1) {
        if(opr=="+"){
            ma.total+=Integer.parseInt(str1);
            ma.str1=null;
        }
        else if(opr=="-"){
            ma.total-=Integer.parseInt(str1);
            ma.str1=null;
        }
        else if(opr=="*"){
            ma.total*=Integer.parseInt(str1);
            ma.str1=null;
        }
        else if(opr=="/"){
            ma.total/=Integer.parseInt(str1);
            ma.str1=null;
        }
    }

    private static CalculatorModel cm=new CalculatorModel();
    public static CalculatorModel getInstance2(){
        return cm;
    }
}
