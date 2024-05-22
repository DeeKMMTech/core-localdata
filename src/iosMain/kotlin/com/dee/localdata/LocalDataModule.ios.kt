package com.dee.localdata

import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Created by Hein Htet
 */

 fun localDataModule(): Module {
    return module {
        single { LocalDataManager() }
    }
}