package com.wolfsoft.uiuxlabecommerce_screen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Model.Item_Activity2_Model;
import adapter.Item_Activity2_Adapter;
import adapter.Item_Comment_Activity2_Adapter;

public class Screen1 extends AppCompatActivity implements View.OnClickListener {

    private Item_Activity2_Adapter item_activity2_adapter;
    private RecyclerView recyclerview;
    private ArrayList<Item_Activity2_Model> modelList;


    private Item_Comment_Activity2_Adapter item_comment_adapter;
    private RecyclerView recyclerview_comment;
    private ArrayList<Item_Activity2_Model> modelList_comment;

    LinearLayout linear1,linear2,linear3,linear4,linear5;
    View u_line1,u_line2,u_line3,u_line4,u_line5;
    View d_line1,d_line2,d_line3,d_line4,d_line5;
    TextView size_text1,size_text2,size_text3,size_text4,size_text5;

    ImageView dot1,dot2,dot3,dot4,dot5,dot6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        recyclerview = (RecyclerView)findViewById(R.id.recycle_activity_2);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerview.setFocusableInTouchMode(false);

        modelList = new ArrayList<>();

        modelList.add(new Item_Activity2_Model(R.drawable.fashion1,"Fashion"));
        modelList.add(new Item_Activity2_Model(R.drawable.fashion2,"Jeans"));
        modelList.add(new Item_Activity2_Model(R.drawable.fashion3,"Fashion"));


        item_activity2_adapter = new Item_Activity2_Adapter(Screen1.this,modelList);
        recyclerview.setAdapter(item_activity2_adapter);

//comment recyclerview

        recyclerview_comment = (RecyclerView)findViewById(R.id.recyler_comment_activity2);
        recyclerview_comment.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerview_comment.setFocusableInTouchMode(false);

        modelList_comment = new ArrayList<>();

        modelList_comment.add(new Item_Activity2_Model(R.drawable.girl11,"Liliana Armstrong "));



        item_comment_adapter = new Item_Comment_Activity2_Adapter(Screen1.this,modelList_comment);
        recyclerview_comment.setAdapter(item_comment_adapter);



        linear1 = findViewById(R.id.sl_linear);
        linear2 = findViewById(R.id.x_linear);
        linear3 = findViewById(R.id.xl_linear);
        linear4 = findViewById(R.id.xs_linear);
        linear5 = findViewById(R.id.ls_linear);

        u_line1 = findViewById(R.id.sl_view_up);
        u_line2 = findViewById(R.id.x_view_up);
        u_line3 = findViewById(R.id.xl_view_up);
        u_line4 = findViewById(R.id.xs_view_up);
        u_line5 = findViewById(R.id.ls_view_up);

        d_line1 = findViewById(R.id.sl_view_down);
        d_line2 = findViewById(R.id.x_view_down);
        d_line3 = findViewById(R.id.xl_view_down);
        d_line4 = findViewById(R.id.xs_view_down);
        d_line5 = findViewById(R.id.ls_view_down);

        size_text1 = findViewById(R.id.sl_text);
        size_text2 = findViewById(R.id.x_text);
        size_text3 = findViewById(R.id.xl_text);
        size_text4 = findViewById(R.id.xs_text);
        size_text5 = findViewById(R.id.ls_text);


        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);


        dot1 = findViewById(R.id.dot1);
        dot2 = findViewById(R.id.dot2);
        dot3 = findViewById(R.id.dot3);
        dot4 = findViewById(R.id.dot4);
        dot5 = findViewById(R.id.dot5);
        dot6 = findViewById(R.id.dot6);

        dot1.setOnClickListener(this);
        dot2.setOnClickListener(this);
        dot3.setOnClickListener(this);
        dot4.setOnClickListener(this);
        dot5.setOnClickListener(this);
        dot6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sl_linear:
                u_line1.setVisibility(View.VISIBLE);
                d_line1.setVisibility(View.VISIBLE);
                size_text1.setTextSize(18);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.x_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.VISIBLE);
                d_line2.setVisibility(View.VISIBLE);
                size_text2.setTextSize(18);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;


            case R.id.xl_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.VISIBLE);
                d_line3.setVisibility(View.VISIBLE);
                size_text3.setTextSize(18);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.xs_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.VISIBLE);
                d_line4.setVisibility(View.VISIBLE);
                size_text4.setTextSize(18);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.ls_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.VISIBLE);
                d_line5.setVisibility(View.VISIBLE);
                size_text5.setTextSize(18);

                break;

            case R.id.dot1:
                dot1.setImageResource(R.drawable.ic_radio_blue);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);

                break;

            case R.id.dot2:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ic_radio_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot3:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ic_radio_darkgray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot4:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ic_radio_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot5:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ic_radio_darkgray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot6:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ic_radio_darkgray);
                break;


        }
    }
}
