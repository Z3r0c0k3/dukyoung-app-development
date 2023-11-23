package kr.hs.data.kiosk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
public class DetailActivity extends AppCompatActivity {

    private Intent intent;
    private ImageView imageView;

    Button btn_dialog;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // MainActivity에서 보낸 imgRes를 받기위해 getIntent()로 초기화
        intent = getIntent();
        Menu menuData = (Menu) intent.getExtras().get("menu");

        ImageView thumbnail = findViewById((R.id.detail_thumnail));
        thumbnail.setImageResource(menuData.thumnail);

        TextView name = findViewById((R.id.detail_menu_name));
        name.setText(menuData.name);

        TextView price = findViewById((R.id.detail_menu_price));
        price.setText(menuData.price+"원");

        // "imgRes" key로 받은 값은 int 형이기 때문에 getIntExtra(key, defaultValue);
        // 받는 값이 String 형이면 getStringExtra(key);

        Button btn_pay = findViewById(R.id.btn_pay);  // 'btn_pay'는 실제 버튼의 ID로 변경해야 합니다.
        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 대화상자 생성 및 설정
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailActivity.this);
                builder.setTitle("결제 금액 입력");

                // 금액을 입력받을 EditText 추가
                final EditText input = new EditText(DetailActivity.this);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);

                // 확인 버튼 설정
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String amount = input.getText().toString();
                        // 입력받은 금액으로 결제 처리
                        // 예: processPayment(amount);
                    }
                });

                // 취소 버튼 설정
                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }
        });

    }

}
