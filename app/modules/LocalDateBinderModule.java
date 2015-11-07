package modules;

import com.google.inject.AbstractModule;
import play.Logger;

/**
 * LocalDateのバインダーの登録モジュール.
 * Created by nakamurajun on 2015/11/03.
 */
public class LocalDateBinderModule extends AbstractModule {

    @Override
    public void configure() {
        bind(LocalDateBinder.class).asEagerSingleton();
        //LocalDateBinder.register();
    }
}
