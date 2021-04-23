package fatma.calculator;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCalculator;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculator=(Button) findViewById(R.id.btn_Calculator);
        constraintLayout=(ConstraintLayout) findViewById(R.id.constraint);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(i);
            }
        });
    }

    public void OnColorClick(View v){
        constraintLayout.setBackgroundColor(Color.GREEN);

    }
}
