// Generated by view binder compiler. Do not edit!
package com.kbulab.exam.sqliteexam2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kbulab.exam.sqliteexam2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDelete1;

  @NonNull
  public final Button btnDelete2;

  @NonNull
  public final Button btnDelete3;

  @NonNull
  public final Button btnDeleteAll;

  @NonNull
  public final Button btnInsert;

  @NonNull
  public final Button btnSearch;

  @NonNull
  public final Button btnUpdate1;

  @NonNull
  public final Button btnUpdate2;

  @NonNull
  public final TextView textViewLog;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button btnDelete1,
      @NonNull Button btnDelete2, @NonNull Button btnDelete3, @NonNull Button btnDeleteAll,
      @NonNull Button btnInsert, @NonNull Button btnSearch, @NonNull Button btnUpdate1,
      @NonNull Button btnUpdate2, @NonNull TextView textViewLog) {
    this.rootView = rootView;
    this.btnDelete1 = btnDelete1;
    this.btnDelete2 = btnDelete2;
    this.btnDelete3 = btnDelete3;
    this.btnDeleteAll = btnDeleteAll;
    this.btnInsert = btnInsert;
    this.btnSearch = btnSearch;
    this.btnUpdate1 = btnUpdate1;
    this.btnUpdate2 = btnUpdate2;
    this.textViewLog = textViewLog;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_delete1;
      Button btnDelete1 = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete1 == null) {
        break missingId;
      }

      id = R.id.btn_delete2;
      Button btnDelete2 = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete2 == null) {
        break missingId;
      }

      id = R.id.btn_delete3;
      Button btnDelete3 = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete3 == null) {
        break missingId;
      }

      id = R.id.btn_delete_all;
      Button btnDeleteAll = ViewBindings.findChildViewById(rootView, id);
      if (btnDeleteAll == null) {
        break missingId;
      }

      id = R.id.btn_insert;
      Button btnInsert = ViewBindings.findChildViewById(rootView, id);
      if (btnInsert == null) {
        break missingId;
      }

      id = R.id.btn_search;
      Button btnSearch = ViewBindings.findChildViewById(rootView, id);
      if (btnSearch == null) {
        break missingId;
      }

      id = R.id.btn_update1;
      Button btnUpdate1 = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdate1 == null) {
        break missingId;
      }

      id = R.id.btn_update2;
      Button btnUpdate2 = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdate2 == null) {
        break missingId;
      }

      id = R.id.text_view_log;
      TextView textViewLog = ViewBindings.findChildViewById(rootView, id);
      if (textViewLog == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, btnDelete1, btnDelete2, btnDelete3,
          btnDeleteAll, btnInsert, btnSearch, btnUpdate1, btnUpdate2, textViewLog);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
