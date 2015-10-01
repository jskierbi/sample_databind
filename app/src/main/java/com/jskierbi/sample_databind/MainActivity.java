package com.jskierbi.sample_databind;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jskierbi.sample_databind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private DataViewModel       mDataViewModel;
  private ActivityMainBinding mBinding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    mDataViewModel = new DataViewModel();

    setContentView(R.layout.activity_main);
    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    mBinding.setData(mDataViewModel);

    ButterKnife.bind(this);
  }

  @OnClick(R.id.btn_data1)
  void btnData1Click() {
    mDataViewModel.setPhoneNumber("0-700 333 666");
    mDataViewModel.setUserName("Slodka Joanna");
    mDataViewModel.setCallButtonText("Zadzwon teraz!");
  }

  @OnClick(R.id.btn_data2)
  void btnData2Click() {
    mDataViewModel.setPhoneNumber("666 777 888");
    mDataViewModel.setUserName("Janusz");
    mDataViewModel.setCallButtonText("call");
  }
}
