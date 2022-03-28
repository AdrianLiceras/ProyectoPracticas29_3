package com.example.proyectopracticas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    private val _hombreClicked by lazy { MediatorLiveData<Boolean>() }
    val hombreClicked : LiveData<Boolean>
        get() = _hombreClicked

    private val _mujerClicked by lazy { MediatorLiveData<Boolean>() }
    val mujerClicked: LiveData<Boolean>
        get() = _mujerClicked

    private val _ncClicked by lazy { MediatorLiveData<Boolean>() }
    val ncClicked: LiveData<Boolean>
        get() = _ncClicked

}