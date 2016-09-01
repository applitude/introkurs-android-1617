package applitude.introkurs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



/*
* You can find useful guides and tips on androids own developer site:
* https://developer.android.com/develop/index.html
*
* */

public class CounterActivity extends Activity {

    TextView counter_text;
    Button button_counter;
    int tall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        counting();
        tall = 0;
    }

    //method with the name counting
    public void counting(){

        //assigning xml id to their respective objects
        counter_text = (TextView) findViewById(R.id.counter_text);
        button_counter = (Button) findViewById(R.id.button_counter);

        //setting clickListener //so you can click the button
        button_counter.setOnClickListener(new View.OnClickListener(){
        //This button will increase a number and change the text
            @Override
            public void onClick(View v){
                tall++;
                counter_text.setText(Integer.toString(tall));

            }

        });
    }

    @Override
    public void onBackPressed() {
        //everything in the original onBackPressed method happens
        super.onBackPressed();

        //Makes an alert box with text appear
        Toast.makeText(this, "You have pressed the back button!", Toast.LENGTH_LONG).show();
    }

}
