package com.example.ticTacToe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button reset,newp,b00,b01,b02,b10,b11,b12,b20,b21,b22;
    TextView player1,player2;
    int indice,indice_p1,indice_p2;
    int matrice [][]={{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        indice=0;
        indice_p1 = 0;
        indice_p2 = 0;




        newp=(Button)findViewById(R.id.button_new);
        reset=(Button)findViewById(R.id.button_reset);
        b00=(Button)findViewById(R.id.button_00);
        b01=(Button)findViewById(R.id.button_01);
        b02=(Button)findViewById(R.id.button_02);
        b10=(Button)findViewById(R.id.button_10);
        b11=(Button)findViewById(R.id.button_11);
        b12=(Button)findViewById(R.id.button_12);
        b20=(Button)findViewById(R.id.button_20);
        b21=(Button)findViewById(R.id.button_21);
        b22=(Button)findViewById(R.id.button_22);

        player1=(TextView)findViewById(R.id.textView_p1);
        player2=(TextView)findViewById(R.id.textView_p2);

        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(matrice[0][0]==-1)
               {
                   indice++;
                   if(indice%2==0)
                   {
                       b00.setText("O");
                       matrice[0][0]=0;

                       if ((matrice[0][0]==0)&&(matrice[0][1]==0)&&(matrice[0][2]==0))
                       {
                           indice_p2++;
                           Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                           player2.setText("Player2: "+indice_p2);
                           init();
                       }
                       else
                            if((matrice[0][0]==0)&&(matrice[1][0]==0)&&(matrice[2][0]==0))
                            {
                                 indice_p2++;
                                 Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                                 player2.setText("Player2: "+indice_p2);
                                 init();
                            }
                            else
                                 if((matrice[0][0]==0)&&(matrice[1][1]==0)&&(matrice[2][2]==0) )
                                    {
                                         indice_p2++;
                                         Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                                         player2.setText("Player2: "+indice_p2);
                                         init();
                                    }
                                 else
                                 if(indice==9){
                                     Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                                     init();
                                 }

                   }
                   else
                   {
                       b00.setText("X");
                       matrice[0][0]=1;

                       if ((matrice[0][0]==1)&&(matrice[0][1]==1)&&(matrice[0][2]==1))
                       {
                           indice_p1++;
                           Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                           player1.setText("Player1: "+indice_p1);
                           init();
                       }
                       else
                           if((matrice[0][0]==1)&&(matrice[1][0]==1)&&(matrice[2][0]==1))
                           {
                               indice_p1++;
                               Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                               player1.setText("Player1: "+indice_p1);
                               init();
                           }
                           else
                                if((matrice[0][0]==1)&&(matrice[1][1]==1)&&(matrice[2][2]==1) )
                                {
                                    indice_p1++;
                                    Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                                    player1.setText("Player1: "+indice_p1);
                                    init();
                                }
                                else
                                if(indice==9)
                                {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                                init();}

                   }
               }
               else
                   Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[0][1]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b01.setText("O");
                        matrice[0][1]=0;

                        if( ((matrice[0][1]==0)&&(matrice[0][0]==0)&&(matrice[0][2]==0)) || ((matrice[0][1]==0)&&(matrice[1][1]==0)&&(matrice[2][1]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                    else
                    {
                        b01.setText("X");
                        matrice[0][1]=1;

                        if( ((matrice[0][1]==1)&&(matrice[0][0]==1)&&(matrice[0][2]==1)) || ((matrice[0][1]==1)&&(matrice[1][1]==1)&&(matrice[2][1]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9) {
                            Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[0][2]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b02.setText("O");
                        matrice[0][2]=0;

                        if( ((matrice[0][2]==0)&&(matrice[0][1]==0)&&(matrice[0][0]==0)) || ((matrice[0][2]==0)&&(matrice[1][2]==0)&&(matrice[2][2]==0)) || ((matrice[0][2]==0)&&(matrice[1][1]==0)&&(matrice[2][0]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                    else
                    {
                        b02.setText("X");
                        matrice[0][2]=1;

                        if( ((matrice[0][2]==1)&&(matrice[0][1]==1)&&(matrice[0][0]==1)) || ((matrice[0][2]==1)&&(matrice[1][2]==1)&&(matrice[2][2]==1)) || ((matrice[0][2]==1)&&(matrice[1][1]==1)&&(matrice[2][0]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[1][0]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b10.setText("O");
                        matrice[1][0]=0;

                        if( ((matrice[1][0]==0)&&(matrice[0][0]==0)&&(matrice[2][0]==0)) || ((matrice[1][0]==0)&&(matrice[1][1]==0)&&(matrice[1][2]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                    else
                    {
                        b10.setText("X");
                        matrice[1][0]=1;

                        if( ((matrice[1][0]==1)&&(matrice[0][0]==1)&&(matrice[2][0]==1)) || ((matrice[1][0]==1)&&(matrice[1][1]==1)&&(matrice[1][2]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[1][1]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b11.setText("O");
                        matrice[1][1]=0;

                        if( ((matrice[1][1]==0)&&(matrice[0][1]==0)&&(matrice[2][1]==0)) || ((matrice[1][1]==0)&&(matrice[1][0]==0)&&(matrice[1][2]==0)) || ((matrice[1][1]==0)&&(matrice[0][0]==0)&&(matrice[2][2]==0)) || ((matrice[1][1]==0)&&(matrice[0][2]==0)&&(matrice[2][0]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                    else
                    {
                        b11.setText("X");
                        matrice[1][1]=1;

                        if( ((matrice[1][1]==1)&&(matrice[0][1]==1)&&(matrice[2][1]==1)) || ((matrice[1][1]==1)&&(matrice[1][0]==1)&&(matrice[1][2]==1)) || ((matrice[1][1]==1)&&(matrice[0][0]==1)&&(matrice[2][2]==1)) || ((matrice[1][1]==1)&&(matrice[0][2]==1)&&(matrice[2][0]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[1][2]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b12.setText("O");
                        matrice[1][2]=0;

                        if( ((matrice[1][2]==0)&&(matrice[0][2]==0)&&(matrice[2][2]==0)) || ((matrice[1][2]==0)&&(matrice[1][1]==0)&&(matrice[1][0]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}
                    }
                    else
                    {
                        b12.setText("X");
                        matrice[1][2]=1;

                        if( ((matrice[1][2]==1)&&(matrice[0][2]==1)&&(matrice[2][2]==1)) || ((matrice[1][2]==1)&&(matrice[1][1]==1)&&(matrice[1][0]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[2][0]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b20.setText("O");
                        matrice[2][0]=0;

                        if( ((matrice[2][0]==0)&&(matrice[1][0]==0)&&(matrice[0][0]==0)) || ((matrice[2][0]==0)&&(matrice[2][1]==0)&&(matrice[2][2]==0)) || ((matrice[2][0]==0)&&(matrice[1][1]==0)&&(matrice[0][2]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                    else
                    {
                        b20.setText("X");
                        matrice[2][0]=1;

                        if( ((matrice[2][0]==1)&&(matrice[1][0]==1)&&(matrice[0][0]==1)) || ((matrice[2][0]==1)&&(matrice[2][1]==1)&&(matrice[2][2]==1)) || ((matrice[2][0]==1)&&(matrice[1][1]==1)&&(matrice[0][2]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[2][1]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b21.setText("O");
                        matrice[2][1]=0;

                        if( ((matrice[2][1]==0)&&(matrice[2][0]==0)&&(matrice[2][2]==0)) || ((matrice[2][1]==0)&&(matrice[1][1]==0)&&(matrice[0][1]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                        if(indice==9) {
                            Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                    else
                    {
                        b21.setText("X");
                        matrice[2][1]=1;

                        if( ((matrice[2][1]==1)&&(matrice[2][0]==1)&&(matrice[2][2]==1)) || ((matrice[2][1]==1)&&(matrice[1][1]==1)&&(matrice[0][1]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(matrice[2][2]==-1)
                {indice++;
                    if(indice%2==0)
                    {
                        b22.setText("O");
                        matrice[2][2]=0;

                        if( ((matrice[2][2]==0)&&(matrice[2][1]==0)&&(matrice[2][0]==0)) || ((matrice[2][2]==0)&&(matrice[1][2]==0)&&(matrice[0][2]==0)) || ((matrice[2][2]==0)&&(matrice[1][1]==0)&&(matrice[0][0]==0)) )
                        {
                            indice_p2++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player2.setText("Player2: "+indice_p2);
                            init();
                        }
                        else
                            if(indice==9)
                            {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                            init();}

                    }
                    else
                    {
                        b22.setText("X");
                        matrice[2][2]=1;

                        if( ((matrice[2][2]==1)&&(matrice[2][1]==1)&&(matrice[2][0]==1)) || ((matrice[2][2]==1)&&(matrice[1][2]==1)&&(matrice[0][2]==1)) || ((matrice[2][2]==1)&&(matrice[1][1]==1)&&(matrice[0][0]==1)) )
                        {
                            indice_p1++;
                            Toast.makeText(MainActivity.this, "YOU WIN!!", Toast.LENGTH_SHORT).show();
                            player1.setText("Player1: "+indice_p1);
                            init();
                        }
                        else
                        if(indice==9)
                        {Toast.makeText(MainActivity.this, "MATCH NULLE!!", Toast.LENGTH_SHORT).show();
                        init();}

                    }
                }
                else
                    Toast.makeText(MainActivity.this, "fauuuux", Toast.LENGTH_SHORT).show();

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                indice_p1=0;
                indice_p2=0;

                init();
                player1.setText("Player1: 0");
                player2.setText("Player2: 0");


            }
        });

        newp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                init();


            }
        });



    }
    public void init(){
        indice = 0;
        matrice[0][0]=-1;
        matrice[0][1]=-1;
        matrice[0][2]=-1;
        matrice[1][0]=-1;
        matrice[1][1]=-1;
        matrice[1][2]=-1;
        matrice[2][0]=-1;
        matrice[2][1]=-1;
        matrice[2][2]=-1;
        b00.setText("");
        b01.setText("");
        b02.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
    }
}
