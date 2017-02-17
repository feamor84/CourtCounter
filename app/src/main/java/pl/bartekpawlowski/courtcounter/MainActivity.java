package pl.bartekpawlowski.courtcounter;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
