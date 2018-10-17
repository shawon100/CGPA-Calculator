package com.shawon.cgpacalculator;

import java.text.DecimalFormat;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	TextView gpa,cgpa;
	EditText e1,e2;
	Button b1,b2,b3,b4,b10;
	double g,r=0.0,s=0.0,c,f,n;
	String op1,op2;
	int t=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gpa=(TextView)findViewById(R.id.tv2);
        cgpa=(TextView)findViewById(R.id.tv3);
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt4);
        b10=(Button)findViewById(R.id.bt8);
        
        
  b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 op1=e1.getText().toString();
				 op2=e2.getText().toString();
			       
				
				if(op1.equals("") || op2.equals(""))
				{
					gpa.setText("One Of Input Field is Empty.Check Your Input");
					cgpa.setText("");
					
				}
				else
				{
					t=1;
					n=Double.parseDouble(op1);
					c=Double.parseDouble(op2);
					e2.setText("");
					e1.setText("");
					Toast t=Toast.makeText(getApplicationContext(), "Data Inserted. Insert Next Subject Number And Credit. Then Click Add Button", Toast.LENGTH_LONG);
					t.show();
					
		
					if(n>=80)
					{
						g=4.00;
						gpa.setText("Subject Letter Grade A+ And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
					}
					else if(n>=75 && n<=79)
					{
						g=3.75;
						gpa.setText("Subject Letter Grade A And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
						
					}
					else if(n>=70 && n<=74)
					{
						g=3.50;
						gpa.setText("Subject Letter Grade A- And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
						
					}
					else if(n>=65 && n<=69)
					{
						g=3.25;
						gpa.setText("Subject Letter Grade B+ And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
						
					}
					else if(n>=60 && n<=64)
					{
						g=3.00;
						gpa.setText("Subject Letter Grade B And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
					}
					else if(n>=55 && n<=59)
					{
						g=2.75;
						gpa.setText("Subject Letter Grade B- And Grade Point is="+g);
						r=r+g;
						s=s+c;
						
					}
					else if(n>=50 && n<=54)
					{
						g=2.50;
						gpa.setText("Subject Letter Grade C+ And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
					}
					else if(n>=45 && n<=49)
					{
						g=2.25;
						gpa.setText("Subject Letter Grade C And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
					}
					else if(n>=40 && n<=44)
					{
						g=2.00;
						gpa.setText("Subject Letter Grade D And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
					}
					else if(n<40)
					{
						g=0.00;
						gpa.setText("Subject Letter Grade F And Grade Point is="+g);
						r=r+g*c;
						s=s+c;
						
					}
					
				}
				
				
				
			}
		});
        
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				if(t==0)
				{
					gpa.setText("One Of Input Field is Empty.Check Your Input");
					cgpa.setText("");
				}
				else
				{
				f=r/s;
				DecimalFormat df=new DecimalFormat("#.##");
				cgpa.setText("Your CGPA is="+df.format(f));
				}
				
			}
		});
        
        b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				f=0;
				r=0.0;
				s=0.0;
				c=0;
				t=0;
				e1.setText("");
				e2.setText("");
				gpa.setText("");
				cgpa.setText("");
				
			}
		});
        b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,averagecg.class);
				startActivity(i);
				
			}
		});
        
      b10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,aboutme.class);
				startActivity(i);
				
			}
		});

    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
