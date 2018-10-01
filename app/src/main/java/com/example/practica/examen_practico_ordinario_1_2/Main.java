package com.example.practica.examen_practico_ordinario_1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class Main extends AppCompatActivity {
    int vida=1;
    TextView txtVwResultado;
    RadioGroup rdGrp;
    RadioButton rdBtnAlgebraica,rdBtnAritmetica;
    EditText edtTxtRes, edtTxtNum1,edtTxtNum2,edtTxtNum3,edtTxtNum4,edtTxtNum5;
    Button btnVerificar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdBtnAlgebraica= findViewById(R.id.rdBtnAlgebraica);
        rdBtnAritmetica= findViewById(R.id.rdBtnAritmetica);
        edtTxtRes      = findViewById(R.id.edtTxtRes);
        btnVerificar2  = findViewById(R.id.btnVerificar2);
        txtVwResultado = findViewById(R.id.txtVwResultado);
        edtTxtNum1     = findViewById(R.id.edtTxtNum1);
        edtTxtNum2     = findViewById(R.id.edtTxtNum2);
        edtTxtNum3     = findViewById(R.id.edtTxtNum3);
        edtTxtNum4     = findViewById(R.id.edtTxtNum4);
        edtTxtNum5     = findViewById(R.id.edtTxtNum5);
        rdGrp          = findViewById(R.id.rdGrp);
        prueba();
    } //CIERRE ONCREATE


    public void onRadioButtonClicked(View v){

        if (rdBtnAritmetica.isChecked()) {
            Aritmetica();
        } else if (rdBtnAlgebraica.isChecked()) {
            Algebraica();
        }
        else{
            Toast.makeText(Main.this, "Selecciona algun metodo y inserta un valor", Toast.LENGTH_SHORT).show();

        }
    }

    public void Aritmetica() {
        Random r = new Random();
        //RANDOM CLASS
        int minNumber = 1;
        int maxNumber = 10;
        int an= r.nextInt((maxNumber-minNumber)+1)+minNumber; //NUMERO INICIAL
        int D = r.nextInt((maxNumber-minNumber)+1)+minNumber; //DISTANCIA RANDOM


        int number2 = an+(2-1)*D;
        int number3 = an+(3-1)*D;
        int number4 = an+(4-1)*D;
        int number5 = an+(5-1)*D;

        edtTxtNum1.setText(String.valueOf(an));
        edtTxtNum2.setText(String.valueOf(number2));
        edtTxtNum3.setText(String.valueOf(number3));
        edtTxtNum4.setText(String.valueOf(number4));
        edtTxtNum5.setText(String.valueOf(number5));



        //RANDOM PARA ELEGIR DISTANCIA
        Random r2 = new Random();
        int minNumber2 = 2;
        int maxNumber2 = 5;
        int numelegir = r2.nextInt((maxNumber2-minNumber2)+1)+minNumber2;



        if(numelegir==2){
            txtVwResultado.setText(edtTxtNum2.getText().toString());
            edtTxtNum2.setText("calcule");
        }

        else if(numelegir==3){
            txtVwResultado.setText(edtTxtNum3.getText().toString());
            edtTxtNum3.setText("calcule");
        }

        else if(numelegir==4){
            txtVwResultado.setText(edtTxtNum4.getText().toString());
            edtTxtNum4.setText("calcule");
        }

        else if(numelegir==5){
            txtVwResultado.setText(edtTxtNum5.getText().toString());
            edtTxtNum5.setText("calcule");
        }

    }

    public void Algebraica(){

        Random r = new Random();
        int minNumber = 1;
        int maxNumber = 10;
        int minNumber2 = 2;
        int maxNumber2 = 5;
        int an= r.nextInt((maxNumber-minNumber)+1)+minNumber; //NUMERO INICIAL
        int D = r.nextInt((maxNumber2-minNumber2)+1)+minNumber2; //DISTANCIA RANDOM


        //N ES EL TERMINO A CALCULAR Y R/D ES EL QUE MULTIPLICA LOS TERMINOS
        //CHANSE LA FORMULA ESTA MAL
        int number2 = an* (int) (Math.pow((D),(2-1))); //RANDOM ES UN DOUBLE SOO CAST IT TO INTEGER
        int number3 = an* (int) (Math.pow((D),(3-1)));
        int number4 = an* (int) (Math.pow((D),(4-1)));
        int number5 = an* (int) (Math.pow((D),(5-1)));

        edtTxtNum1.setText(String.valueOf(an));
        edtTxtNum2.setText(String.valueOf(number2));
        edtTxtNum3.setText(String.valueOf(number3));
        edtTxtNum4.setText(String.valueOf(number4));
        edtTxtNum5.setText(String.valueOf(number5));

        //MORE RANDOM FOR CHOOSEN NUM
        Random r2 = new Random();
        int minNumber3 = 2;
        int maxNumber3 = 5;
        int numelegir = r2.nextInt((maxNumber3-minNumber3)+1)+minNumber3;

        if(numelegir==2){
            txtVwResultado.setText(edtTxtNum2.getText().toString());
            edtTxtNum2.setText("calcule");
        }

        else if(numelegir==3){
            txtVwResultado.setText(edtTxtNum3.getText().toString());
            edtTxtNum3.setText("calcule");
        }

        else if(numelegir==4){
            txtVwResultado.setText(edtTxtNum4.getText().toString());
            edtTxtNum4.setText("calcule");
        }

        else if(numelegir==5){
            txtVwResultado.setText(edtTxtNum5.getText().toString());
            edtTxtNum5.setText("calcule");
        }
    }

    public void prueba(){

        rdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (rdBtnAlgebraica.isChecked()){
                    Toast.makeText(Main.this, "Algebraico", Toast.LENGTH_SHORT).show();
                }else {
                    Aritmetica();
                    Toast.makeText(Main.this, "Aritmetico", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void prueba2(){

        if (rdBtnAlgebraica.isChecked()){
            Toast.makeText(Main.this, "Algebraico", Toast.LENGTH_SHORT).show();
            Algebraica();
        }else {
            Aritmetica();
            Toast.makeText(Main.this, "Aritmetico", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick2(View view) {
        int ver1= Integer.parseInt(edtTxtRes.getText().toString());
        int ver2= Integer.parseInt(txtVwResultado.getText().toString());

        if (ver1==ver2){
            Toast.makeText(Main.this, "GANASTE", Toast.LENGTH_SHORT).show();
            Toast.makeText(Main.this, "REINICIANDO", Toast.LENGTH_SHORT).show();
            prueba2();
            vida = 1;
        }else {

            switch (vida){
                case 1:
                    Toast.makeText(Main.this, "INCORRECTO(QUEDAN 2 INTENTOS)", Toast.LENGTH_SHORT).show();
                    vida++;
                    break;
                case 2:
                    Toast.makeText(Main.this, "INCORRECTO (QUEDA 1 INTENTOS)", Toast.LENGTH_SHORT).show();
                    vida++;
                    break;
                case 3:
                    Toast.makeText(Main.this, "PERDISTE: REINICIANDO", Toast.LENGTH_SHORT).show();
                    vida = 1;
                    prueba2();

                    break;
                default:
                    Toast.makeText(Main.this, "error", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
