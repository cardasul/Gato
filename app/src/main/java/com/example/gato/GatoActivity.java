package com.example.gato;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GatoActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, bReiniciar, b2player, bVsComputadora;
    RadioGroup  rg;
    RadioButton rbX,rbO;
    TextView txt;
    int Finalizar = 0, turnos = 0, jugados = 0;
    boolean vsComputadora = false;
    private List<Button> desactivados;
    String jugador="",compu="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b2player = findViewById(R.id.btn2Player);
        bVsComputadora = findViewById(R.id.btnVsComputadora);
        bReiniciar = findViewById(R.id.btnReiniciar);
        rg=findViewById(R.id.rg);

        rbO=findViewById(R.id.rbO);
        rbX=findViewById(R.id.rbX);
        txt=findViewById(R.id.txtJugar);


        desactivados = new ArrayList<Button>();

        determinarFigura();

        bVsComputadora.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                vsComputadora = true;
                bVsComputadora.setBackgroundResource(R.drawable.btn_black);
                b2player.setBackgroundResource(R.drawable.btn_border);
                restartM();

                rbO.setVisibility(View.VISIBLE);
                rbX.setVisibility(View.VISIBLE);
                txt.setVisibility(View.VISIBLE);

                boolean tu=quienInicia();

            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               determinarFigura();
            }
        });

        b2player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vsComputadora = false;
                rbO.setVisibility(View.INVISIBLE);
                rbX.setVisibility(View.INVISIBLE);
                txt.setVisibility(View.INVISIBLE);
                bVsComputadora.setBackgroundResource(R.drawable.btn_border);
                b2player.setBackgroundResource(R.drawable.btn_black);
                restartM();
            }
        });
        bReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartM();
                if(vsComputadora){
                    quienInicia();
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b1.setText("X");

                        } else {
                            System.out.println("Turno jugador 2");
                            b1.setText("O");
                        }
                        b1.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b1.setText(jugador);
                        b1.setEnabled(false);
                        desactivados.add(b1);
                        pausa();

                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b2.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b2.setText("O");
                        }
                        b2.setEnabled(false);
                        g();
                        jugados++;

                    } else {
                        b2.setText(jugador);
                        b2.setEnabled(false);
                        desactivados.add(b2);
                        pausa();
                    }
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b3.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b3.setText("O");
                        }
                        b3.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b3.setText(jugador);
                        b3.setEnabled(false);
                        desactivados.add(b3);
                        pausa();
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b4.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b4.setText("O");
                        }
                        b4.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b4.setText(jugador);
                        desactivados.add(b4);
                        b4.setEnabled(false);
                        pausa();
                    }
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b5.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b5.setText("O");
                        }
                        b5.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b5.setText(jugador);
                        b5.setEnabled(false);
                        desactivados.add(b5);
                        pausa();
                    }
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b6.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b6.setText("O");
                        }
                        b6.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b6.setText(jugador);
                        b6.setEnabled(false);
                        desactivados.add(b6);
                        pausa();
                    }
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b7.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b7.setText("O");
                        }
                        b7.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b7.setText(jugador);
                        b7.setEnabled(false);
                        desactivados.add(b7);
                        pausa();
                    }
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b8.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b8.setText("O");
                        }
                        b8.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b8.setText(jugador);
                        b8.setEnabled(false);
                        desactivados.add(b8);
                        pausa();
                    }
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Finalizar == 0) {
                    if (!vsComputadora) {
                        if (jugados % 2 == 0) {
                            System.out.println("Turno jugador 1");
                            b9.setText("X");
                        } else {
                            System.out.println("Turno jugador 2");
                            b9.setText("O");
                        }
                        b9.setEnabled(false);
                        g();
                        jugados++;
                    } else {
                        b9.setText(jugador);
                        b9.setEnabled(false);
                        desactivados.add(b9);
                        pausa();
                    }
                }
            }
        });

    }

    private void determinarFigura() {
        if(rbX.isChecked()){
            jugador="X";
            compu="O";
        } else{
            jugador="O";
            compu="X";
        }
        System.out.println("Jugador: "+jugador);
        System.out.println("Compu: "+compu);
    }

    private boolean quienInicia() {
        boolean tu=Math.random() < 0.5;

        if(tu){
            //ancla
            Toast.makeText(getApplicationContext(), "Inicias tú", Toast.LENGTH_SHORT).show();
        } else{
            rbO.setEnabled(false);
            rbX.setEnabled(false);
            Toast.makeText(getApplicationContext(), "Inicia Computadora", Toast.LENGTH_SHORT).show();
            //Le da la compu
            Random rnd = new Random();
            int opt = rnd.nextInt(9);
            switch (opt) {
                case 0:
                    b1.setText(compu);
                    b1.setEnabled(false);
                    desactivados.add(b1);
                    break;

                case 1:
                    b2.setText(compu);
                    b2.setEnabled(false);
                    desactivados.add(b2);
                    break;

                case 2:
                    b3.setText(compu);
                    b3.setEnabled(false);
                    desactivados.add(b3);
                    break;

                case 3:
                    b4.setText(compu);
                    b4.setEnabled(false);
                    desactivados.add(b4);
                    break;

                case 4:
                    b5.setText(compu);
                    b5.setEnabled(false);
                    desactivados.add(b5);
                    break;

                case 5:
                    b6.setText(compu);
                    b6.setEnabled(false);
                    desactivados.add(b6);
                    break;

                case 6:
                    b7.setText(compu);
                    b7.setEnabled(false);
                    desactivados.add(b7);
                    break;

                case 7:
                    b8.setText(compu);
                    b8.setEnabled(false);
                    desactivados.add(b8);
                    break;

                case 9:
                    b9.setText(compu);
                    b9.setEnabled(false);
                    desactivados.add(b9);
                    break;
            }
        }
    return  tu;
    }

    private void pausa() {
        new CountDownTimer(400, 10) {

            public void onTick(long millisUntilFinished) {
               System.out.println("seconds remaining: " + millisUntilFinished / 1000);
               desactivar();
            }
            public void onFinish() {
                 activar();
                // //deberia activar solo los que sobran :(
                g();
                if (Finalizar == 0) {
                    rbO.setEnabled(false);
                    rbX.setEnabled(false);
                    jugar1();
                }
            }
        }.start();
    }

    private void desactivar() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }

    private void activar() {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        for (int i = 0; i < desactivados.size(); i++) desactivados.get(i).setEnabled(false);

    }


    private void restartM() {
        //eliminamos lo que tengan los botones
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        //habilitamos todos de nuevo
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        //reseteamos las variables
        turnos=0;
        jugados=0;
        Finalizar=0;
        desactivados.clear();

        rbO.setEnabled(true);
        rbX.setEnabled(true);

        determinarFigura();
    }

    public void jugar1() {
        //arreglar: 3 -> 9 -> 4 && 4 -> 6 y parecidos.

        //primer turno
        if (b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (!b5.isEnabled() && turnos == 0) {
            Random rnd = new Random();
            int opt = rnd.nextInt(4);
            switch (opt) {
                case 0:
                    b1.setText(compu);
                    b1.setEnabled(false);
                    desactivados.add(b1);
                    break;

                case 1:
                    b3.setText(compu);
                    b3.setEnabled(false);
                    desactivados.add(b3);
                    break;

                case 2:
                    b7.setText(compu);
                    b7.setEnabled(false);
                    desactivados.add(b7);
                    break;

                case 3:
                    b9.setText(compu);
                    b9.setEnabled(false);
                    desactivados.add(b9);
                    break;
            }
        }//tercer turno =======================================================
        else if (b1.getText() == compu && b9.getText() == compu && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b1.getText() == compu && b2.getText() == compu && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b1.getText() == compu && b3.getText() == compu && b2.isEnabled()) {
            b2.setText(compu);
            b2.setEnabled(false);
            desactivados.add(b2);
        } else if (b1.getText() == compu && b4.getText() == compu && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } else if (b1.getText() == compu && b7.getText() == compu && b4.isEnabled()) {
            b4.setText(compu);
            b4.setEnabled(false);
            desactivados.add(b4);
        } else if (b1.getText() == compu && b5.getText() == compu && b9.isEnabled()) {
            b9.setText(compu);
            b9.setEnabled(false);
            desactivados.add(b9);
        } else if (b1.getText() == compu && b9.getText() == compu && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b2.getText() == compu && b5.getText() == compu && b8.isEnabled()) {
            b8.setText(compu);
            b8.setEnabled(false);
            desactivados.add(b8);
        } else if (b2.getText() == compu && b8.getText() == compu && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b3.getText() == compu && b6.getText() == compu && b9.isEnabled()) {
            b9.setText(compu);
            b9.setEnabled(false);
            desactivados.add(b9);
        } else if (b3.getText() == compu && b9.getText() == compu && b6.isEnabled()) {
            b6.setText(compu);
            b6.setEnabled(false);
            desactivados.add(b6);
        } else if (b3.getText() == compu && b5.getText() == compu && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } else if (b3.getText() == compu && b7.getText() == compu && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b4.getText() == compu && b5.getText() == compu && b6.isEnabled()) {
            b6.setText(compu);
            b6.setEnabled(false);
            desactivados.add(b6);
        } else if (b4.getText() == compu && b6.getText() == compu && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b6.getText() == compu && b5.getText() == compu && b4.isEnabled()) {
            b4.setText(compu);
            b4.setEnabled(false);
            desactivados.add(b4);
        } else if (b7.getText() == compu && b5.getText() == compu && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b7.getText() == compu && b8.getText() == compu && b9.isEnabled()) {
            b9.setText(compu);
            b9.setEnabled(false);
            desactivados.add(b9);
        } else if (b7.getText() == compu && b9.getText() == compu && b8.isEnabled()) {
            b8.setText(compu);
            b8.setEnabled(false);
            desactivados.add(b9);
        } else if (b8.getText() == compu && b9.getText() == compu && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } else if (b8.getText() == compu && b5.getText() == compu && b2.isEnabled()) {
            b2.setText(compu);
            b2.setEnabled(false);
            desactivados.add(b2);
        } else if (b9.getText() == compu && b6.getText() == compu && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b1.getText() == compu && b9.getText() == compu && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b4.getText() == compu && b7.getText() == compu && b1.isEnabled()) {
            b1.setText(compu);
            b1.setEnabled(false);
            desactivados.add(b1);
        } else if (b5.getText() == compu && b9.getText() == compu && b1.isEnabled()) {
            b1.setText(compu);
            b1.setEnabled(false);
            desactivados.add(b1);
        } else if (b2.getText() == compu && b3.getText() == compu && b1.isEnabled()) {
            b1.setText(compu);
            b1.setEnabled(false);
            desactivados.add(b1);
        } //segundo turno ======================================================
        else if (b5.getText() == jugador && b9.getText() == jugador && b1.isEnabled()) {
            b1.setText(compu);
            b1.setEnabled(false);
            desactivados.add(b1);
        } else if (b1.getText() == jugador && b2.getText() == jugador && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b1.getText() == jugador && b3.getText() == jugador && b2.isEnabled()) {
            b2.setText(compu);
            b2.setEnabled(false);
            desactivados.add(b2);
        } else if (b1.getText() == jugador && b4.getText() == jugador && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } else if (b1.getText() == jugador && b7.getText() == jugador && b4.isEnabled()) {
            b4.setText(compu);
            b4.setEnabled(false);
            desactivados.add(b4);
        } else if (b1.getText() == jugador && b5.getText() == jugador && b9.isEnabled()) {
            b9.setText(compu);
            b9.setEnabled(false);
            desactivados.add(b9);
        } else if (b1.getText() == jugador && b9.getText() == jugador && b5.isEnabled()) {
            b5.setText(compu);;
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b2.getText() == jugador && b5.getText() == jugador && b8.isEnabled()) {
            b8.setText(compu);
            b8.setEnabled(false);
            desactivados.add(b8);
        } else if (b2.getText() == jugador && b8.getText() == jugador && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b3.getText() == jugador && b6.getText() == jugador && b9.isEnabled()) {
            b9.setText(compu);
            b9.setEnabled(false);
            desactivados.add(b9);
        } else if (b3.getText() == jugador && b9.getText() == jugador && b6.isEnabled()) {
            b6.setText(compu);
            b6.setEnabled(false);
            desactivados.add(b6);
        } else if (b3.getText() == jugador && b5.getText() == jugador && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } else if (b3.getText() == jugador && b7.getText() == jugador && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b4.getText() == jugador && b5.getText() == jugador && b6.isEnabled()) {
            b6.setText(compu);
            b6.setEnabled(false);
            desactivados.add(b6);
        } else if (b4.getText() == jugador && b6.getText() == jugador && b5.isEnabled()) {
            b5.setText(compu);
            b5.setEnabled(false);
            desactivados.add(b5);
        } else if (b6.getText() == jugador && b5.getText() == jugador && b4.isEnabled()) {
            b4.setText(compu);
            b4.setEnabled(false);
            desactivados.add(b4);
        } else if (b7.getText() == jugador && b5.getText() == jugador && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b7.getText() == jugador && b8.getText() == jugador && b9.isEnabled()) {
            b9.setText(compu);
            b9.setEnabled(false);
            desactivados.add(b9);
        } else if (b7.getText() == jugador && b9.getText() == jugador && b8.isEnabled()) {
            b8.setText(compu);
            b8.setEnabled(false);
            desactivados.add(b8);
        } else if (b8.getText() == jugador && b9.getText() == jugador && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } else if (b8.getText() == jugador && b5.getText() == jugador && b2.isEnabled()) {
            b2.setText(compu);
            b2.setEnabled(false);
            desactivados.add(b2);
        } else if (b9.getText() == jugador && b6.getText() == jugador && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b1.getText() == jugador && b9.getText() == jugador && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } //casos raros
        else if (b5.getText() == jugador && b9.getText() == jugador && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b5.getText() == jugador && b7.getText() == jugador && b9.isEnabled()) {
            b9.setText(compu);
            b9.setEnabled(false);
            desactivados.add(b3);
        } else if (b5.getText() == jugador && b1.getText() == jugador && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } else if (b5.getText() == jugador && b3.getText() == jugador && b1.isEnabled()) {
            b1.setText(compu);
            b1.setEnabled(false);
            desactivados.add(b1);
        } // casos especiales para tapar jugadas
        else if (b1.getText() == jugador && b6.getText() == jugador && b3.isEnabled()) {
            b3.setText(compu);
            b3.setEnabled(false);
            desactivados.add(b3);
        } else if (b1.getText() == jugador && b8.getText() == jugador && b7.isEnabled()) {
            b7.setText(compu);
            b7.setEnabled(false);
            desactivados.add(b7);
        } // casos restantes random
        else {
            if (b1.isEnabled()) {
                b1.setText(compu);
                b1.setEnabled(false);
                desactivados.add(b1);
            }
        }
        turnos++;
        g();
    }

    public void g() {
        if (b1.getText() == b2.getText() && b2.getText() == b3.getText()) {
            whois(b1.getText().toString());
        } else if (b1.getText() == b4.getText() && b4.getText() == b7.getText()) {
            whois(b1.getText().toString());
        } else if (b1.getText() == b5.getText() && b5.getText() == b9.getText()) {
            whois(b1.getText().toString());
        } else if (b2.getText() == b5.getText() && b5.getText() == b8.getText()) {
            whois(b2.getText().toString());
        } else if (b3.getText() == b5.getText() && b5.getText() == b7.getText()) {
            whois(b3.getText().toString());
        } else if (b3.getText() == b6.getText() && b6.getText() == b9.getText()) {
            whois(b3.getText().toString());
        } else if (b4.getText() == b5.getText() && b5.getText() == b6.getText()) {
            whois(b4.getText().toString());
        } else if (b7.getText() == b8.getText() && b8.getText() == b9.getText()) {
            whois(b7.getText().toString());
        } else if (turnos == 5 || jugados==8) {
            whois("E");
        }
    }

    public void whois(String winner) {

        if (vsComputadora) {
            if(winner==jugador){
                Toast.makeText(getApplicationContext(), "Has ganado", Toast.LENGTH_SHORT).show();
                Finalizar = 1;
            }else if(winner==compu){
                Toast.makeText(getApplicationContext(), "Has perdido", Toast.LENGTH_SHORT).show();
                Finalizar = 1;
            }else{
               if(winner=="E"){
                   Toast.makeText(getApplicationContext(), "Ha sido un empate", Toast.LENGTH_SHORT).show();
                   Finalizar = 1;
               }
            }

        } else {
            switch (winner) {
                case "X":
                    Toast.makeText(getApplicationContext(), "Ha ganado X", Toast.LENGTH_SHORT).show();
                    Finalizar = 1;
                    break;

                case "O":
                    Toast.makeText(getApplicationContext(), "Ha ganado O", Toast.LENGTH_SHORT).show();
                    Finalizar = 1;
                    break;

                case "E":
                    Toast.makeText(getApplicationContext(), "Ha sido un empate", Toast.LENGTH_SHORT).show();
                    Finalizar = 1;
            }
        }
    }
}
