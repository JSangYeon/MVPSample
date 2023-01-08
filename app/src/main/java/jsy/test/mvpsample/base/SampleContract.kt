package jsy.test.mvpsample.base

interface SampleContract {
    interface View { // View method
    }

    interface Presenter {
        // Presenter method
        fun setView(view: View?)
    }
}