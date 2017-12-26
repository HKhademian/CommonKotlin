@file:Suppress("unused")
package ir.hossainco.commonkotlin.android.livedata

import io.reactivex.Observable

fun <T> Observable<T>.liveData()
	= ObservableLiveData(this)
