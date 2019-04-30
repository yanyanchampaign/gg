package com.example.testforlink;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManuPage extends AppCompatActivity {

    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //beijing
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("http://www.yohomars.com/yohomars/seo/topic/282/");
            }
        });

        //guangzhou
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("http://www.yohomars.com/yohomars/seo/topic/322/");
            }
        });

        //shanghai
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("http://www.yohomars.com/yohomars/seo/topic/272/");
            }
        });

        //shenzhen
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("http://www.yohomars.com/yohomars/seo/topic/1056/");
            }
        });

        //chengdu
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("http://www.yohomars.com/yohomars/seo/topic/1056/");
            }
        });

        //hangzhou
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("http://www.yohomars.com/yohomars/seo/topic/286/");
            }
        });

        //google map
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.google.com/maps");
            }
        });
    }

    public void clicked_btn(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
       /* button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }*/

    /*public void browser1 (View view) {
        Intent beijing = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yohomars.com/yohomars/seo/topic/282/"));
        startActivity(beijing);
    }
    public void browser2 (View view) {
        Intent guangzhou = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yohomars.com/yohomars/seo/topic/322/"));
        startActivity(guangzhou);
    }
    public void browser3 (View view) {
        Intent shanghai = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yohomars.com/yohomars/seo/topic/272/"));
        startActivity(shanghai);
    }
    public void browser4 (View view) {
        Intent shenzhen = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yohomars.com/yohomars/seo/topic/1056/"));
        startActivity(shenzhen);
    }
    public void browser5 (View view) {
        Intent hangzhou = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yohomars.com/yohomars/seo/topic/278/"));
        startActivity(hangzhou);
    }
    public void browser6 (View view) {
        Intent chengdu = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yohomars.com/yohomars/seo/topic/286/"));
        startActivity(chengdu);
    }*/

}
