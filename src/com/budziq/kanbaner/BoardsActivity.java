package com.budziq.kanbaner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BoardsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boards);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_boards, menu);
        return true;
    }
}
