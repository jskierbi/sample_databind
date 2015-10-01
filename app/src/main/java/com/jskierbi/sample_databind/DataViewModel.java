package com.jskierbi.sample_databind;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class DataViewModel extends BaseObservable {

  private String phoneNumber    = "";
  private String userName       = "";
  private String callButtonText = "Call";

  @Bindable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  @Bindable
  public String getUserName() {
    return userName;
  }

  @Bindable
  public String getCallButtonText() {
    return callButtonText;
  }

  public void setPhoneNumber(String number) {
    phoneNumber = number;
    notifyPropertyChanged(com.jskierbi.sample_databind.BR.phoneNumber);
  }

  public void setUserName(String name) {
    userName = name;
    notifyPropertyChanged(com.jskierbi.sample_databind.BR.userName);
  }

  public void setCallButtonText(String text) {
    callButtonText = text;
    notifyPropertyChanged(com.jskierbi.sample_databind.BR.callButtonText);
  }
}