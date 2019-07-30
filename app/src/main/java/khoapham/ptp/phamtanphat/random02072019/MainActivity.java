package khoapham.ptp.phamtanphat.random02072019;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai báo
    TextView txtKetqua;
    EditText edtSomin,edtSomax;
    Button btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1 : Random so min va so max
//            + Không số random bị trùng
//            + Không được random quá tổng số (100 số - 100 lần)
//            + Thông báo khi hết số random
        // 2 : Hiển thị
//            + Kiểu 1 : 1- 5 - 7 - 8 -
//            + Kiểu 2 : 1- 5 - 7 - 8
        //2 : Ánh xạ
        //comand + / : comment code

        txtKetqua = findViewById(R.id.textviewKetqua);
        edtSomax = findViewById(R.id.edittextSomax);
        edtSomin = findViewById(R.id.edittextSomin);
        btnRandom = findViewById(R.id.buttonRandom);

        // yêu cầu chức năng : Click button thì hiển thị số random
        //Điều kiện cần : Phải có số để random
        //Điều kiện đáp ứng :  Số - 2 edittext cung cấp số

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smin = edtSomin.getText().toString();
                String smax = edtSomax.getText().toString();
                //null khong co vùng nhớ , không thể kiểm tra dữ liệu null
                //"" chuỗi rỗng java xử lý
//                Log.d("BBB",  null);
//                Log.d("BBB" , null);
                if (!smin.equals("") && !smax.equals("")){
                    Toast.makeText(MainActivity.this, "Có giá trị", Toast.LENGTH_SHORT).show();
                }else{
                    edtSomax.requestFocus();
                    Toast.makeText(MainActivity.this, "Nhập thiếu giá trị", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
