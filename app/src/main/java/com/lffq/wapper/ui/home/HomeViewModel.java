package com.lffq.wapper.ui.home;

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

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        //mText = new MutableLiveData<>();
        //mText.setValue("This is home fragment");

        NetworkService.getInstance()
                .getJSONApi()
                .getCurrent()
                .enqueue(new Callback<Current>() {
                    @Override
                    public void onResponse(@NonNull Call<Current> call, @NonNull Response<Current> response) {
                        Current post = response.body();

                        //textView.append(post.getId() + "\n");
                        //textView.append(post.getUserId() + "\n");
                        //textView.append(post.getTitle() + "\n");
                        //textView.append(post.getBody() + "\n");
                    }

                    @Override
                    public void onFailure(@NonNull Call<Current> call, @NonNull Throwable t) {

                        //textView.append("Error occurred while getting request!");
                        t.printStackTrace();
                    }
                });

    }

    public LiveData<String> getText() {
        return mText;
    }
}