@file:Suppress("unused")
package ir.hossainco.commonkotlin

import io.reactivex.Observable

fun <T> Observable<T>.liveData()
	= ObservableLiveData(this)
