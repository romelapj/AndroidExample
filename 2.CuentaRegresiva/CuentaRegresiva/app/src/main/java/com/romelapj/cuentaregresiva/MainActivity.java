package com.romelapj.cuentaregresiva;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView tvNumero;
    private int numero=8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumero= (TextView) findViewById(R.id.tvNumero);
    }
    public void operar(View v){

        if(v.getId()==R.id.bAumentar) {
            numero++;
        }else if(v.getId()==R.id.bDisminuir){
            numero--;
        }
        if(numero>10){
            tvNumero.setText("Ganaste");
            numero=10;
        }else if(numero<0){
            tvNumero.setText("Perdiste");
            numero=0;
        }else{
            tvNumero.setText(numero+"");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
