package com.example.top100currencies.di

import dagger.Component
import com.example.top100currencies.activities.MainActivity
import com.example.top100currencies.fragments.CurrenciesListFragment
import com.example.top100currencies.mvp.presenter.CurrenciesPresenter
import com.example.top100currencies.mvp.presenter.LatestChartPresenter
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, RestModule::class, MvpModule::class, ChartModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(fragment: CurrenciesListFragment)

    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)
}