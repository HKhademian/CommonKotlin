@file:Suppress("unused")

package ir.hossainco.commonkotlin

typealias Block = () -> Unit


fun Block.call()
	= this()

fun <T> consume(result: T, block: Block): T {
	block.call()
	return result
}

fun consume(result: Boolean = true, block: Block)
	= consume<Boolean>(result, block)
