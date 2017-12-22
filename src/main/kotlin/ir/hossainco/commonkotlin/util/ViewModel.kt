@file:Suppress("unused")

package ir.hossainco.commonkotlin.util

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import ir.hossainco.commonkotlin.Provider

/* source inspired from: https://proandroiddev.com/kotlin-delegates-in-android-development-part-2-2c15c11ff438 */
@Suppress("UNCHECKED_CAST")
inline fun <VM : ViewModel> viewModelFactory(crossinline provider: Provider<VM>) =
	object : ViewModelProvider.Factory {
		override fun <T : ViewModel> create(clazz: Class<T>) = provider() as T
	}

///* source inspired from: https://proandroiddev.com/kotlin-delegates-in-android-development-part-2-2c15c11ff438 */
//inline fun <reified VM : ViewModel> Fragment.viewModelProvider(crossinline provider: () -> VM)
//	= lazy { ViewModelProviders.of(this, viewModelFactory(provider)).get(VM::class.java) }

/* source inspired from: https://proandroiddev.com/kotlin-delegates-in-android-development-part-2-2c15c11ff438 */
inline fun <reified VM : ViewModel> Fragment.viewModelProvider(mode: LazyThreadSafetyMode = LazyThreadSafetyMode.NONE, crossinline provider: () -> VM)
	= lazy(mode) { ViewModelProviders.of(this, viewModelFactory(provider)).get(VM::class.java) }
