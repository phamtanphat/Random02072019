package khoapham.ptp.phamtanphat.random02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Builtin function
//        int a = (int) Math.floor(Math.random()*5);
        //trần nhà : làm tròn lên
//        int b = (int) Math.ceil(1.1);
        //sàn nhà : làm tròn xuống
//        int b = (int) Math.floor(1.1);
        //Tìm số chính phương 0 - 100
//        int canbac2 = (int) Math.sqrt(100);
////        Log.d("BBB",b + "");
//        Log.d("BBB",canbac2 + "");
        //Bài toán kiểm tra số chính phương
        for (int i = 0; i<= 100 ; i++){
            if (Math.sqrt(i) % 1 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
}
