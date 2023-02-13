package com.example.recyclerapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DealsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DealsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View rootView;
    Context mContext;

    private RecyclerView rcvUser;
    private UserAdapter mUserAdapter;

    public DealsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DealsFragment newInstance(String param1, String param2) {
        DealsFragment fragment = new DealsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getActivity().getApplicationContext();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_deals, container, false);
        rcvUser = rootView.findViewById(R.id.dealsFragment);

        mUserAdapter = new UserAdapter(getContext());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        rcvUser.setLayoutManager(gridLayoutManager);

        mUserAdapter.setData(getContext(),getListUser());
        rcvUser.setAdapter(mUserAdapter);
        return rootView;
    }

    private List<User> getListUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.img_accessories, "accessories"));
        list.add(new User(R.drawable.img_baby, "baby"));
        list.add(new User(R.drawable.img_cartwheel, "cartwheel"));
        list.add(new User(R.drawable.img_clothing, "clothing"));
        list.add(new User(R.drawable.img_garden, "patio & garden"));
        list.add(new User(R.drawable.img_home, "home"));
        list.add(new User(R.drawable.img_pharmacy, "pharmacy"));
        list.add(new User(R.drawable.img_registry, "registry"));
        list.add(new User(R.drawable.img_shoes, "shoes"));
        list.add(new User(R.drawable.img_accessories, "bags"));
        return list;
    }
}