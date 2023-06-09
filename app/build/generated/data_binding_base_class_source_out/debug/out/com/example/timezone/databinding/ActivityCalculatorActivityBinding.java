// Generated by view binder compiler. Do not edit!
package com.example.timezone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.timezone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalculatorActivityBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final Button ac1;

  @NonNull
  public final Button del;

  @NonNull
  public final Button divide;

  @NonNull
  public final Button dot;

  @NonNull
  public final Button eight8;

  @NonNull
  public final Button equal;

  @NonNull
  public final Button five5;

  @NonNull
  public final Button four4;

  @NonNull
  public final Button into;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final LinearLayout linearLayout1;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final LinearLayout linearLayout2;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final LinearLayout linearLayout3;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final LinearLayout linearLayout4;

  @NonNull
  public final Button minus;

  @NonNull
  public final HorizontalScrollView myScrollView;

  @NonNull
  public final Button nine9;

  @NonNull
  public final Button one1;

  @NonNull
  public final Button percentage;

  @NonNull
  public final Button plus;

  @NonNull
  public final Button plusMinus;

  @NonNull
  public final TextView resultView;

  @NonNull
  public final Button seven7;

  @NonNull
  public final Button six6;

  @NonNull
  public final Button three3;

  @NonNull
  public final Button two2;

  @NonNull
  public final TextView valueView;

  @NonNull
  public final Button zero0;

  private ActivityCalculatorActivityBinding(@NonNull View rootView, @NonNull Button ac1,
      @NonNull Button del, @NonNull Button divide, @NonNull Button dot, @NonNull Button eight8,
      @NonNull Button equal, @NonNull Button five5, @NonNull Button four4, @NonNull Button into,
      @Nullable LinearLayout linearLayout1, @Nullable LinearLayout linearLayout2,
      @Nullable LinearLayout linearLayout3, @Nullable LinearLayout linearLayout4,
      @NonNull Button minus, @NonNull HorizontalScrollView myScrollView, @NonNull Button nine9,
      @NonNull Button one1, @NonNull Button percentage, @NonNull Button plus,
      @NonNull Button plusMinus, @NonNull TextView resultView, @NonNull Button seven7,
      @NonNull Button six6, @NonNull Button three3, @NonNull Button two2,
      @NonNull TextView valueView, @NonNull Button zero0) {
    this.rootView = rootView;
    this.ac1 = ac1;
    this.del = del;
    this.divide = divide;
    this.dot = dot;
    this.eight8 = eight8;
    this.equal = equal;
    this.five5 = five5;
    this.four4 = four4;
    this.into = into;
    this.linearLayout1 = linearLayout1;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
    this.linearLayout4 = linearLayout4;
    this.minus = minus;
    this.myScrollView = myScrollView;
    this.nine9 = nine9;
    this.one1 = one1;
    this.percentage = percentage;
    this.plus = plus;
    this.plusMinus = plusMinus;
    this.resultView = resultView;
    this.seven7 = seven7;
    this.six6 = six6;
    this.three3 = three3;
    this.two2 = two2;
    this.valueView = valueView;
    this.zero0 = zero0;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalculatorActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalculatorActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calculator_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalculatorActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ac1;
      Button ac1 = ViewBindings.findChildViewById(rootView, id);
      if (ac1 == null) {
        break missingId;
      }

      id = R.id.del;
      Button del = ViewBindings.findChildViewById(rootView, id);
      if (del == null) {
        break missingId;
      }

      id = R.id.divide;
      Button divide = ViewBindings.findChildViewById(rootView, id);
      if (divide == null) {
        break missingId;
      }

      id = R.id.dot_;
      Button dot = ViewBindings.findChildViewById(rootView, id);
      if (dot == null) {
        break missingId;
      }

      id = R.id.eight8;
      Button eight8 = ViewBindings.findChildViewById(rootView, id);
      if (eight8 == null) {
        break missingId;
      }

      id = R.id.equal;
      Button equal = ViewBindings.findChildViewById(rootView, id);
      if (equal == null) {
        break missingId;
      }

      id = R.id.five5;
      Button five5 = ViewBindings.findChildViewById(rootView, id);
      if (five5 == null) {
        break missingId;
      }

      id = R.id.four4;
      Button four4 = ViewBindings.findChildViewById(rootView, id);
      if (four4 == null) {
        break missingId;
      }

      id = R.id.into;
      Button into = ViewBindings.findChildViewById(rootView, id);
      if (into == null) {
        break missingId;
      }

      id = R.id.linearLayout1;
      LinearLayout linearLayout1 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.minus;
      Button minus = ViewBindings.findChildViewById(rootView, id);
      if (minus == null) {
        break missingId;
      }

      id = R.id.my_scroll_view;
      HorizontalScrollView myScrollView = ViewBindings.findChildViewById(rootView, id);
      if (myScrollView == null) {
        break missingId;
      }

      id = R.id.nine9;
      Button nine9 = ViewBindings.findChildViewById(rootView, id);
      if (nine9 == null) {
        break missingId;
      }

      id = R.id.one1;
      Button one1 = ViewBindings.findChildViewById(rootView, id);
      if (one1 == null) {
        break missingId;
      }

      id = R.id.percentage;
      Button percentage = ViewBindings.findChildViewById(rootView, id);
      if (percentage == null) {
        break missingId;
      }

      id = R.id.plus;
      Button plus = ViewBindings.findChildViewById(rootView, id);
      if (plus == null) {
        break missingId;
      }

      id = R.id.plusMinus;
      Button plusMinus = ViewBindings.findChildViewById(rootView, id);
      if (plusMinus == null) {
        break missingId;
      }

      id = R.id.result_view;
      TextView resultView = ViewBindings.findChildViewById(rootView, id);
      if (resultView == null) {
        break missingId;
      }

      id = R.id.seven7;
      Button seven7 = ViewBindings.findChildViewById(rootView, id);
      if (seven7 == null) {
        break missingId;
      }

      id = R.id.six6;
      Button six6 = ViewBindings.findChildViewById(rootView, id);
      if (six6 == null) {
        break missingId;
      }

      id = R.id.three3;
      Button three3 = ViewBindings.findChildViewById(rootView, id);
      if (three3 == null) {
        break missingId;
      }

      id = R.id.two2;
      Button two2 = ViewBindings.findChildViewById(rootView, id);
      if (two2 == null) {
        break missingId;
      }

      id = R.id.value_view;
      TextView valueView = ViewBindings.findChildViewById(rootView, id);
      if (valueView == null) {
        break missingId;
      }

      id = R.id.zero0;
      Button zero0 = ViewBindings.findChildViewById(rootView, id);
      if (zero0 == null) {
        break missingId;
      }

      return new ActivityCalculatorActivityBinding(rootView, ac1, del, divide, dot, eight8, equal,
          five5, four4, into, linearLayout1, linearLayout2, linearLayout3, linearLayout4, minus,
          myScrollView, nine9, one1, percentage, plus, plusMinus, resultView, seven7, six6, three3,
          two2, valueView, zero0);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
