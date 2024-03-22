package com.dee.localdata

import org.koin.dsl.module

val localDataModule = module {
    single { LocalDataManager() }
}