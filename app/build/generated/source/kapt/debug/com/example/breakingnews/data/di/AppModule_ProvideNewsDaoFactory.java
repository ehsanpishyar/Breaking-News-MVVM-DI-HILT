// Generated by Dagger (https://dagger.dev).
package com.example.breakingnews.data.di;

import com.example.breakingnews.databse.NewsDatabase;
import com.example.breakingnews.databse.dao.NewsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideNewsDaoFactory implements Factory<NewsDao> {
  private final Provider<NewsDatabase> dbProvider;

  public AppModule_ProvideNewsDaoFactory(Provider<NewsDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDao(dbProvider.get());
  }

  public static AppModule_ProvideNewsDaoFactory create(Provider<NewsDatabase> dbProvider) {
    return new AppModule_ProvideNewsDaoFactory(dbProvider);
  }

  public static NewsDao provideNewsDao(NewsDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsDao(db));
  }
}
