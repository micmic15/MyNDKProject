package pl.edu.wat.student.myndkproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSumButtonClick(View view){

        try{
            EditText et1 = (EditText)findViewById(R.id.firstnum);
            EditText et2 = (EditText)findViewById(R.id.secondnum);
            Integer first = Integer.valueOf(et1.getText().toString());
            Integer second = Integer.valueOf(et2.getText().toString());
            TextView textView = (TextView)findViewById(R.id.wynik);
            textView.setText(": "+ addTwoNumbers(first,second)+" :");
        }catch (Exception e){
            System.out.println(e);
            Toast.makeText(getApplication().getBaseContext(),"Proszę uzupełnić puste pola",Toast.LENGTH_LONG).show();
        }

    }

    public native int addTwoNumbers(int a, int b);

    static {
        System.loadLibrary("nativefunction");
    }

}
