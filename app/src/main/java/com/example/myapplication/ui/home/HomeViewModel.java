package com.example.myapplication.ui.home;



import android.content.Intent;
import android.net.Uri;
import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    public LiveData<String> getText() {
        return mText;
    }

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

    }
    public  void Myweb(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/argentina/news");
    }
    public void openUrl(String url){
        Uri uri=Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
         startActivity(launchWeb);
    }

    private void startActivity(Intent launchWeb) {
    }


}