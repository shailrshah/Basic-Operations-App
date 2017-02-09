package com.example.basicoperations;

import android.support.v7.app.ActionBarActivity;
import android.widget.*;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

	EditText a, b;
	Button add, sub, mul, div;
	TextView op;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        op = (TextView) findViewById(R.id.op);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float n1=Float.parseFloat(a.getText().toString());
		        float n2=Float.parseFloat(b.getText().toString());

				op.setText(String.valueOf(n1+n2));
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float n1=Float.parseFloat(a.getText().toString());
		        float n2=Float.parseFloat(b.getText().toString());

				op.setText(String.valueOf(n1-n2));
			}
		});

        mul.setOnClickListener(new View.OnClickListener() {
	
        	@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float n1=Float.parseFloat(a.getText().toString());
		        float n2=Float.parseFloat(b.getText().toString());
		
				op.setText(String.valueOf(n1*n2));
			}
		});

		div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float n1=Float.parseFloat(a.getText().toString());
		        float n2=Float.parseFloat(b.getText().toString());
		
				op.setText(String.valueOf(n1/n2));
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
