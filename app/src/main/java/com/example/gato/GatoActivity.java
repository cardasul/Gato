package com.example.gato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class GatoActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, bReiniciar, b2player, bVsComputadora;
    int Finalizar = 0, turnos = 0, jugados = 0;
    boolean vsComputadora = false;

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

        bVsComputadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vsComputadora = true;
                bVsComputadora.setBackgroundResource(R.drawable.btn_black);
                b2player.setBackgroundResource(R.drawable.btn_border);
                restartM();
            }
        });
        b2player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vsComputadora = false;
                bVsComputadora.setBackgroundResource(R.drawable.btn_border);
                b2player.setBackgroundResource(R.drawable.btn_black);
                restartM();
            }
        });
        bReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartM();
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
                        b1.setText("X");
                        b1.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b2.setText("X");
                        b2.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b3.setText("X");
                        b3.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b4.setText("X");
                        b4.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b5.setText("X");
                        b5.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b6.setText("X");
                        b6.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b7.setText("X");
                        b7.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b8.setText("X");
                        b8.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
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
                        b9.setText("X");
                        b9.setEnabled(false);
                        g();
                        if (Finalizar == 0) {
                            jugar1();
                        }
                    }
                }
            }
        });

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
    }

    public void jugar1() {
        //arreglar: 3 -> 9 -> 4 && 4 -> 6 y parecidos.

        //primer turno
        if (b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (!b5.isEnabled() && turnos == 0) {
            Random rnd = new Random();
            int opt = rnd.nextInt(4);
            switch (opt) {
                case 0:
                    b1.setText("O");
                    b1.setEnabled(false);
                    break;

                case 1:
                    b3.setText("O");
                    b3.setEnabled(false);
                    break;

                case 2:
                    b7.setText("O");
                    b7.setEnabled(false);
                    break;

                case 3:
                    b9.setText("O");
                    b9.setEnabled(false);
                    break;
            }
        }//tercer turno =======================================================
        else if (b1.getText() == "O" && b9.getText() == "O" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b1.getText() == "O" && b2.getText() == "O" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b1.getText() == "O" && b3.getText() == "O" && b2.isEnabled()) {
            b2.setText("O");
            b2.setEnabled(false);
        } else if (b1.getText() == "O" && b4.getText() == "O" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } else if (b1.getText() == "O" && b7.getText() == "O" && b4.isEnabled()) {
            b4.setText("O");
            b4.setEnabled(false);
        } else if (b1.getText() == "O" && b5.getText() == "O" && b9.isEnabled()) {
            b9.setText("O");
            b9.setEnabled(false);
        } else if (b1.getText() == "O" && b9.getText() == "O" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b2.getText() == "O" && b5.getText() == "O" && b8.isEnabled()) {
            b8.setText("O");
            b8.setEnabled(false);
        } else if (b2.getText() == "O" && b8.getText() == "O" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b3.getText() == "O" && b6.getText() == "O" && b9.isEnabled()) {
            b9.setText("O");
            b9.setEnabled(false);
        } else if (b3.getText() == "O" && b9.getText() == "O" && b6.isEnabled()) {
            b6.setText("O");
            b6.setEnabled(false);
        } else if (b3.getText() == "O" && b5.getText() == "O" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } else if (b3.getText() == "O" && b7.getText() == "O" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b4.getText() == "O" && b5.getText() == "O" && b6.isEnabled()) {
            b6.setText("O");
            b6.setEnabled(false);
        } else if (b4.getText() == "O" && b6.getText() == "O" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b6.getText() == "O" && b5.getText() == "O" && b4.isEnabled()) {
            b4.setText("O");
            b4.setEnabled(false);
        } else if (b7.getText() == "O" && b5.getText() == "O" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b7.getText() == "O" && b8.getText() == "O" && b9.isEnabled()) {
            b9.setText("O");
            b9.setEnabled(false);
        } else if (b7.getText() == "O" && b9.getText() == "O" && b8.isEnabled()) {
            b8.setText("O");
            b8.setEnabled(false);
        } else if (b8.getText() == "O" && b9.getText() == "O" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } else if (b8.getText() == "O" && b5.getText() == "O" && b2.isEnabled()) {
            b2.setText("O");
            b2.setEnabled(false);
        } else if (b9.getText() == "O" && b6.getText() == "O" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b1.getText() == "O" && b9.getText() == "O" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b4.getText() == "O" && b7.getText() == "O" && b1.isEnabled()) {
            b1.setText("O");
            b1.setEnabled(false);
        } else if (b5.getText() == "O" && b9.getText() == "O" && b1.isEnabled()) {
            b1.setText("O");
            b1.setEnabled(false);
        } else if (b2.getText() == "O" && b3.getText() == "O" && b1.isEnabled()) {
            b1.setText("O");
            b1.setEnabled(false);
        } //segundo turno ======================================================
        else if (b5.getText() == "X" && b9.getText() == "X" && b1.isEnabled()) {
            b1.setText("O");
            b1.setEnabled(false);
        } else if (b1.getText() == "X" && b2.getText() == "X" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b1.getText() == "X" && b3.getText() == "X" && b2.isEnabled()) {
            b2.setText("O");
            b2.setEnabled(false);
        } else if (b1.getText() == "X" && b4.getText() == "X" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } else if (b1.getText() == "X" && b7.getText() == "X" && b4.isEnabled()) {
            b4.setText("O");
            b4.setEnabled(false);
        } else if (b1.getText() == "X" && b5.getText() == "X" && b9.isEnabled()) {
            b9.setText("O");
            b9.setEnabled(false);
        } else if (b1.getText() == "X" && b9.getText() == "X" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b2.getText() == "X" && b5.getText() == "X" && b8.isEnabled()) {
            b8.setText("O");
            b8.setEnabled(false);
        } else if (b2.getText() == "X" && b8.getText() == "X" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b3.getText() == "X" && b6.getText() == "X" && b9.isEnabled()) {
            b9.setText("O");
            b9.setEnabled(false);
        } else if (b3.getText() == "X" && b9.getText() == "X" && b6.isEnabled()) {
            b6.setText("O");
            b6.setEnabled(false);
        } else if (b3.getText() == "X" && b5.getText() == "X" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } else if (b3.getText() == "X" && b7.getText() == "X" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b4.getText() == "X" && b5.getText() == "X" && b6.isEnabled()) {
            b6.setText("O");
            b6.setEnabled(false);
        } else if (b4.getText() == "X" && b6.getText() == "X" && b5.isEnabled()) {
            b5.setText("O");
            b5.setEnabled(false);
        } else if (b6.getText() == "X" && b5.getText() == "X" && b4.isEnabled()) {
            b4.setText("O");
            b4.setEnabled(false);
        } else if (b7.getText() == "X" && b5.getText() == "X" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b7.getText() == "X" && b8.getText() == "X" && b9.isEnabled()) {
            b9.setText("O");
            b9.setEnabled(false);
        } else if (b7.getText() == "X" && b9.getText() == "X" && b8.isEnabled()) {
            b8.setText("O");
            b8.setEnabled(false);
        } else if (b8.getText() == "X" && b9.getText() == "X" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } else if (b8.getText() == "X" && b5.getText() == "X" && b2.isEnabled()) {
            b2.setText("O");
            b2.setEnabled(false);
        } else if (b9.getText() == "X" && b6.getText() == "X" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b1.getText() == "X" && b9.getText() == "X" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } //casos raros
        else if (b5.getText() == "X" && b9.getText() == "X" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b5.getText() == "X" && b7.getText() == "X" && b9.isEnabled()) {
            b9.setText("O");
            b9.setEnabled(false);
        } else if (b5.getText() == "X" && b1.getText() == "X" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } else if (b5.getText() == "X" && b3.getText() == "X" && b1.isEnabled()) {
            b1.setText("O");
            b1.setEnabled(false);
        } // casos especiales para tapar jugadas
        else if (b1.getText() == "X" && b6.getText() == "X" && b3.isEnabled()) {
            b3.setText("O");
            b3.setEnabled(false);
        } else if (b1.getText() == "X" && b8.getText() == "X" && b7.isEnabled()) {
            b7.setText("O");
            b7.setEnabled(false);
        } // casos restantes random
        else {
            if (b1.isEnabled()) {
                b1.setText("O");
                b1.setEnabled(false);
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
            switch (winner) {
                case "X":
                    Toast.makeText(getApplicationContext(), "Has ganado", Toast.LENGTH_SHORT).show();
                    Finalizar = 1;
                    break;

                case "O":
                    Toast.makeText(getApplicationContext(), "Has perdido", Toast.LENGTH_SHORT).show();
                    Finalizar = 1;

                    break;

                case "E":
                    Toast.makeText(getApplicationContext(), "Ha sido un empate", Toast.LENGTH_SHORT).show();
                    Finalizar = 1;
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
