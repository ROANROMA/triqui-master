package rodrigo.triqui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    int[] tablero = new int[9];
    ImageView uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    boolean gana, ganao, poner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = (ImageView) findViewById(R.id.uno);
        dos = (ImageView) findViewById(R.id.dos);
        tres = (ImageView) findViewById(R.id.tres);
        cuatro = (ImageView) findViewById(R.id.cuatro);
        cinco = (ImageView) findViewById(R.id.cinco);
        seis = (ImageView) findViewById(R.id.seis);
        siete = (ImageView) findViewById(R.id.siete);
        ocho = (ImageView) findViewById(R.id.ocho);
        nueve = (ImageView) findViewById(R.id.nueve);

        for (int i = 0; i <= 8; i++) {
            tablero[i] = 0;
        }
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.uno:
                uno.setImageResource(R.drawable.x);
                tablero[0]=1;
                verificar();
                break;

            case R.id.dos:
                dos.setImageResource(R.drawable.x);
                tablero[1]=1;
                verificar();
                break;

            case R.id.tres:
                tres.setImageResource(R.drawable.x);
                tablero[2]=1;
                verificar();
                break;

            case R.id.cuatro:
                cuatro.setImageResource(R.drawable.x);
                tablero[3]=1;
                verificar();
                break;

            case R.id.cinco:
                cinco.setImageResource(R.drawable.x);
                tablero[4]=1;
                verificar();
                break;

            case R.id.seis:
                seis.setImageResource(R.drawable.x);
                tablero[5]=1;
                verificar();
               break;

            case R.id.siete:
                siete.setImageResource(R.drawable.x);
                tablero[6]=1;
                verificar();
                break;

            case R.id.ocho:
                ocho.setImageResource(R.drawable.x);
                tablero[7]=1;
               verificar();
                break;

            case R.id.nueve:
                nueve.setImageResource(R.drawable.x);
                tablero[8]=1;
                verificar();
                break;

            default:
                break;
        }
       insertar();
    }


    public void insertar() {
        boolean poner = true;
        int ran = (int) (8*Math.random()) + 1;

         while(poner){
              if(tablero[ran] == 2 | tablero[ran]==1){
                  ran=ran + 1;
                  if(ran==9){
                      ran=0;
                  }
              }else{
                if(tablero[ran] == 0){
                  poner=false;
                  } else{
                      poner = true;
       }
    //}
      switch (ran){

         case 0:
            uno.setImageResource(R.drawable.o);
            tablero[0]=2;
            break;

          case 1:
              dos.setImageResource(R.drawable.o);
              tablero[1]=2;
              break;

          case 2:
              tres.setImageResource(R.drawable.o);
              tablero[2]=2;
              break;

          case 3:
              cuatro.setImageResource(R.drawable.o);
              tablero[3]=2;
              break;

          case 4:
              cinco.setImageResource(R.drawable.o);
              tablero[4]=2;
              break;

          case 5:
              seis.setImageResource(R.drawable.o);
              tablero[5]=2;
              break;

          case 6:
              siete.setImageResource(R.drawable.o);
              tablero[6]=2;
              break;

          case 7:
              ocho.setImageResource(R.drawable.o);
              tablero[7]=2;
              break;

          case 8:
              nueve.setImageResource(R.drawable.o);
              tablero[8]=2;
              break;
           }

    }
         }
    }

      public void verificar (){
          if(tablero[0]==1){
           if (tablero[1]==1){
               if(tablero[2]==1){
              gana=true;
          }
           }
          }
          if(tablero[3]==1){
              if(tablero[4]==1 ){
                 if( tablero[5]==1){
                        gana=true;
          }
              }
          }
          if(tablero[6]==1){
              if (tablero[7]==1 ){
                 if (tablero[8]==1 ){
                        gana=true;
                  }
              }
          }
          if(tablero[0]==1){
              if (tablero[3]==1){
                 if (tablero[6]==1){
              gana=true;
                  }
              }
          }

          if(tablero[1]==1){
             if (tablero[4]==1 ){
               if (tablero[7]==1 ){
                      gana=true;
                  }
              }

          }
          if(tablero[2]==1){
              if (tablero[5]==1 ){
                  if (tablero[8]==1 ){
                      gana=true;
                  }
              }
          }
          if(tablero[0]==1){
              if (tablero[4]==1 ){
                 if (tablero[8]==1 ){
                      gana=true;
                  }
              }
          }
          if(tablero[2]==1){
              if(tablero[4]==1 ){
                if  (tablero[6]==1 ){
                      gana=true;
                  }
              }

          }

          if(gana==true){
              Toast toast = Toast.makeText(this, "El jugador X es el ganador", Toast.LENGTH_LONG);
              toast.show();
              Intent intent= new Intent();
              intent.setClass(MainActivity.this, MainActivity.class);
              startActivity(intent);
              finish();
          }
      }

    public void verificaro (){
        if(tablero[0]==2){
            if (tablero[1]==2){
                if(tablero[2]==2){
                    ganao=true;
                }
            }
        }
        if(tablero[3]==2){
            if(tablero[4]==2 ){
                if( tablero[5]==2){
                    ganao=true;
                }
            }
        }
        if(tablero[6]==2){
            if (tablero[7]==2 ){
                if (tablero[8]==2 ){
                    ganao=true;
                }
            }
        }
        if(tablero[0]==2){
            if (tablero[3]==2){
                if (tablero[6]==2){
                    ganao=true;
                }
            }
        }

        if(tablero[1]==2){
            if (tablero[4]==2 ){
                if (tablero[7]==2 ){
                    ganao=true;
                }
            }

        }
        if(tablero[2]==2){
            if (tablero[5]==2 ){
                if (tablero[8]==2 ){
                    ganao=true;
                }
            }
        }
        if(tablero[0]==2){
            if (tablero[4]==2 ){
                if (tablero[8]==2 ){
                    ganao=true;
                }
            }
        }
        if(tablero[2]==2){
            if(tablero[4]==2 ){
                if  (tablero[6]==2 ){
                    ganao=true;
                }
            }

        }

        if(ganao==true){
            Toast toast = Toast.makeText(this, "El jugador O es el ganador", Toast.LENGTH_LONG);
            toast.show();
            Intent intent= new Intent();
            intent.setClass(MainActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        }
}
}

