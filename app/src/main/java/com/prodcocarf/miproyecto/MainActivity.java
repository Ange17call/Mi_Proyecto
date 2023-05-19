package com.prodcocarf.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button irRegistrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	//ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_usuarios",null,1);
        irRegistrarUsuario=(Button)findViewById(R.id.btnOpcionRegistro);
        irRegistrarUsuario.setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {

        	Intent miIntent=null;

        	//switch (view.getId()){
               // case R.id.btnOpcionRegistro:
                	miIntent=new Intent(MainActivity.this,RegistroUsuariosActivity.class);
                	//break;

       // }
       // if (miIntent!=null){
        //    startActivity(miIntent);
       // }

    }
}