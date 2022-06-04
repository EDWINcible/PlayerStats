package com.example.android.playerstats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MasterActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener{
    private int playerAIndex;
    private int playerBIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
    }

    public void onImageSelected(int position) {
        Toast.makeText(this, "Position clicked = " + position, Toast.LENGTH_SHORT).show();

        int PlayerNumber = position /3;
        int listIndex = position - 3*PlayerNumber;

        switch (PlayerNumber) {
                case 0:
                    playerAIndex = listIndex;
                    break;
                case 1:
                    playerBIndex = listIndex;
                    break;
                default:
                    break;
        }

            Bundle b = new Bundle();
            b.putInt("playerAIndex", playerAIndex);
            b.putInt("playerBIndex", playerBIndex);

            final Intent intent = new Intent(this, MainActivity.class);
            intent.putExtras(b);

            Button nextButton = (Button) findViewById(R.id.next_button);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(intent);
                }
            });
        }
}
