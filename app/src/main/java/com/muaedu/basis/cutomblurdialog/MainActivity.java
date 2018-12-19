package com.muaedu.basis.cutomblurdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    TextView button;
    @BindView(R.id.button2)
    TextView button2;
    @BindView(R.id.my_image_view)
    ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    void buttonClicked() {
        SampleDialogFragment dialogFragment = SampleDialogFragment.newInstance();
        dialogFragment.show(getSupportFragmentManager(), "");
    }

    @OnClick(R.id.button2)
    void button2Clicked() {
        SampleBottomDialogFragment dialogFragment = SampleBottomDialogFragment.newInstance();
        dialogFragment.show(getSupportFragmentManager(), "");
    }
}
