package van.sami.mytranseferingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    Button btn;
    TextView amm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radiogroup);
        textView = findViewById(R.id.textView7);
        btn = findViewById(R.id.button);
        amm = findViewById(R.id.amount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rd = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(rd);
                amm=findViewById(R.id.amount);
                String choice= radioButton.getText().toString();
                String r =  amm.getText().toString();
                float b = Float.parseFloat(r);
                if(choice.equals("usd")){
                float rez= (float) (b*0.097);
                 textView.setText("Value:" +rez+" USD");}
                else if (choice.equals("euro")){
                float rez= (float) (b*0.091);
                textView.setText("Value:" +rez+" EURO");
            }}

        });
    }


    }






