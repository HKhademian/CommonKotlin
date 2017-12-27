package ir.hossainco.commonkotlin.android.livedata

import android.arch.lifecycle.Observer

typealias Observe<T, R> = (T) -> R

fun <T> Observe<T, Any>.toObserverNotNull(): Observer<T> =
	Observer { it!!.let(this) }

fun <T> Observe<T, Any>.toObserver(): Observer<T> =
	Observer { it?.let(this) }
