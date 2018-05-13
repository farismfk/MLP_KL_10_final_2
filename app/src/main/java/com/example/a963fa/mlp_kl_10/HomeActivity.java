package com.example.a963fa.mlp_kl_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity
{
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);


        //SET EVENT
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid)
    {
        //loop all child item of main grid
        for (int i = 0;i<mainGrid.getChildCount();i++)
        {
            //all child items are various cardviews
            //so cast objects to cardview
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    if (finalI == 0)
                    {
                        Intent intent = new Intent(HomeActivity.this, Kodi.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1)
                    {
                        Intent intent = new Intent(HomeActivity.this, Kottakkunnu.class);
                        startActivity(intent);
                    }

                    else if (finalI == 2)
                    {
                        Intent intent = new Intent(HomeActivity.this, Nilambur.class);
                        startActivity(intent);
                    }

                    else if (finalI == 3)
                    {
                        Intent intent = new Intent(HomeActivity.this, Nedumkayam.class);
                        startActivity(intent);
                    }

                    else if (finalI == 4)
                    {
                        Intent intent = new Intent(HomeActivity.this, Miniootty.class);
                        startActivity(intent);
                    }

                    else if (finalI == 5)
                    {
                        Intent intent = new Intent(HomeActivity.this, Kumaragiri.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }


}
