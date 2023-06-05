// Generated by view binder compiler. Do not edit!
package com.example.timezone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.timezone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTimerActivityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText editTxt;

  @NonNull
  public final ImageView palate;

  @NonNull
  public final Button pauseBtn;

  @NonNull
  public final Button resetButton;

  @NonNull
  public final Button setButton;

  @NonNull
  public final Button startButton;

  @NonNull
  public final TextView textViewCountdown;

  @NonNull
  public final ImageView top;

  private ActivityTimerActivityBinding(@NonNull RelativeLayout rootView, @NonNull EditText editTxt,
      @NonNull ImageView palate, @NonNull Button pauseBtn, @NonNull Button resetButton,
      @NonNull Button setButton, @NonNull Button startButton, @NonNull TextView textViewCountdown,
      @NonNull ImageView top) {
    this.rootView = rootView;
    this.editTxt = editTxt;
    this.palate = palate;
    this.pauseBtn = pauseBtn;
    this.resetButton = resetButton;
    this.setButton = setButton;
    this.startButton = startButton;
    this.textViewCountdown = textViewCountdown;
    this.top = top;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTimerActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTimerActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_timer_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTimerActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTxt;
      EditText editTxt = ViewBindings.findChildViewById(rootView, id);
      if (editTxt == null) {
        break missingId;
      }

      id = R.id.palate;
      ImageView palate = ViewBindings.findChildViewById(rootView, id);
      if (palate == null) {
        break missingId;
      }

      id = R.id.pauseBtn;
      Button pauseBtn = ViewBindings.findChildViewById(rootView, id);
      if (pauseBtn == null) {
        break missingId;
      }

      id = R.id.resetButton;
      Button resetButton = ViewBindings.findChildViewById(rootView, id);
      if (resetButton == null) {
        break missingId;
      }

      id = R.id.setButton;
      Button setButton = ViewBindings.findChildViewById(rootView, id);
      if (setButton == null) {
        break missingId;
      }

      id = R.id.startButton;
      Button startButton = ViewBindings.findChildViewById(rootView, id);
      if (startButton == null) {
        break missingId;
      }

      id = R.id.text_view_countdown;
      TextView textViewCountdown = ViewBindings.findChildViewById(rootView, id);
      if (textViewCountdown == null) {
        break missingId;
      }

      id = R.id.top;
      ImageView top = ViewBindings.findChildViewById(rootView, id);
      if (top == null) {
        break missingId;
      }

      return new ActivityTimerActivityBinding((RelativeLayout) rootView, editTxt, palate, pauseBtn,
          resetButton, setButton, startButton, textViewCountdown, top);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
