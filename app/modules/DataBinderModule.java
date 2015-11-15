package modules;

import com.google.inject.AbstractModule;

/**
 * データバインダーの登録モジュール.
 * Created by nakamurajun on 2015/11/03.
 */
public class DataBinderModule extends AbstractModule {

    @Override
    public void configure() {
        bind(CustomDataBinder.class).asEagerSingleton();
    }
}
