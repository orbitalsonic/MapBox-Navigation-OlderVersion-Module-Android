package com.mapbox.services.android.navigation.ui.v5.instruction;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class InstructionView_LifecycleAdapter implements GeneratedAdapter {
  final InstructionView mReceiver;

  InstructionView_LifecycleAdapter(InstructionView receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_DESTROY) {
      if (!hasLogger || logger.approveCall("unsubscribe", 1)) {
        mReceiver.unsubscribe();
      }
      return;
    }
  }
}
