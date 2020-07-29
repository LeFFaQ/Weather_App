package com.lffq.wapper.ui.home;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.lffq.wapper.network.NetworkService;
import com.lffq.wapper.network.models.current.Current;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private String key = "e54d7937d6b33fe4b72b8ecbaf29c10b";
    final MutableLiveData<Current> currentMutableLiveData = new MutableLiveData<>();

    public LiveData<Current> getCurrent() {

        NetworkService.getInstance()
                .getJSONApi()
                .getCurrent(55, 37, key, "metric")
                .enqueue(new Callback<Current>() {
                    @Override
                    public void onResponse(@NonNull Call<Current> call, @NonNull Response<Current> response) {
                        Current post = response.body();

                        //currentMutableLiveData = new MutableLiveData<>();
                        currentMutableLiveData.postValue(post);

                    }

                    @Override
                    public void onFailure(@NonNull Call<Current> call, @NonNull Throwable t) {

                        //Error occurred while getting request!
                        t.printStackTrace();
                    }
                });

        return currentMutableLiveData;
    }

}