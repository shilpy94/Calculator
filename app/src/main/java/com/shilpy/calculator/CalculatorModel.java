package com.shilpy.calculator;

import android.content.Context;

/**
 * Created by Shilpy on 8/11/2016.
 */
public class CalculatorModel {
int total;
    public int calculate(String opr, String str1,int total) {
        if(opr=="+"){
            this.total=total+Integer.parseInt(str1);

        }
        else if(opr=="-"){
            this.total=total-Integer.parseInt(str1);

        }
        else if(opr=="*"){
            this.total=total*Integer.parseInt(str1);

        }
        else if(opr=="/"){
            this.total=total/Integer.parseInt(str1);
        }

        return this.total;
    }

}
