package jsy.test.mvpsample.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jsy.test.mvpsample.R
import jsy.test.mvpsample.base.SampleContract
import jsy.test.mvpsample.base.SampleContract.Presenter


class MainActivity : AppCompatActivity(), SampleContract.View {
    private var presenter: Presenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = SamplePresenter()
        presenter!!.setView(this)

//        presenter.loadItem()
    }

//    fun updateView(items: List<Items?>?) {
//        // UI 갱신
//    }
}