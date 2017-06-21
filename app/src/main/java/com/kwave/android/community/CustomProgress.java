package com.kwave.android.community;
import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
/**
 * Created by kwave on 2017-06-21.
 */


class CustomProgressBar extends Dialog {
    public CustomProgressBar(Activity activity) {
        super(activity);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //다이얼 로그 제목을 삭제하자
        setContentView(R.layout.custom_progress_bar); // 다이얼로그 보여줄 레이아웃

    }
}