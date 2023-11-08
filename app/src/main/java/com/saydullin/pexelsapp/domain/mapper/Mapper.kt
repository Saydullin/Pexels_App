package com.saydullin.pexelsapp.domain.mapper

abstract class Mapper<From, To> {

    abstract fun map(from: From): To

}