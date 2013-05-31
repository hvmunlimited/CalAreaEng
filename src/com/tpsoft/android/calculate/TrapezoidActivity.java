package com.tpsoft.android.calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TrapezoidActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.trapezoid);
		
		// Edit 
		final EditText et = (EditText) findViewById(R.id.EditTextHigh);
		final EditText ea = (EditText) findViewById(R.id.editTexta);
		final EditText eb = (EditText) findViewById(R.id.EditTextb);
		// Button 
		final Button btn = (Button) findViewById(R.id.btnCalculateCicle1);
		// Text View
		final TextView tv = (TextView) findViewById(R.id.CicletextView1);
		// Perform form action on click
		
	 	btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String str = et.getText().toString();
				String str2 = eb.getText().toString();
				String str3 = ea.getText().toString();
				try{
					Double r1 = Double.parseDouble(str);
					Double r2 = Double.parseDouble(str2);
					Double r3 = Double.parseDouble(str3);
					Double Answer = (0.5)*(r2+r3)*r1;
					if(r1 <=1000){
					tv.setText("Area of ​​the trapezoid :" + Answer);
					}else{
					tv.setText("You Can Input Maximum 1000");
						}		
					}catch (NumberFormatException ex) { 
						et.setText("Error");
					}	
			}
		});
	}
}
