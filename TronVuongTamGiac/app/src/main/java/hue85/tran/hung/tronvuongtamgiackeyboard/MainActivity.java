package hue85.tran.hung.tronvuongtamgiackeyboard;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_change = findViewById(R.id.btn_change);
        btn_change.setOnClickListener(this);
        Button btn_active = findViewById(R.id.btn_change2);
        btn_active.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn_change) {
            InputMethodManager imeManager = (InputMethodManager) getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
            imeManager.showInputMethodPicker();
        }
        if(view.getId()==R.id.btn_change2) {
            try {
                Intent intent = new Intent();

                //intent.setComponent( new ComponentName("com.android.settings","com.android.settings.Settings$LanguageAndInputSettingsActivity" ));
                intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$InputMethodAndLanguageSettingsActivity"));
                startActivity(intent);
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
