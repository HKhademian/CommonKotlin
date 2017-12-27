package ir.hossainco.commonkotlin.android.livedata

import android.arch.lifecycle.Observer
import ir.hossainco.commonkotlin.provider.SingleProvider

typealias Observe<T, R> = SingleProvider<T, R>

fun <T> Observe<Any, T>.toObserverNotNull(): Observer<T>
	= Observer { it!!.let(this) }

fun <T> Observe<Any, T>.toObserver(): Observer<T>
	= Observer { it?.let(this) }
