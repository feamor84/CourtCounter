package pl.bartekpawlowski.courtcounter;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView containerForTeamA = (TextView) findViewById(R.id.counter_team_a);
        containerForTeamA.setText(String.valueOf(score));
    }

    public void addThreePoints(View view) {
        displayForTeamA(3);
    }

    public void addTwoPoints(View view) {
        displayForTeamA(2);
    }

    public void addFreeThrowPoints(View view) {
        displayForTeamA(1);
    }
}
