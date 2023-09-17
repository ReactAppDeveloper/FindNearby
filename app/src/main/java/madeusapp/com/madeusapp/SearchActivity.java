package madeusapp.com.madeusapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {
    private EditText searchQuery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchQuery = (EditText) findViewById(R.id.editTextQuery);
        String query = searchQuery.getText().toString();
        
    }
}
