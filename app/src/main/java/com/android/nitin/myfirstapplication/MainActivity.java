    /*Author: Nitin Sharma (A00248347)*/
    package com.nitinsharma.scorekeeper;

    import androidx.appcompat.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ImageButton;
    import android.widget.RadioGroup;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        //Declare all the variables and views needed for the program.
        public int indiaScoreVar = 0;
        public int uKScoreVar = 0;
        public int pointsVar = 1;
        TextView indiaScoreTextViewVar, ukScoreTextViewVar;
        RadioGroup radioGroupVar;
        ImageButton incScoreIndImageButtonVar,decScoreIndImageButtonVar, incScoreUkImageButtonVar, decScoreUkImageButtonVar;

       /* When an Activity is first called or launched then onCreate(Bundle savedInstanceState)
          method is responsible to create the activity. But the reason it is used in app is
          because that method is the best place to put initialization code. ...*/
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //Instantiate all the buttons.
            incScoreIndImageButtonVar = findViewById(R.id.incScoreIndImageButton);
            decScoreIndImageButtonVar = findViewById(R.id.decScoreIndImageButton);
            incScoreUkImageButtonVar = findViewById(R.id.incScoreUkImageButton);
            decScoreUkImageButtonVar = findViewById(R.id.decScoreUkImageButton);

            //Instantiate two text views for both the countries.
            indiaScoreTextViewVar = findViewById(R.id.indiaScoreTextView);
            ukScoreTextViewVar = findViewById(R.id.ukScoreTextView);

            //Set up the onClickListeners for all four buttons
            incScoreIndImageButtonVar.setOnClickListener(this);
            decScoreIndImageButtonVar.setOnClickListener(this);
            incScoreUkImageButtonVar.setOnClickListener(this);
            decScoreUkImageButtonVar.setOnClickListener(this);

            //Instantiate the radio group view
            radioGroupVar = findViewById(R.id.radioGroup);

        }

        /*This method will be called by the Android framework to see that
          the listener that has been registered is triggered by user interaction
          with the item in the UI.
          Below code does various Buttons handling, both Image buttons and Radio buttons*/
        @Override
        public void onClick(View view) {
            //Change points value when user clicks on different radio buttons by 0,5,10 and 15.
            switch(radioGroupVar.getCheckedRadioButtonId()){
                case R.id.zeroPointRadioButton:
                    pointsVar = 0;
                    break;
                case R.id.fivePointRadioButton:
                    pointsVar = 5;
                    break;
                case R.id.tenPointRadioButton:
                    pointsVar = 10;
                    break;
                case R.id.fifteenPointRadioButton:
                    pointsVar = 15;
                    break;
            }

            //Through below code the increment or decrement value will be changed based on which button user presses for which team.
            //Add or subtract score values for each team when user clicks on different increment or decrement buttons,
            switch (view.getId()) {
                case R.id.incScoreIndImageButton:
                    indiaScoreVar += pointsVar;
                    indiaScoreTextViewVar.setText(Integer.toString(indiaScoreVar));
                    break;
                case R.id.decScoreIndImageButton:
                    indiaScoreVar -= pointsVar;
                    if (indiaScoreVar <= 0) {
                        indiaScoreVar = 0;
                    }
                    indiaScoreTextViewVar.setText(Integer.toString(indiaScoreVar));
                    break;
                case R.id.incScoreUkImageButton:
                    uKScoreVar += pointsVar;
                    ukScoreTextViewVar.setText(Integer.toString(uKScoreVar));
                    break;
                case R.id.decScoreUkImageButton:
                    uKScoreVar -= pointsVar;
                    if (uKScoreVar <= 0) {
                        uKScoreVar = 0;
                    }
                    ukScoreTextViewVar.setText(Integer.toString(uKScoreVar));
                    break;

            }
        }
    }