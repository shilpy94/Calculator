package com.shilpy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 EditText et;
   Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,minus,mul,div,equal,clear;
    String op[]=new String[2];
    String str1=null;
    int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        et=(EditText) findViewById(R.id.et);
        str1=et.getText().toString();
        b0=(Button) findViewById(R.id.b0); b1=(Button) findViewById(R.id.b1); b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3); b4=(Button) findViewById(R.id.b4); b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6); b7=(Button) findViewById(R.id.b7); b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9); plus=(Button) findViewById(R.id.plus); minus=(Button) findViewById(R.id.minus);
        mul=(Button) findViewById(R.id.mul); div=(Button) findViewById(R.id.div); equal=(Button) findViewById(R.id.equal);
        clear=(Button) findViewById(R.id.clear);

       b0.setOnClickListener(this); b1.setOnClickListener(this); b2.setOnClickListener(this);
        b3.setOnClickListener(this); b4.setOnClickListener(this); b5.setOnClickListener(this);
        b6.setOnClickListener(this); b7.setOnClickListener(this); b8.setOnClickListener(this);
        b9.setOnClickListener(this); plus.setOnClickListener(this); minus.setOnClickListener(this);
        mul.setOnClickListener(this); div.setOnClickListener(this); equal.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
  switch (v.getId()){
      case  R.id.b0 : if(str1==null){
          str1="0";
      }
       else {
          str1 = str1 + "0";
      }
          if(op[0]==null){
              et.setText(str1);
      }
          else{
          et.setText(total + op[0] + str1);
      }break;
      case  R.id.b1 :  if(str1==null){
          str1="1";
      }
      else {
          str1 = str1 + "1";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b2 : if(str1==null){
          str1="2";
      }
      else {
          str1 = str1 + "2";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b3 : if(str1==null){
          str1="3";
      }
      else {
          str1 = str1 + "3";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b4: if(str1==null){
          str1="4";
      }
      else {
          str1 = str1 + "4";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b5 : if(str1==null){
          str1="5";
      }
      else {
          str1 = str1 + "5";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b6 : if(str1==null){
          str1="6";
      }
      else {
          str1 = str1 + "6";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b7 :  if(str1==null){
          str1="7";
      }
      else {
          str1 = str1 + "7";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b8 : if(str1==null){
          str1="8";
      }
      else {
          str1 = str1 + "8";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;
      case  R.id.b9 : if(str1==null){
          str1="9";
      }
      else {
          str1 = str1 + "9";
      }
          if(op[0]==null){
              et.setText(str1);
          }
          else{
              et.setText(total + op[0] + str1);
          }break;

      case R.id.plus : if(op[0]==null) {
          op[0] = "+";
          et.setText(str1 + op[0]);
          total =Integer.parseInt( str1);
          str1 = null;
      }
          else {
          op[1]=op[0];
          op[0]="+";
          calculate(op[1], str1);
          et.setText(total + op[0]);
      }
  break;

      case R.id.minus:
          if(op[0]==null) {
              op[0] = "-";
              et.setText(str1 + op[0]);
              total =Integer.parseInt( str1);
              str1 = null;
          }
          else {
              op[1]=op[0];
              op[0]="-";
              calculate(op[1], str1);
              et.setText(total + op[0]);
          }
          break;
      case R.id.mul:  if(op[0]==null) {
          op[0] = "*";
          et.setText(str1 + op[0]);
          total =Integer.parseInt( str1);
          str1 = null;
      }
      else {
          op[1]=op[0];
          op[0]="*";
          calculate(op[1], str1);
          et.setText(total + op[0]);
      }
          break;
      case R.id.div: if(op[0]==null) {
          op[0] = "/";
          et.setText(str1 + op[0]);
          total =Integer.parseInt( str1);
          str1 = null;
      }
      else {
          op[1]=op[0];
          op[0]="/";
          calculate(op[1], str1);
          et.setText(total + op[0]);
      }
          break;
      case R.id.equal:
          op[1]=op[0];
          op[0]="=";
          calculate(op[1], str1);
          et.setText(op[0] + total);
          op[0]=null;
          str1=null;
          break;
      case R.id.clear: op[0]=null;
          str1=null;
          et.setText("0");
  }

    }

    private void calculate(String opr, String str1) {
        if(opr=="+"){
            total+=Integer.parseInt(str1);
            this.str1=null;
        }
        else if(opr=="-"){
            total-=Integer.parseInt(str1);
            this.str1=null;
        }
        else if(opr=="*"){
            total*=Integer.parseInt(str1);
            this.str1=null;
        }
        else if(opr=="/"){
            total/=Integer.parseInt(str1);
            this.str1=null;
        }
    }
}
