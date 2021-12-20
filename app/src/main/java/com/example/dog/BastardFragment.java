package com.example.dog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BastardFragment extends Fragment {

    String api="a94ad5f2407340a5a24e25c518bfc871";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country="fr";
    private RecyclerView recyclerViewofbastard;
    private String category="bastard";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.bastardfragment,null);




        recyclerViewofbastard=v.findViewById(R.id.recyclerviewofbastard);
        modelClassArrayList=new ArrayList<>();
        recyclerViewofbastard.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(),modelClassArrayList);
        recyclerViewofbastard.setAdapter(adapter);

        findNews();



        return v;

    }

    private void findNews() {

        ApiUtilities.getApiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });

    }
}
