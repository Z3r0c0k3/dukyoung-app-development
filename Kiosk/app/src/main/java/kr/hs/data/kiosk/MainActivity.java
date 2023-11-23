package kr.hs.data.kiosk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById( R.id.listView );
        CustomListAdapter customAdapter = new CustomListAdapter();

        customAdapter.addMenu(new Menu("아아", 3000, R.drawable.iceamericano));
        customAdapter.addMenu(new Menu("뜨아", 2500, R.drawable.hotamericano));
        customAdapter.addMenu(new Beverage("아이스티", 4000, false, R.drawable.icetea));
        customAdapter.addMenu(new Beverage("레몬에이드", 4500, false, R.drawable.lemonade));
        customAdapter.addMenu(new Coffee("카페모카", 4000, true, false, "과테말라", R.drawable.cafemocha));
        customAdapter.addMenu(new Coffee("카페모카", 4000, true, false, "콜롬비아", R.drawable.cafemocha));
        customAdapter.addMenu(new Coffee("캬라멜 마키야토", 4500, true, false, "콜롬비아", R.drawable.caramel));
        customAdapter.addMenu(new Coffee("캬라멜 마키야토", 4500, true, false, "과테말라", R.drawable.caramel));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /**
             * ListView의 Item을 Click 할 때 수행할 동작
             * @param parent 클릭이 발생한 AdapterView.
             * @param view 클릭한 AdapterView 내의 View(Adapter에 의해 제공되는 View).
             * @param position 클릭한 Item의 position
             * @param id 클릭된 Item의 Id
             */
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //customAdapter.getItem(position)의 Return 값은 Object 형.
                //실제 Item의 자료형은 Menu 형이기 때문에
                //형변환을 시켜야 DetailActivity로 넘길 수 있다.
                Menu menudata = (Menu)(customAdapter.getItem(position));

                //new Intent(현재 Activity의 Context, 시작할 Activity 클래스)
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                //putExtra(key, value)
                intent.putExtra("menu", menudata);
                startActivity(intent);
            }
        });
        listView.setAdapter(customAdapter);
    }
}