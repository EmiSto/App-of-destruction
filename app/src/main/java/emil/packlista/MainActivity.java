package emil.packlista;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textis = (EditText) findViewById(R.id.Textis);
                EditText textis2 = (EditText) findViewById(R.id.Textis2);
                TextView resultat = (TextView) findViewById(R.id.resultat);

                int num1 = Integer.parseInt(textis.getText().toString());
                int num2 = Integer.parseInt(textis2.getText().toString());
                int result = num1 + num2;
                resultat.setText(result + "");
            }
        });
    }
    
    public void hejEmil() {
        int emil = 9001;
    }
}
