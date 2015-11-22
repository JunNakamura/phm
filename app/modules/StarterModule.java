package modules;

import com.google.inject.AbstractModule;

/**
 * アプリ開始時にDIさせるクラスを扱うモジュール.
 * Created by nakamurajun on 2015/11/03.
 */
public class StarterModule extends AbstractModule {

    @Override
    public void configure() {
        bind(CustomDataBinder.class).asEagerSingleton();
    }
}
