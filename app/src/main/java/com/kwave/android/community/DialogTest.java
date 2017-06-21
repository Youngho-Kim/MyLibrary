package com.kwave.android.community;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DialogTest extends AppCompatActivity {
    String msg;
    TextView dialogText;
    MainActivity mainActivity;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        dialogText = (TextView) findViewById(R.id.dialogText);
        button1();
    }

    public void button1(){
        AlertDialog dialog = createDialogBox();
        dialog.show();
    }

    private AlertDialog createDialogBox(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("페이지 선택");
        builder.setMessage("어느 페이지로 가시겠습니까?");
        builder.setIcon(R.mipmap.ic_launcher_round);

        builder.setPositiveButton("공지", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int whichButton){
//                msg = "난 계속 이길을 갈것이야 / " + Integer.toString(whichButton);
                intent = new Intent(getBaseContext(),MainActivity.class);
                msg = "공지 페이지로 갑니다";
                dialogText.setText(msg);
            }
        });

        builder.setNeutralButton("집 소개", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int whichButton){
//                msg = "생각 좀 하자 / " + Integer.toString(whichButton);
                intent = new Intent(getBaseContext(),MainActivity.class);
                msg = "집소개 페이지로 갑니다";
                dialogText.setText(msg);
            }
        });

        builder.setNegativeButton("비용", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int whichButton){

//                msg = "싫어 다른 길로 갈래 ㅠ / " + Integer.toString(whichButton);

                msg = "비용 페이지로 갑니다";
                dialogText.setText(msg);

            }
        });


        AlertDialog dialog = builder.create();
        return dialog;
    }


}
