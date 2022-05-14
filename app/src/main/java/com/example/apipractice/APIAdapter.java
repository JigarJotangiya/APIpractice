package com.example.apipractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class APIAdapter extends RecyclerView.Adapter<APIAdapter.ViewHolder> {

    MainActivity mainActivity;
    List<Datum> datalist;

    public APIAdapter(MainActivity mainActivity, List<Datum> datalist) {

        this.mainActivity = mainActivity;
        this.datalist = datalist;


    }

    @NonNull
    @Override
    public APIAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.listitem,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull APIAdapter.ViewHolder holder, int position) {

        holder.id1.setText("id :"+datalist.get(position).getId());
        holder.first_name.setText("first_name :"+datalist.get(position).getFirstName());
        holder.height_feet.setText("height_feet :"+datalist.get(position).getHeightFeet());
        holder.height_inches.setText("height_inches :"+datalist.get(position).getHeightInches());
        holder.last_name.setText("last_name :"+datalist.get(position).getLastName());
        holder.position.setText("position :"+datalist.get(position).getPosition());

        holder.team.setText("team :"+datalist.get(position).getTeam());

        holder.id2.setText("id :"+datalist.get(position).getTeam().getId());
        holder.abbrebiation.setText("abbrebiation :"+datalist.get(position).getTeam().getAbbreviation());
        holder.city.setText("city :"+datalist.get(position).getTeam().getCity());
        holder.conference.setText("conference :"+datalist.get(position).getTeam().getConference());
        holder.division.setText("division :"+datalist.get(position).getTeam().getDivision());
        holder.full_name.setText("full_name :"+datalist.get(position).getTeam().getFullName());
        holder.name.setText("name :"+datalist.get(position).getTeam().getName());

        holder.weight_pounds.setText("weight_pounds :"+datalist.get(position).getWeightPounds());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id1,first_name,height_feet,height_inches,last_name,position,team,id2,abbrebiation,city,conference,division,full_name,name,weight_pounds;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

           id1=itemView.findViewById(R.id.id1);
            first_name=itemView.findViewById(R.id.first_name);
            height_feet=itemView.findViewById(R.id.height_feet);
            height_inches=itemView.findViewById(R.id.height_inches);
            last_name=itemView.findViewById(R.id.last_name);
            position=itemView.findViewById(R.id.position);
            team=itemView.findViewById(R.id.team);
            id2=itemView.findViewById(R.id.id2);
            abbrebiation=itemView.findViewById(R.id.abbrebiation);
            city=itemView.findViewById(R.id.city);
            conference=itemView.findViewById(R.id.conference);
            division=itemView.findViewById(R.id.division);
            full_name=itemView.findViewById(R.id.full_name);
            name=itemView.findViewById(R.id.name);
            weight_pounds=itemView.findViewById(R.id.weight_pounds);


        }
    }
}
