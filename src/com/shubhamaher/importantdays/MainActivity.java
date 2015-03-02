package com.shubhamaher.importantdays;

import android.os.*;
import android.app.*;
import android.content.*;
import android.widget.*;
import android.view.*;
import android.net.*;

public class MainActivity extends Activity implements View.OnClickListener
{
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b10;
	Button b11;
	Button b12;
	
	public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        b1=(Button)findViewById(R.id.Jan);
        b2=(Button)findViewById(R.id.Feb);
        b3=(Button)findViewById(R.id.Mar);
        b4=(Button)findViewById(R.id.Apr);
        b5=(Button)findViewById(R.id.May);
        b6=(Button)findViewById(R.id.Jun);
        b7=(Button)findViewById(R.id.Jul);
        b8=(Button)findViewById(R.id.Aug);
        b9=(Button)findViewById(R.id.Sep);
        b10=(Button)findViewById(R.id.Oct);
        b11=(Button)findViewById(R.id.Nov);
        b12=(Button)findViewById(R.id.Dec);
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
	}
	
	public void onClick(View v)
	{
		
		LayoutInflater li = LayoutInflater.from(this); 
		View view = li.inflate(R.layout.single_month, null);
		
		TextView tv_desc=(TextView)view.findViewById(R.id.prompt_tv_days);
		tv_desc.setText(getDesc(v));
		
		AlertDialog.Builder alrt=new AlertDialog.Builder(this);
		alrt.setTitle(getTitleMon(v));
		alrt.setView(view);
		alrt.setNeutralButton("OK",new DialogInterface.OnClickListener()
		{
			public void onClick(DialogInterface anonDlgIntf, int anonInt){}
		}
		);
		alrt.setIcon(R.drawable.ic_launcher);
		alrt.show();
		
	}
	
	public String getTitleMon(View v)
	{
		String title="";
		
		switch(v.getId())
		{
			case R.id.Jan:
							title="January";
							break;
							
			case R.id.Feb:	
							title="February";
							break;
							
			case R.id.Mar:	
							title="March";
							break;
							
			case R.id.Apr:	
							title="April";
							break;
							
			case R.id.May:
							title="May";
							break;
							
			case R.id.Jun:	
							title="June";
							break;
							
			case R.id.Jul:	
							title="July";
							break;
							
			case R.id.Aug:	
							title="August";
							break;
							
			case R.id.Sep:	
							title="September";
							break;
							
			case R.id.Oct:	
							title="October";
							break;
							
			case R.id.Nov:	
							title="November";
							break;
							
			case R.id.Dec:	
							title="December";
							break;
		}
		
		return title;
	}
	
	public String getDesc(View v)
	{
		String desc="";
		
		switch(v.getId())
		{
			case R.id.Jan:	desc="Global Family Day - 1 Jan\n\nNational Human Trafficking Awareness Day - 11 Jan\n\nMoebius Syndrome Awareness Day - 24 Jan\n\nInternational Customs Day - 26 Jan\n\nInternational Holocaust Remembrance Day - 27 Jan\n\nFamily Literacy Day - 27 Jan\n\nStreet Children\'s Day - 31 Jan\n\n";
							break;
							
			case R.id.Feb:	desc="Rheumatoid Arthritis Awareness Day - 2 Feb\n\nWorld Cancer Day - 4 Feb\n\nInternational Day of Zero Tolerance to Female Genital Mutilation - 6 Feb\n\nInternational Safer Internet Day - 8 Feb\n\nSexual and Reproductive Health Awareness Day - 12 Feb\n\nInternational Day of Women\'s Health - 12 Feb\n\nRed Hand Day - Child Soldier Awareness - 12 Feb\n\nCongenital Heart Defect Awareness Day - 14 Feb\n\nInternational Childhood Cancer Day - 15 Feb\n\nWorld Day of Social Justice - 20 Feb\n\nInternational Mother Language Day - 21 Feb\n\nGlobal Information Governance Day - 21 Feb\n\nInternational Scouts Day - 22 Feb\n\nWorld Thinking Day - 22 Feb\n\nRare Disease Day - 28 Feb\n\n";
							break;
							
			case R.id.Mar:	desc="Pig Day - 1 Mar\n\nSelf-Injury Awareness Day - 1 Mar\n\nInternational Women\'s Day - 8 Mar\n\nNational Women and Girl\'s HIV/AIDS Awareness Day - 10 Mar\n\nInternational Day for the Elimination of Racial Discrimination - 21 Mar\n\nWorld Down Syndrome Day - 21 Mar\n\nEU Talent Day - 25 Mar\n\nPurple Day for Epilepsy - 26 Mar\n\n";
							break;
							
			case R.id.Apr:	desc="Youth Homelessness Matters Day - 1 Apr\n\nAutism Awareness Day - 2 Apr\n\nSexual Assault Awareness Month Day of Action - 2 Apr\n\nNational Gifted Education Awareness Day in Ireland - 8 Apr\n\nUndiagnosed Children\'s Awareness Day - 13 Apr\n\nZoo Awareness Day - 17 Apr\n\nBicycle Day - 19 Apr\n\nParental Alienation Awareness Day - 25 Apr\n\nPenguin Day - 25 Apr\n\nInternational Dance Day - 29 Apr\n\n";
							break;
							
			case R.id.May:	desc="International Day Against Homophobia and Transphobia - 17 May\n\nWorld Hepatitis Day - 19 May\n\nTowel Day - 25 May\n\nWorld No Tobacco Day - 31 May\n\n";
							break;
							
			case R.id.Jun:	desc="World Refugee Day - 20 Jun\n\nOrgasm Day - Solstice\n\nTake Your Dog to Work Day - 24 Jun\n\n";
							break;
							
			case R.id.Jul:	desc="World Population Day - 11 Jul\n\nWorld Hepatitis Day - 28 Jul\n\n";
							break;
							
			case R.id.Aug:	desc="Youth Day - 12 Aug\n\nNational Honey Bee Day - 3rd Saturday of Aug\n\n";
							break;
							
			case R.id.Sep:	desc="World Contraception Day - 26 Sep\n\n";
							break;
							
			case R.id.Oct:	desc="eDay Electronic Waste Awareness Day - 4 Oct\n\nWorld Mental Health Day - 10 Oct\n\nNational Coming Out Day - 12 Oct\n\nWorld Food Day - 16 Oct\n\nInternational Stuttering Awareness Day - 22 Oct\n\n";
							break;
							
			case R.id.Nov:	desc="International Lennox-Gastaut Syndrome Awareness Day - 1 Nov\n\nWorld Freedom Day - 9 Nov\n\nWorld Diabetes Day - 14 Nov\n\nWorld Toilet Day - 19 Nov\n\nUniversal Children\'s Day - 20 Nov\n\nWorld Television Day - 21 Nov\n\n";
							break;
							
			case R.id.Dec:	desc="World AIDS Day - 1 Dec\n\nHuman Rights Day - 10 Dec\n\n";
							break;
		}
		
		return desc;
	}
	
	public boolean onCreateOptionsMenu(Menu menu)
	{
		//menu.add(0, 0, 0, "More Apps");
		
		menu.add(0, 1, 0, "More Apps");
		menu.add(0, 2, 0, "Rate App");
		menu.add(0, 3, 0, "Share");
		menu.add(0, 4, 0, "About");
		menu.add(0, 5, 0, "Exit");
		return super.onCreateOptionsMenu(menu);
	}
	
	public boolean onOptionsItemSelected(MenuItem mi)
	{
		switch(mi.getItemId())
		{
			case 1:
					try
					{
						startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:Shubhware Inc.")));
					}
					catch(Exception e)
					{
						Toast.makeText(this,"Error starting PlayStore!", Toast.LENGTH_LONG).show();
					}
					break;

			case 2:
					try
					{
						startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.shubhamaher.importantdays")));
					}
					catch(Exception e)
					{
						Toast.makeText(this,"Error starting PlayStore!", Toast.LENGTH_LONG).show();
					}
					break;
			
			case 3:
					Intent localIntent = new Intent("android.intent.action.SEND");
					localIntent.setType("text/plain");
					localIntent.putExtra("android.intent.extra.SUBJECT", "Important Days");
					localIntent.putExtra("android.intent.extra.TEXT", "Hey! Just tried a new app to know Important Days in a Year on Play Store. It's, Awesome!! Get it at: market://details?id=com.shubhamaher.importantdays ");
					startActivity(Intent.createChooser(localIntent, "Share Via"));
					break;
		
			case 4:
					AlertDialog.Builder abtdlg = new AlertDialog.Builder(this);
					abtdlg.setTitle("About Us");
					abtdlg.setMessage("Shubhware Inc.\nDeveloper:\nRaghav Potdar\nshubham.aher.2011@gmail.com");
					abtdlg.setNeutralButton("OK",new DialogInterface.OnClickListener() {
						
						public void onClick(DialogInterface dialog, int which){}
					});
					abtdlg.setIcon(R.drawable.ic_launcher);
					abtdlg.show();
					break;
					
			case 5: 
					finish();
					break;
		}
		return super.onOptionsItemSelected(mi);
	}
}