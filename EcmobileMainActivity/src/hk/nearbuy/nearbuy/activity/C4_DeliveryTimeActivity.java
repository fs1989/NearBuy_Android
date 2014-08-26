package hk.nearbuy.nearbuy.activity;

//
//                       __
//                      /\ \   _
//    ____    ____   ___\ \ \_/ \           _____    ___     ___
//   / _  \  / __ \ / __ \ \    <     __   /\__  \  / __ \  / __ \
//  /\ \_\ \/\  __//\  __/\ \ \\ \   /\_\  \/_/  / /\ \_\ \/\ \_\ \
//  \ \____ \ \____\ \____\\ \_\\_\  \/_/   /\____\\ \____/\ \____/
//   \/____\ \/____/\/____/ \/_//_/         \/____/ \/___/  \/___/
//     /\____/
//     \/___/
//
//  Powered by BeeFramework
//

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import hk.nearbuy.nearbuy.R;

public class C4_DeliveryTimeActivity extends Activity implements
		OnClickListener {
	
	private TextView delivery_time1;
	private TextView delivery_time2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c4_delivery);

		setTitle("请选择送货时间");
		
		delivery_time1 = (TextView) findViewById(R.id.time1);
		delivery_time2 = (TextView) findViewById(R.id.time2);
		
		delivery_time1.setOnClickListener(this);
		delivery_time2.setOnClickListener(this);
		
		
	}

	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.time1:
			Intent intent1 = new Intent();
			String time1 = (String) delivery_time1.getText();
			intent1.putExtra("DELIVERT_MESSAGE", time1);
			setResult(11, intent1);
			
			finish();
			break;

		case R.id.time2:
			
			Intent intent2 = new Intent();
			String time2 = (String) delivery_time2.getText();
			intent2.putExtra("DELIVERT_MESSAGE", time2.toString());
			setResult(11, intent2);
			
			finish();
			break;
		}
		
	}
	
}
