@file:Suppress("unused")
package ir.hossainco.commonkotlin.util

import io.reactivex.Observable
import ir.hossainco.commonkotlin.ObservableLiveData

fun <T> Observable<T>.liveData()
	= ObservableLiveData(this)
