package com.example.dheerajp.uploadsealedbit;

import android.nfc.tech.Ndef;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SIC43N1xFragment extends Fragment {
    protected Ndef ndef;
    protected NfcA nfc;
    protected View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        //this.nfc = SIC43N1xService.nfc;
        //this.ndef = SIC43N1xService.ndef;
        return container;
    }

    public void refreshNFC() {
        //this.nfc = SIC43N1xService.nfc;
        //this.ndef = SIC43N1xService.ndef;
    }
}
