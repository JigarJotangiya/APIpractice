package com.example.apipractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    RecyclerView list;
    public final String URL = "https://free-nba.p.rapidapi.com/players?page=0&per_page=25";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.list);

        APIinterface apIinterface = APIckient.getApiclient().create(APIinterface.class);
        apIinterface.getdata("0","25","free-nba.p.rapidapi.com","a1464f9095mshfe252be4505c76ep116a54jsnd257ae6e221a").enqueue(new Callback<Modelclass>() {

            @Override
            public void onResponse(Call<Modelclass> call, Response<Modelclass> response) {

                Modelclass modelclass = response.body();
                APIAdapter adapter = new APIAdapter(MainActivity.this,modelclass.getData());

                list.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                list.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Modelclass> call, Throwable t) {



            }
        });

    }
}