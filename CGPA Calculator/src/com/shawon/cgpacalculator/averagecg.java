package com.shawon.cgpacalculator;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class averagecg extends Activity {
	
	TextView a;
	Button add,result,reset;
	EditText e5;
	double g=0.00,h;
	int count=0,t=0;
	String o1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.averagecg);
		a=(TextView)findViewById(R.id.textView2);
		add=(Button)findViewById(R.id.bt5);
		e5=(EditText)findViewById(R.id.et3);
	    result=(Button)findViewById(R.id.bt6); 
	    reset=(Button)findViewById(R.id.bt7); 
		
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				o1=e5.getText().toString();
				if(o1.equals(""))
				{
					a.setText("Input Field is Empty. Input Your Value");
				}
				else
				{
					t=1;
					double x=Double.parseDouble(o1);
					e5.setText("");
					Toast t=Toast.makeText(getApplicationContext(), "Data Inserted. Insert Next CGPA And Then Click Add", Toast.LENGTH_LONG);
					t.show();
					g=g+x;
					count++;
				}
				
				
				
			}
		});
		result.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(t==0) 
				{
					a.setText("One Of Input Field is empty. Input Your Value.");
				}
				else
				{
				h=g/count;
				DecimalFormat d=new DecimalFormat("#.##");
				a.setText("Average CGPA Is="+d.format(h));
				}
				
				
			}
		});
		
		reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				e5.setText("");
				a.setText("");
				count=0;
				h=0.0;
				g=0.0;
				t=0;
				
			}
		});
		
				
				
				
			
		
	}
	

}
