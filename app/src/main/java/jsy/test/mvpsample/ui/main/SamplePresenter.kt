package jsy.test.mvpsample.ui.main

import android.util.Log
import jsy.test.mvpsample.base.SampleContract

class SamplePresenter : SampleContract.Presenter {
    // SampleContract.Presenter에서 정의한 내용을 구현
    private var view: SampleContract.View? = null
    override fun setView(view: SampleContract.View?) {
        Log.d("Samplepresenter", "setView")
    }


}