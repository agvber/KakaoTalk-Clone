package com.agvber.core.domain.fake

abstract class FakeModel<T> {
    protected abstract fun build() : T
    fun get() = build()
}