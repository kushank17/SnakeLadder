package com.kushank.chaudhary.snakeladder;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SingleActivity extends AppCompatActivity {

    private Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
    }


    int player = 0, com = 0, dicep = 0, dicec = 0, turn = 0;

    Random rand = new Random();

    public void dice(View view) {
        displayForResult("");
        displayFor25("");
        if (turn == 0) {
            Button B1 = (Button) findViewById(R.id.diceP1);
            B1.animate().rotation(B1.getRotation() - 360).start();
            dicep = rand.nextInt(6) + 1;

            if (((dicep > 1) && (dicep < 6)) && (player == 0)) {
                player = 0;
                displayForDice1(dicep);
            } else {

                player = player + dicep;
                displayForDice1(dicep);
                displayFor1("");
                displayFor2("");
                displayFor3("");
                displayFor4("");
                displayFor5("");
                displayFor6("");
                displayFor7("");
                displayFor8("");
                displayFor9("");
                displayFor10("");
                displayFor11("");
                displayFor12("");
                displayFor13("");
                displayFor14("");
                displayFor15("");
                displayFor16("");
                displayFor17("");
                displayFor18("");
                displayFor19("");
                displayFor20("");
                displayFor21("");
                displayFor22("");
                displayFor23("");
                displayFor24("");
                displayFor24("");
                displayFor25("");

                if (player > 25) {
                    player -= dicep;
                }
                display();
                if (player == 3) {
                    player += 8;
                } else if (player == 6) {
                    player += 11;
                } else if (player == 9) {
                    player += 9;
                } else if (player == 10) {
                    player += 2;
                } else if (player == 14) {
                    player -= 10;
                } else if (player == 19) {
                    player -= 11;
                } else if (player == 22) {
                    player -= 2;
                } else if (player == 24) {
                    player -= 8;
                }
                if ((player == 11) || (player == 12) || (player == 18) || (player == 17) || (player == 4) ||
                        (player == 8) || (player == 20) || (player == 16)) {
                    h.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            displayFor1("");
                            displayFor2("");
                            displayFor3("");
                            displayFor4("");
                            displayFor5("");
                            displayFor6("");
                            displayFor7("");
                            displayFor8("");
                            displayFor9("");
                            displayFor10("");
                            displayFor11("");
                            displayFor12("");
                            displayFor13("");
                            displayFor14("");
                            displayFor15("");
                            displayFor16("");
                            displayFor17("");
                            displayFor18("");
                            displayFor19("");
                            displayFor20("");
                            displayFor21("");
                            displayFor22("");
                            displayFor23("");
                            displayFor24("");
                            displayFor24("");
                            displayFor25("");
                            display();
                        }
                    }, 1000);
                }
            }

            if (dicep == 6)
                turn = 0;
            else
                turn = 1;

        } else
            ;
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button dice2 = (Button) findViewById(R.id.diceP2);
                dice2.callOnClick();
            }
        }, 1000);
    }

    public void dice1(View view) {
        if (turn == 1) {
            Button B2 = (Button) findViewById(R.id.diceP2);
            B2.animate().rotation(B2.getRotation() - 360).start();
            dicec = rand.nextInt(6) + 1;
            if (((dicec > 1) && (dicec < 6)) && (com == 0)) {
                com = 0;
                displayForDice2(dicec);
            } else {

                com = com + dicec;
                displayForDice2(dicec);
                displayFor1("");
                displayFor2("");
                displayFor3("");
                displayFor4("");
                displayFor5("");
                displayFor6("");
                displayFor7("");
                displayFor8("");
                displayFor9("");
                displayFor10("");
                displayFor11("");
                displayFor12("");
                displayFor13("");
                displayFor14("");
                displayFor15("");
                displayFor16("");
                displayFor17("");
                displayFor18("");
                displayFor19("");
                displayFor20("");
                displayFor21("");
                displayFor22("");
                displayFor23("");
                displayFor24("");
                displayFor24("");
                displayFor25("");

                if (com > 25) {
                    com -= dicep;
                }
                display();
                if (com == 3) {
                    com += 8;
                } else if (com == 6) {
                    com += 11;
                } else if (com == 9) {
                    com += 9;
                } else if (com == 10) {
                    com += 2;
                } else if (com == 14) {
                    com -= 10;
                } else if (com == 19) {
                    com -= 11;
                } else if (com == 22) {
                    com -= 2;
                } else if (com == 24) {
                    com -= 8;
                }
                if ((com == 11) || (com == 12) || (com == 18) || (com == 17) || (com == 4) || (com == 8) || (com == 20) || (com == 16)) {
                    h.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            displayFor1("");
                            displayFor2("");
                            displayFor3("");
                            displayFor4("");
                            displayFor5("");
                            displayFor6("");
                            displayFor7("");
                            displayFor8("");
                            displayFor9("");
                            displayFor10("");
                            displayFor11("");
                            displayFor12("");
                            displayFor13("");
                            displayFor14("");
                            displayFor15("");
                            displayFor16("");
                            displayFor17("");
                            displayFor18("");
                            displayFor19("");
                            displayFor20("");
                            displayFor21("");
                            displayFor22("");
                            displayFor23("");
                            displayFor24("");
                            displayFor24("");
                            displayFor25("");
                            display();
                        }
                    }, 1000);
                }
            }
            if (dicec == 6) {
                turn = 1;
            } else turn = 0;
        } else
            ;
    }

    public void display() {
        switch (com) {
            case 1:
                displayFor1("C");
                break;
            case 2:
                displayFor2("C");
                break;

            case 3:
                displayFor3("C");
                break;
            case 4:
                displayFor4("C");
                break;
            case 5:
                displayFor5("C");
                break;
            case 6:
                displayFor6("C");
                break;
            case 7:
                displayFor7("C");
                break;
            case 8:
                displayFor8("C");
                break;
            case 9:
                displayFor9("C");
                break;
            case 10:
                displayFor10("C");
                break;
            case 11:
                displayFor11("C");
                break;
            case 12:
                displayFor12("C");
                break;
            case 13:
                displayFor13("C");
                break;
            case 14:
                displayFor14("C");
                break;
            case 15:
                displayFor15("C");
                break;
            case 16:
                displayFor16("C");
                break;
            case 17:
                displayFor17("C");
                break;
            case 18:
                displayFor18("C");
                break;
            case 19:
                displayFor19("C");
                break;
            case 20:
                displayFor20("C");
                break;
            case 21:
                displayFor21("C");
                break;
            case 22:
                displayFor22("C");
                break;
            case 23:
                displayFor23("C");
                break;
            case 24:
                displayFor24("C");
                break;
            case 25: {
                displayFor25("C");
                displayForResult("COM win");
                reset(findViewById(R.id.reset));
            }

            break;

        }

        switch (player) {
            case 1:
                displayFor1("P");
                break;
            case 2:
                displayFor2("P");
                break;

            case 3:
                displayFor3("P");
                break;
            case 4:
                displayFor4("P");
                break;
            case 5:
                displayFor5("P");
                break;
            case 6:
                displayFor6("P");
                break;
            case 7:
                displayFor7("P");
                break;
            case 8:
                displayFor8("P");
                break;
            case 9:
                displayFor9("P");
                break;
            case 10:
                displayFor10("P");
                break;
            case 11:
                displayFor11("P");
                break;
            case 12:
                displayFor12("P");
                break;
            case 13:
                displayFor13("P");
                break;
            case 14:
                displayFor14("P");
                break;
            case 15:
                displayFor15("P");
                break;
            case 16:
                displayFor16("P");
                break;
            case 17:
                displayFor17("P");
                break;
            case 18:
                displayFor18("P");
                break;
            case 19:
                displayFor19("P");
                break;
            case 20:
                displayFor20("P");
                break;
            case 21:
                displayFor21("P");
                break;
            case 22:
                displayFor22("P");
                break;
            case 23:
                displayFor23("P");
                break;
            case 24:
                displayFor24("P");
                break;
            case 25: {
                displayFor25("P");
                displayForResult("YOU win");
                reset(findViewById(R.id.reset));
            }
            break;
        }
    }

    public void reset(View view) {
        dicec = 0;
        dicep = 0;
        player = 0;
        com = 0;
        turn = 0;
        displayForDice1(dicep);
        displayForDice2(dicec);
        displayFor1("");
        displayFor2("");
        displayFor3("");
        displayFor4("");
        displayFor5("");
        displayFor6("");
        displayFor7("");
        displayFor8("");
        displayFor9("");
        displayFor10("");
        displayFor11("");
        displayFor12("");
        displayFor13("");
        displayFor14("");
        displayFor15("");
        displayFor16("");
        displayFor17("");
        displayFor18("");
        displayFor19("");
        displayFor20("");
        displayFor21("");
        displayFor22("");
        displayFor23("");
        displayFor24("");
        displayFor24("");
        Toast.makeText(this, "Nice Game.", Toast.LENGTH_SHORT).show();
    }

    private void displayFor1(String s) {
        TextView TextView = (TextView) findViewById(R.id.id1);
        TextView.setText(s);
    }

    private void displayFor2(String s) {
        TextView TextView = (TextView) findViewById(R.id.id2);
        TextView.setText(s);
    }

    private void displayFor3(String s) {
        TextView TextView = (TextView) findViewById(R.id.id3);
        TextView.setText(s);
    }

    private void displayFor4(String s) {
        TextView TextView = (TextView) findViewById(R.id.id4);
        TextView.setText(s);
    }

    private void displayFor5(String s) {
        TextView TextView = (TextView) findViewById(R.id.id5);
        TextView.setText(s);
    }

    private void displayFor6(String s) {
        TextView TextView = (TextView) findViewById(R.id.id6);
        TextView.setText(s);
    }

    private void displayFor7(String s) {
        TextView TextView = (TextView) findViewById(R.id.id7);
        TextView.setText(s);
    }

    private void displayFor8(String s) {
        TextView TextView = (TextView) findViewById(R.id.id8);
        TextView.setText(s);
    }

    private void displayFor9(String s) {
        TextView TextView = (TextView) findViewById(R.id.id9);
        TextView.setText(s);
    }

    private void displayFor10(String s) {
        TextView TextView = (TextView) findViewById(R.id.id10);
        TextView.setText(s);
    }

    private void displayFor11(String s) {
        TextView TextView = (TextView) findViewById(R.id.id11);
        TextView.setText(s);
    }

    private void displayFor12(String s) {
        TextView TextView = (TextView) findViewById(R.id.id12);
        TextView.setText(s);
    }

    private void displayFor13(String s) {
        TextView TextView = (TextView) findViewById(R.id.id13);
        TextView.setText(s);
    }

    private void displayFor14(String s) {
        TextView TextView = (TextView) findViewById(R.id.id14);
        TextView.setText(s);
    }

    private void displayFor15(String s) {
        TextView TextView = (TextView) findViewById(R.id.id15);
        TextView.setText(s);
    }

    private void displayFor16(String s) {
        TextView TextView = (TextView) findViewById(R.id.id16);
        TextView.setText(s);
    }

    private void displayFor17(String s) {
        TextView TextView = (TextView) findViewById(R.id.id17);
        TextView.setText(s);
    }

    private void displayFor18(String s) {
        TextView TextView = (TextView) findViewById(R.id.id18);
        TextView.setText(s);
    }

    private void displayFor19(String s) {
        TextView TextView = (TextView) findViewById(R.id.id19);
        TextView.setText(s);
    }

    private void displayFor20(String s) {
        TextView TextView = (TextView) findViewById(R.id.id20);
        TextView.setText(s);
    }

    private void displayFor21(String s) {
        TextView TextView = (TextView) findViewById(R.id.id21);
        TextView.setText(s);
    }

    private void displayFor22(String s) {
        TextView TextView = (TextView) findViewById(R.id.id22);
        TextView.setText(s);
    }

    private void displayFor23(String s) {
        TextView TextView = (TextView) findViewById(R.id.id23);
        TextView.setText(s);
    }

    private void displayFor24(String s) {
        TextView TextView = (TextView) findViewById(R.id.id24);
        TextView.setText(s);
    }

    private void displayFor25(String s) {
        TextView TextView = (TextView) findViewById(R.id.id25);
        TextView.setText(s);
    }

    private void displayForResult(String s) {
        TextView TextView = (TextView) findViewById(R.id.result);
        TextView.setText(s);
        TextView.setAlpha(0f);
        TextView.animate().alpha(1f).setDuration(500);
    }

    public void displayForDice1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.dice1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForDice2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.dice2);
        scoreView.setText(String.valueOf(score));
    }

}
