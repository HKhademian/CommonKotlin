package ir.hossainco.commonkotlin.android.livedata

import android.arch.lifecycle.Observer
import ir.hossainco.commonkotlin.provider.SingleProvider

typealias Observe<T, R> = SingleProvider<T, R>

inline fun <T> toObserver(crossinline observe: Observe<Any, T>): Observer<T>
	= Observer { it?.let(observe) }

inline fun <T> toObserverNotNull(crossinline observe: Observe<Any, T>): Observer<T>
	= Observer { it!!.let(observe) }
