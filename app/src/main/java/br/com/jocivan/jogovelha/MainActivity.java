package br.com.jocivan.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String jogador = "X";
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn1:
                playGame(bt1);
                break;

            case R.id.btn2:
                playGame(bt2);
                break;

            case R.id.btn3:
                playGame(bt3);
                break;

            case R.id.btn4:
                playGame(bt4);
                break;

            case R.id.btn5:
                playGame(bt5);
                break;

            case R.id.btn6:
                playGame(bt6);
                break;

            case R.id.btn7:
                playGame(bt7);
                break;

            case R.id.btn8:
                playGame(bt8);
                break;

            case R.id.btn9:
                playGame(bt9);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

    }

    public void playGame(Button btn) {

        if (jogador == "X") {
            btn.setBackgroundColor(Color.GREEN);
            btn.setText("X");
            jogador = "O";
        } else {
            btn.setBackgroundColor(Color.RED);
            btn.setText("O");
            jogador = "X";
        }

        btn.setEnabled(false);
    }

    public void resetar(View view) {

        bt1.setBackgroundColor(Color.BLUE);
        bt1.setText("");
        bt1.setEnabled(true);

        bt2.setBackgroundColor(Color.BLUE);
        bt2.setText("");
        bt2.setEnabled(true);

        bt3.setBackgroundColor(Color.BLUE);
        bt3.setText("");
        bt3.setEnabled(true);

        bt4.setBackgroundColor(Color.BLUE);
        bt4.setText("");
        bt4.setEnabled(true);

        bt5.setBackgroundColor(Color.BLUE);
        bt5.setText("");
        bt5.setEnabled(true);

        bt6.setBackgroundColor(Color.BLUE);
        bt6.setText("");
        bt6.setEnabled(true);

        bt7.setBackgroundColor(Color.BLUE);
        bt7.setText("");
        bt7.setEnabled(true);


        bt8.setBackgroundColor(Color.BLUE);
        bt8.setText("");
        bt8.setEnabled(true);

        bt9.setBackgroundColor(Color.BLUE);
        bt9.setText("");
        bt9.setEnabled(true);


    }
}