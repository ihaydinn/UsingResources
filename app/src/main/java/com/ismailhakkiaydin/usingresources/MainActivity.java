package com.ismailhakkiaydin.usingresources;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout pnl;
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pnl = new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);
        txtView= new TextView(this);
        pnl.addView(txtView);

        Resources resources = this.getResources();
        int nums[] = resources.getIntArray(R.array.numbers);
        long total = 0;

        for(int i = 0; i<nums.length; i++){
            total+=nums[i];
        }

        Log.e("Total", String.valueOf(total));

        txtView.setText("Total : "+ total);

        setContentView(pnl);
    }
}
