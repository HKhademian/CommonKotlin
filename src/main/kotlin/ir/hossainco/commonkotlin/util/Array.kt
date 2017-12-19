package ir.hossainco.commonkotlin.util

import ir.hossainco.commonkotlin.Provider

inline fun <T> Array<out T>.firstOrDefault(default: T, predicate: (T) -> Boolean) =
	this.firstOrNull(predicate) ?: default

inline fun <T> Array<out T>.firstOrDefault(default: Provider<T>, predicate: (T) -> Boolean) =
	this.firstOrNull(predicate) ?: default.provide()
