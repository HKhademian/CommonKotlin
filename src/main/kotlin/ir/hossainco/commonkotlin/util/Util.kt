@file:Suppress("unused")

package ir.hossainco.commonkotlin.util

import ir.hossainco.commonkotlin.Block


fun <T> consume(result: T, block: Block): T {
	block()
	return result
}

fun consume(result: Boolean = true, block: Block)
	= consume<Boolean>(result, block)
