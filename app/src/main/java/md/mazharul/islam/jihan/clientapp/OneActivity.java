package md.mazharul.islam.jihan.clientapp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class OneActivity extends AppCompatActivity {
    ImageView call, sms, email;
    Dialog mDialog;
    ListView listView;

    String values[] = {"MUHIB- SMART TECH",
            "ANWER - EUREKA HOMES",
            "ENGER GONI - MARKUIS",
            "COL SALAHUDDIN - GOLF CLU",
            "BRIGHT SARAFAT",
            "SELIM REZA ICSB",
            "ARIF TEX"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        listView = (ListView) findViewById(R.id.BIZListView);
        /*ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview_layout, values);*/

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        //////////////////////////////////////////////////

                        popup();
                        call.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:+88-01713005656"));
                                startActivity(callIntent);
                                finish();
                                finish();
                            }
                        });
                        sms.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 01713005656" +
                                        ";" +
                                        "01711524584" +
                                        ";" +
                                        "01711524398" +
                                        ";" +
                                        "01718024060" +
                                        ";" +
                                        "01847215295" +
                                        ";" +
                                        "01922797851" +
                                        ";" +
                                        "01715160160"));
                                startActivity(intent);
                                finish();
                            }
                        });

                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                ///////////////////
                                Log.i("Send email", "");
                                String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
                                String[] CC = {""};
                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
                                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                                    //    finish();
                                    Log.i("sending Finished ...", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(OneActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                                }
                                ///////////////////
                                Toast.makeText(OneActivity.this, "There is no email data", Toast.LENGTH_SHORT).show();

                            }
                        });
                        mDialog.show();
                        //////////////////////////////////////////////////
                        break;
                    case 1:
                        //////////////////////////////////////////////////

                        popup();
                        call.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:+88-01711524584"));
                                startActivity(callIntent);
                                finish();


                                finish();
                            }
                        });
                        sms.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 01713005656" +
                                        ";" +
                                        "01711524584" +
                                        ";" +
                                        "01711524398" +
                                        ";" +
                                        "01718024060" +
                                        ";" +
                                        "01847215295" +
                                        ";" +
                                        "01922797851" +
                                        ";" +
                                        "01715160160"));
                                startActivity(intent);
                                finish();
                            }
                        });

                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                 ///////////////////
                                Log.i("Send email", "");
                                String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
                                String[] CC = {""};
                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
                                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                                    //    finish();
                                    Log.i("sending Finished ...", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(OneActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                                }
                                ////////////////////*
                                Toast.makeText(OneActivity.this, "There is no email data", Toast.LENGTH_SHORT).show();
                            }
                        });
                        mDialog.show();
                        break;
                    case 2:
                        popup();
                        call.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:+88-01711524398"));
                                startActivity(callIntent);
                                finish();


                                finish();
                            }
                        });
                        sms.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 01713005656" +
                                        ";" +
                                        "01711524584" +
                                        ";" +
                                        "01711524398" +
                                        ";" +
                                        "01718024060" +
                                        ";" +
                                        "01847215295" +
                                        ";" +
                                        "01922797851" +
                                        ";" +
                                        "01715160160"));
                                startActivity(intent);
                                finish();
                            }
                        });

                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                 ///////////////////
                                Log.i("Send email", "");
                                String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
                                String[] CC = {""};
                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
                                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                                    //    finish();
                                    Log.i("sending Finished ...", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(OneActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                                }
                                ////////////////////*
                                Toast.makeText(OneActivity.this, "There is no email data", Toast.LENGTH_SHORT).show();
                            }
                        });
                        mDialog.show();
                        break;
                    case 3:
                        popup();
                        call.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:+88-01718024060"));
                                startActivity(callIntent);
                                finish();


                                finish();
                            }
                        });
                        sms.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 01713005656" +
                                        ";" +
                                        "01711524584" +
                                        ";" +
                                        "01711524398" +
                                        ";" +
                                        "01718024060" +
                                        ";" +
                                        "01847215295" +
                                        ";" +
                                        "01922797851" +
                                        ";" +
                                        "01715160160"));
                                startActivity(intent);
                                finish();
                            }
                        });

                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                 ///////////////////
                                Log.i("Send email", "");
                                String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
                                String[] CC = {""};
                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
                                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                                    //    finish();
                                    Log.i("sending Finished ...", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(OneActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                                }
                                ////////////////////*
                                Toast.makeText(OneActivity.this, "There is no email data", Toast.LENGTH_SHORT).show();
                            }
                        });
                        mDialog.show();
                        break;
                    case 4:
                        popup();
                        call.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:+88-01847215295"));
                                startActivity(callIntent);
                                finish();


                                finish();
                            }
                        });
                        sms.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 01713005656" +
                                        ";" +
                                        "01711524584" +
                                        ";" +
                                        "01711524398" +
                                        ";" +
                                        "01718024060" +
                                        ";" +
                                        "01847215295" +
                                        ";" +
                                        "01922797851" +
                                        ";" +
                                        "01715160160"));
                                startActivity(intent);
                                finish();
                            }
                        });

                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                ///////////////////
                                Log.i("Send email", "");
                                String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
                                String[] CC = {""};
                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
                                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                                    //    finish();
                                    Log.i("sending Finished ...", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(OneActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                                }
                                ////////////////////*
                                Toast.makeText(OneActivity.this, "There is no email data", Toast.LENGTH_SHORT).show();
                            }
                        });
                        mDialog.show();
                        break;
                    case 5:
                        popup();
                        call.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:+88-01922797851"));
                                startActivity(callIntent);
                                finish();


                                finish();
                            }
                        });
                        sms.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 01713005656" +
                                        ";" +
                                        "01711524584" +
                                        ";" +
                                        "01711524398" +
                                        ";" +
                                        "01718024060" +
                                        ";" +
                                        "01847215295" +
                                        ";" +
                                        "01922797851" +
                                        ";" +
                                        "01715160160"));
                                startActivity(intent);
                                finish();
                            }
                        });

                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                 ///////////////////
                                Log.i("Send email", "");
                                String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
                                String[] CC = {""};
                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
                                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                                    //    finish();
                                    Log.i("sending Finished ...", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(OneActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                                }
                                ////////////////////*
                                Toast.makeText(OneActivity.this, "There is no email data", Toast.LENGTH_SHORT).show();
                            }
                        });
                        mDialog.show();
                        break;
                    case 6:
                        popup();
                        call.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:+88-01715160160"));
                                startActivity(callIntent);
                                finish();


                                finish();
                            }
                        });
                        sms.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms: 01713005656" +
                                        ";" +
                                        "01711524584" +
                                        ";" +
                                        "01711524398" +
                                        ";" +
                                        "01718024060" +
                                        ";" +
                                        "01847215295" +
                                        ";" +
                                        "01922797851" +
                                        ";" +
                                        "01715160160"));
                                startActivity(intent);
                                finish();
                            }
                        });

                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                 ///////////////////
                                Log.i("Send email", "");
                                String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
                                String[] CC = {""};
                                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
                                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                                    //    finish();
                                    Log.i("sending Finished ...", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(OneActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                                }
                                ////////////////////*
                                Toast.makeText(OneActivity.this, "There is no email data", Toast.LENGTH_SHORT).show();
                            }
                        });
                        mDialog.show();
                        break;

                    default:
                        break;
                }

            }
        });
    }

    public void popup() {
        mDialog = new Dialog(OneActivity.this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.popuap_new);


        call = (ImageView) mDialog.findViewById(R.id.imageViewCall);
        sms = (ImageView) mDialog.findViewById(R.id.imageViewSms);
        email = (ImageView) mDialog.findViewById(R.id.imageViewEmail);
    }
}