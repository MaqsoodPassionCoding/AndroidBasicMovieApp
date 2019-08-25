package com.msk.movies.di.module

import com.msk.movies.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFragment(): HomeFragment
}