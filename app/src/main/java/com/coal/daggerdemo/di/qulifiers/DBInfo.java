package com.coal.daggerdemo.di.qulifiers;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.SOURCE)
public @interface DBInfo {
}
