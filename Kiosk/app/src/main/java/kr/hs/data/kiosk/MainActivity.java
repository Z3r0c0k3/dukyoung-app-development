package kr.hs.data.kiosk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import kotlin.collections.UArraySortingKt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = new String[30];
        for (int i = 0; i < items.length ; i++) items[i] = (i+1) + ". FLAG{Th1s_1s_f@kE_F1@GGGGGG!!!!}";

        ListView listView = findViewById( R.id.listView );
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(arrayAdapter);

    }
}