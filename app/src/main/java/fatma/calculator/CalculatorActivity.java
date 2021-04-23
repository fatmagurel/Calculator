package fatma.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSum,btnSubtract,btnMultiply,btnDivision;
    EditText etNumber1,etNumber2;
    TextView tvResult;
    boolean flag=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btnSum=(Button) findViewById(R.id.btn_Sum);
        btnSum.setOnClickListener(this);
        btnSubtract=(Button) findViewById(R.id.btn_Subtract);
        btnSubtract.setOnClickListener(this);
        btnMultiply=(Button) findViewById(R.id.btn_Multiply);
        btnMultiply.setOnClickListener(this);
        btnDivision=(Button) findViewById(R.id.btn_Division);
        btnDivision.setOnClickListener(this);

        etNumber1=(EditText) findViewById(R.id.et_Number1);
        etNumber2=(EditText) findViewById(R.id.et_Number2);

        tvResult=(TextView) findViewById(R.id.tv_Result);
    }

    @Override
    public void onClick(View v) {
        flag=false;
        int viewId=v.getId();
        double number1=Double.parseDouble(etNumber1.getText().toString());
        double number2=Double.parseDouble(etNumber2.getText().toString());
        double result=0.0;

        switch (viewId){
            case R.id.btn_Sum:
                result=number1+number2;
                break;
            case  R.id.btn_Subtract:
                result=number1-number2;
                break;
            case R.id.btn_Multiply:
                result=number1*number2;
                break;
            case R.id.btn_Division:
                if(number2!=0)
                    result=number1/number2;
                else {
                    flag=true;
                    Toast.makeText(getApplicationContext(), "Divided by 0 Error", Toast.LENGTH_SHORT).show();
                }
                break;
        }

        if (flag){
            tvResult.setText("Divided by 0 Error");
        }else
            tvResult.setText(String.valueOf(result));

    }
}
