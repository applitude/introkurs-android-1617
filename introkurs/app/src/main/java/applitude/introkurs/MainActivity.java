package applitude.introkurs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button first_button;

    //what happens when you first open the activity/"app window"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    //method with the name init
    public void init(){

        //assign the buttons xml id to the first_button
        first_button = (Button)findViewById(R.id.forste_knapp);

        //so you can have something happen when you click the button
        first_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                //changes from MainActivity into CounterActivity

                Intent i = new Intent(MainActivity.this, CounterActivity.class);
                //Important to remember this, this will start the activity up first
                startActivity(i);

            }

        });

    }
}
