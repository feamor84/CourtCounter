package pl.bartekpawlowski.courtcounter;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;
    final static String SCORE_TEAM_A = "scoreTeamA";
    final static String SCORE_TEAM_B = "scoreTeamB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null) {
            this.scoreTeamA = savedInstanceState.getInt(this.SCORE_TEAM_A);
            this.scoreTeamB = savedInstanceState.getInt(this.SCORE_TEAM_B);
        } else {
            this.scoreTeamA = 0;
            this.scoreTeamB = 0;
        }

        setContentView(R.layout.activity_main);

        displayForTeamA(this.scoreTeamA);
        displayForTeamB(this.scoreTeamB);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(this.SCORE_TEAM_A, this.scoreTeamA);
        savedInstanceState.putInt(this.SCORE_TEAM_B, this.scoreTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void displayForTeamA(int score) {
        TextView containerForTeamA = (TextView) findViewById(R.id.counter_team_a);
        containerForTeamA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView containerFroTeamB = (TextView) findViewById(R.id.counter_team_b);
        containerFroTeamB.setText(String.valueOf(score));
    }

    public void addThreePoints(View view) {
        String team = view.getTag().toString();
        switch (team){
            case "A":
                this.scoreTeamA = this.scoreTeamA + 3;
                displayForTeamA(this.scoreTeamA);
                break;
            case "B":
                this.scoreTeamB = this.scoreTeamB + 3;
                displayForTeamB(this.scoreTeamB);
                break;
        }
    }

    public void addTwoPoints(View view) {
        String team = view.getTag().toString();
        switch (team){
            case "A":
                this.scoreTeamA = this.scoreTeamA + 2;
                displayForTeamA(this.scoreTeamA);
                break;
            case "B":
                this.scoreTeamB = this.scoreTeamB + 2;
                displayForTeamB(this.scoreTeamB);
                break;
        }
    }

    public void addFreeThrowPoints(View view) {
        String team = view.getTag().toString();
        switch (team){
            case "A":
                this.scoreTeamA = this.scoreTeamA + 1;
                displayForTeamA(this.scoreTeamA);
                break;
            case "B":
                this.scoreTeamB = this.scoreTeamB + 1;
                displayForTeamB(this.scoreTeamB);
                break;
        }
    }

    public void resetPoints(View view){
        this.scoreTeamA = this.scoreTeamB = 0;
        displayForTeamA(this.scoreTeamA);
        displayForTeamB(this.scoreTeamB);
    }
}
