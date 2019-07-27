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
        int a = (int) Math.floor(Math.random()*5);
        //trần nhà : làm tròn lên
//        int b = (int) Math.ceil(1.1);
        //sàn nhà : làm tròn xuống
//        int b = (int) Math.floor(1.1);

//        Log.d("BBB",b + "");
    }
}
