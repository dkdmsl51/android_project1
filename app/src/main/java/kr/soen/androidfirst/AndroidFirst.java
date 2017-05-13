package kr.soen.androidfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//코드 수정해보기-자바파일로 레이아웃
//TextView 객체를 사용하기 위해 import를 해준다
import android.widget.TextView;

public class AndroidFirst extends AppCompatActivity {

    //activity 초기화 메소드=>콜백 메소드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //마법사가 정의해준 기본 xml 레이아웃으로 뷰(activity)의 내용을 채운다
        //setContentView(R.layout.activity_android_first);
        //TextView 객체 생성=>빈 문자열 상태로 초기화 됨
        TextView myText = new TextView(this);
        myText.setText("코드로 문자열 출력하기");
        //activity의 내용물을 채워주는 setContentView 메소드
        setContentView(myText);
    }
}
