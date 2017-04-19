package/**/
com.example.foreverest.helloandroid;

import //

        android.support.v7.app.AppCompatActivity;
import
        //
        android.os.Bundle;
import/**/android.view.View;
import android/**/.widget.EditText;

/*

public class MainActivity extends
        //AppCompatActivity
        AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchButtonOnClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        if (message.isEmpty()) {
            editText.setText("Hello Android !");
        }
        else {
            editText.setText("");
        }
    }

    public void crashButtonOnClick(View view) {
        int a = 1/0; //exception
    }

}
 */

public/**/class/**/
///
MainActivity/**/extends
        //AppCompatActivity
        AppCompatActivity {
// }
    /* } */
    private static final String str = "@Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); }";

    @Override protected/**/void/*
    */
    //
    onCreate/**/
    //
    (Bundle
            //
             savedInstanceState/**/)/**/
             {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                 String str = "}";
                 /*//}
                 }*/
                 // }
    }

    public void switchButtonOnClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        if (message.isEmpty()) {
            editText.setText("Hello Android !");
        }
        else {
            editText.setText("");
        }
    }

    public void crashButtonOnClick(View view) {
        int a = 1/0; //exception
    }

}
