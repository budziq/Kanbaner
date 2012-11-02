package com.budziq.kanbaner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class BoardListFragment extends SherlockFragment {

    private String mContent;
    private static final String KEY_TAB_MSG = "key.tab.msg";

    public static BoardListFragment newInstance(String text) {
        BoardListFragment fragment = new BoardListFragment();

        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putString(KEY_TAB_MSG, text);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.board_list, null);
        TextView tv = (TextView) v.findViewById(R.id.loading_text);

        String msg = getString(R.string.hello_world) + mContent;
        tv.setText(msg);

        ListView lv = (ListView) v.findViewById(R.id.item_list);


        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
        		  "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
        		  "Linux", "OS/2" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
            android.R.layout.simple_list_item_1, android.R.id.text1, values);

        lv.setAdapter(adapter);
        return v;

    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContent =  getArguments() != null ? getArguments().getString(KEY_TAB_MSG) : "???";
    }

}
