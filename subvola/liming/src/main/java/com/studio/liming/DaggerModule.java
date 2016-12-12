package com.studio.liming;

import dagger.Module;
import dagger.Provides;

@Module
public class DaggerModule {

    @Provides static DomainObject provideDO() {
        return new DomainObject();
    }

    public static class DomainObject {
    }
}
