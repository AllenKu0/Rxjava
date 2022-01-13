package com.example.rxjavaexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    Observer<String> observer = new Observer<String>() {
        @Override
        public void onCompleted() {
            Log.d("onComplete","onComplete");
        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {
            Log.d("onNext",s);
        }
    };
    Observable<String> observable = (Observable<String>) Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("Hello");
            subscriber.onNext("World!");
            subscriber.onCompleted();
        }
    }).subscribe(observer);*/
    //-----------------------------------------------//
    /*
    Observable observable = Observable.just("Hello","World");
    Action1 <String> onNextAction = new Action1<String>() {
        @Override
        public void call(String s) {
            Log.i("call 1",s);
        }
    };
    Action1<Throwable> onErrorAction = new Action1<Throwable>() {
        @Override
        public void call(Throwable throwable) {
            Log.i("call 2",String.valueOf(throwable));
        }
    };
    Action0 onCompleteAction = new Action0() {
        @Override
        public void call() {
            Log.i("call 3","onComplete");
        }
    };
    Observable.just().subscribe(onNextAction);*/
}